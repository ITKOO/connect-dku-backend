package kr.itkoo.connectdkubackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.itkoo.connectdkubackend.dto.post.PostRequestDTO;
import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import kr.itkoo.connectdkubackend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
@Tag(name = "Post API", description = "포스트(게시물) API")
public class PostController {

    private final PostService postService;

    @Operation(summary = "포스트 생성")
    @PostMapping()
    public ResponseEntity<PostResponseDTO> select(@RequestBody PostRequestDTO dto) {
        return ResponseEntity.ok(postService.save(dto));
    }

    @Operation(summary = "포스트 전체 조회")
    @GetMapping()
    public ResponseEntity<List<PostResponseDTO>> selectAll() {
        return ResponseEntity.ok(postService.findAll());
    }

    @Operation(summary = "포스트 상세 조회")
    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDTO> select(@PathVariable Long id) {
        return ResponseEntity.ok(postService.findById(id));
    }
}

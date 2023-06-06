package kr.itkoo.connectdkubackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.itkoo.connectdkubackend.dto.user.LoginDTO;
import kr.itkoo.connectdkubackend.dto.user.UserRequestDTO;
import kr.itkoo.connectdkubackend.dto.user.UserResponseDTO;
import kr.itkoo.connectdkubackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "User API", description = "회원 API")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    @Operation(summary = "회원 조회")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("/signup")
    @Operation(summary = "회원 가입")
    public ResponseEntity<UserResponseDTO> save(@RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.save(dto).toResponse());
    }

    @PostMapping("/login")
    @Operation(summary = "로그인(회원이 아닐경우 500에러 발생)")
    public ResponseEntity<UserResponseDTO> save(@RequestBody LoginDTO dto) {
        return ResponseEntity.ok(userService.findByPlatformTypeAndPlatformId(dto));
    }
}

package kr.itkoo.connectdkubackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.itkoo.connectdkubackend.dto.matching.MatchingRequestDTO;
import kr.itkoo.connectdkubackend.dto.matching.MatchingResponseDTO;
import kr.itkoo.connectdkubackend.service.MatchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/match")
@Tag(name = "Matching API", description = "멘토멘티 매칭 API")
public class MatchingController {

    private final MatchingService matchingService;

    @Operation(summary = "멘토멘티 매칭 실행")
    @PostMapping
    public ResponseEntity<MatchingResponseDTO> match(@RequestBody MatchingRequestDTO dto) {
        return ResponseEntity.ok(matchingService.matchingTeam(dto));
    }

    @Operation(summary = "멘토멘티 매칭 조회")
    @GetMapping("/{userId}")
    public ResponseEntity<MatchingResponseDTO> select(@PathVariable Long userId) {
        return ResponseEntity.ok(matchingService.findByUserId(userId));
    }
}

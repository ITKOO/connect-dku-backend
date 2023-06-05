package kr.itkoo.connectdkubackend.controller;

import kr.itkoo.connectdkubackend.dto.user.UserRequestDTO;
import kr.itkoo.connectdkubackend.dto.user.UserResponseDTO;
import kr.itkoo.connectdkubackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<UserResponseDTO> save(@RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.save(dto).toResponse());
    }
}

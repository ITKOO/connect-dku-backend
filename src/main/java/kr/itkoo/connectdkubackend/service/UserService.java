package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.user.LoginDTO;
import kr.itkoo.connectdkubackend.dto.user.UserRequestDTO;
import kr.itkoo.connectdkubackend.dto.user.UserResponseDTO;
import kr.itkoo.connectdkubackend.model.User;
import kr.itkoo.connectdkubackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(UserRequestDTO dto) {
        return userRepository.save(dto.toUser());
    }

    public UserResponseDTO findById(Long id) {
        return userRepository.findById(id).orElseThrow().toResponse();
    }

    public UserResponseDTO findByPlatformTypeAndPlatformId(LoginDTO loginDTO) {
        return userRepository.findByPlatformTypeAndPlatformId(loginDTO.getPlatformType(), loginDTO.getPlatformId()).orElseThrow().toResponse();
    }
}

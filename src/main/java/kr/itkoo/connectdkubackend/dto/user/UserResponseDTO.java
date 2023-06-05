package kr.itkoo.connectdkubackend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long id;

    private int platformType;

    private String platformId;

    private String name;

    private String studentId;

    private int gender;

    private int age;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

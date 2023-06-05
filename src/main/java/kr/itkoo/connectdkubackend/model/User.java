package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import kr.itkoo.connectdkubackend.dto.user.UserResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel {
    private int platformType;

    private String platformId;

    private String name;

    private String studentId;

    private int gender;

    private int age;

    private String phoneNumber;

    public UserResponseDTO toResponse() {
        return UserResponseDTO.builder()
                .id(this.getId())
                .platformType(this.platformType)
                .platformId(this.platformId)
                .name(this.name)
                .studentId(this.studentId)
                .gender(this.gender)
                .age(this.age)
                .phoneNumber(this.phoneNumber)
                .updatedAt(this.getUpdatedAt())
                .createdAt(this.getCreatedAt()).build();
    }
}

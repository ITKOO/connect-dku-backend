package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.*;
import kr.itkoo.connectdkubackend.config.Gender;
import kr.itkoo.connectdkubackend.config.UserType;
import kr.itkoo.connectdkubackend.dto.user.UserResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int platformType;

    private String platformId;

    private String name;

    private String studentId;

    private UserType userType;

    private Gender gender;

    private int age;

    private String phoneNumber;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public UserResponseDTO toResponse() {
        return UserResponseDTO.builder()
                .id(this.getId())
                .platformType(this.platformType)
                .platformId(this.platformId)
                .name(this.name)
                .studentId(this.studentId)
                .userType(this.userType)
                .gender(this.gender)
                .age(this.age)
                .phoneNumber(this.phoneNumber)
                .updatedAt(this.getUpdatedAt())
                .createdAt(this.getCreatedAt()).build();
    }
}

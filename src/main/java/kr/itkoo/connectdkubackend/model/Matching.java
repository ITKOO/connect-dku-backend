package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.*;
import kr.itkoo.connectdkubackend.config.MatchingStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import kr.itkoo.connectdkubackend.config.UserType;
import kr.itkoo.connectdkubackend.dto.matching.MatchingResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Matching {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private UserType userType;

    private String userName;

    private Long teamId;

    private String teamName;
    
    private TeamType teamType;

    private MatchingStatus status;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public MatchingResponseDTO toResponse() {
        return MatchingResponseDTO.builder()
                .id(this.getId())
                .userName(this.userName)
                .teamId(this.teamId)
                .teamName(this.teamName)
                .teamType(this.teamType)
                .status(this.status)
                .createdAt(this.getCreatedAt())
                .updatedAt(this.getUpdatedAt()).build();
    }
}

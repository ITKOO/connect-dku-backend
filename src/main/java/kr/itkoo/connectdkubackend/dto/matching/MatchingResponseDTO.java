package kr.itkoo.connectdkubackend.dto.matching;

import kr.itkoo.connectdkubackend.config.MatchingStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MatchingResponseDTO {
    private Long id;
    private String userName;
    private Long teamId;
    private String teamName;
    private TeamType teamType;
    private MatchingStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

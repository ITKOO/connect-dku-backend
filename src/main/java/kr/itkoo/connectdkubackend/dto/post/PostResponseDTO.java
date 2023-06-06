package kr.itkoo.connectdkubackend.dto.post;

import kr.itkoo.connectdkubackend.config.MissionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PostResponseDTO {
    private Long id;

    private String title;

    private String content;

    private String imgUrl;

    private MissionStatus missionStatus;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

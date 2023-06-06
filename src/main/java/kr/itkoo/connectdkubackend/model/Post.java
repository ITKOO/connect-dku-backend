package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.*;
import kr.itkoo.connectdkubackend.config.MissionStatus;
import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String imgUrl;

    private MissionStatus missionStatus;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public PostResponseDTO toResponse() {
        return new PostResponseDTO(this.getId(), this.title, this.content, this.imgUrl, this.missionStatus,
                this.getCreatedAt(), this.getUpdatedAt());
    }
}

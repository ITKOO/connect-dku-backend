package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post extends BaseModel {
    private String title;

    private String content;

    private String imgUrl;

    private boolean isMissionComplete;

    public PostResponseDTO toResponse() {
        return new PostResponseDTO(this.getId(), this.title, this.content, this.imgUrl, this.isMissionComplete,
                this.getCreatedAt(), this.getUpdatedAt());
    }
}

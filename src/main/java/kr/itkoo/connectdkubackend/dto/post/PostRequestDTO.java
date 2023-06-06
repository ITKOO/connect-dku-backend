package kr.itkoo.connectdkubackend.dto.post;

import kr.itkoo.connectdkubackend.config.MissionStatus;
import kr.itkoo.connectdkubackend.model.Post;
import lombok.Data;

@Data
public class PostRequestDTO {
    private String title;

    private String content;

    private String imgUrl;

    private MissionStatus missionStatus;

    public Post toPost() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .imgUrl(this.imgUrl)
                .missionStatus(this.missionStatus).build();
    }

}

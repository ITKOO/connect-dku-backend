package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Matching extends BaseModel {
    private Long userId;

    private Long teamId;

    private String status;
}

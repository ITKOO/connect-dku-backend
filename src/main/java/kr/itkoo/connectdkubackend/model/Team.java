package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Team extends BaseModel {
    private String name;

    private String type;
}

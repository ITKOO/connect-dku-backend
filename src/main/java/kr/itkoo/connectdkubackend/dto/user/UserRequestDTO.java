package kr.itkoo.connectdkubackend.dto.user;

import kr.itkoo.connectdkubackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {
    private int platformType;

    private String platformId;

    private String name;

    private String studentId;

    private int gender;

    private int age;

    private String phoneNumber;

    public User toUser() {
        return User.builder()
                .platformType(this.platformType)
                .platformId(this.platformId)
                .name(this.name)
                .studentId(this.studentId)
                .gender(this.gender)
                .age(this.age)
                .phoneNumber(this.phoneNumber).build();
    }
}

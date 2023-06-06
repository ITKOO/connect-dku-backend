package kr.itkoo.connectdkubackend.dto.user;

import kr.itkoo.connectdkubackend.config.Gender;
import kr.itkoo.connectdkubackend.config.UserType;
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

    private UserType userType;

    private Gender gender;

    private int age;

    private String phoneNumber;

    public User toUser() {
        return User.builder()
                .platformType(this.platformType)
                .platformId(this.platformId)
                .name(this.name)
                .userType(this.userType)
                .studentId(this.studentId)
                .gender(this.gender)
                .age(this.age)
                .phoneNumber(this.phoneNumber).build();
    }
}

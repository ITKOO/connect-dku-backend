package kr.itkoo.connectdkubackend.dto.matching;

import kr.itkoo.connectdkubackend.config.TeamType;
import kr.itkoo.connectdkubackend.config.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatchingRequestDTO {
    private Long userId;
    private String userName;
    private UserType userType;
    private TeamType teamType;
}

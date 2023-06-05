package kr.itkoo.connectdkubackend.dto.matching;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatchingRequestDTO {
    private Long userId;
    private String type;
}

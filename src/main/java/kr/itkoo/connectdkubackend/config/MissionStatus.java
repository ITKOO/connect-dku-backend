package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MissionStatus {
    OK("성공"),
    FAIL("실패");
    private final String value;
}

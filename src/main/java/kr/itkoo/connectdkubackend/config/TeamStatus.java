package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TeamStatus {
    READY("구성 중"),
    COMPLETE("구성 완료");
    private final String value;
}

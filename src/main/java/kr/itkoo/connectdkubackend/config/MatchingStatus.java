package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MatchingStatus {
    READY("매칭 중"),
    COMPLETE("매칭 완료");
    private final String value;
}

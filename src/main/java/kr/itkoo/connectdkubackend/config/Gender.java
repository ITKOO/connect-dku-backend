package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {
    MALE("남자"),
    FEMALE("여자");
    private final String value;
}

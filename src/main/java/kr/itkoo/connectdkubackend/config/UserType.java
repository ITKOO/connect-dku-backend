package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum UserType {
    MENTOR("멘토"),
    MENTEE("멘티");
    private final String value;
}

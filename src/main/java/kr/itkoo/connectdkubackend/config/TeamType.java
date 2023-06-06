package kr.itkoo.connectdkubackend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TeamType {
    CODING("코천 선배"),
    POPULAR("인싸 선배"),
    ACTIVITY("활동러 선배"),
    STUDY("모범생 선배");
    private final String value;
}

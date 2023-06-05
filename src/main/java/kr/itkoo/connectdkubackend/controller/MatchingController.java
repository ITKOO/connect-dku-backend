package kr.itkoo.connectdkubackend.controller;

import kr.itkoo.connectdkubackend.service.MatchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/match")
public class MatchingController {

    private final MatchingService matchingService;

}

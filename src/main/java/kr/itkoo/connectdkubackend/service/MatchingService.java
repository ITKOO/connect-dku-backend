package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.matching.MatchingRequestDTO;
import kr.itkoo.connectdkubackend.dto.matching.MatchingResponseDTO;
import kr.itkoo.connectdkubackend.repository.MatchingRepository;
import kr.itkoo.connectdkubackend.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchingService {
    private final TeamRepository teamRepository;
    private final MatchingRepository teamMatchingRepository;

    // 1. 매칭할 팀이 있는지 탐색
    public MatchingResponseDTO matchingTeam(MatchingRequestDTO requestDTO) {
//        Team team = teamRepository.findTopByTypeOrderByIdAsc(requestDTO.getType())
        return null;


    }
    // 2. 없다면 팀 생성, 있다면 팀 구하기
    // 3. 팀 id를 매칭 테이블에 저장
}

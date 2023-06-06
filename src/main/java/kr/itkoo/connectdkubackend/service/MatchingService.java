package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.config.MatchingStatus;
import kr.itkoo.connectdkubackend.config.TeamStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import kr.itkoo.connectdkubackend.dto.matching.MatchingRequestDTO;
import kr.itkoo.connectdkubackend.dto.matching.MatchingResponseDTO;
import kr.itkoo.connectdkubackend.model.Matching;
import kr.itkoo.connectdkubackend.model.Team;
import kr.itkoo.connectdkubackend.repository.MatchingRepository;
import kr.itkoo.connectdkubackend.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MatchingService {
    private final TeamRepository teamRepository;
    private final MatchingRepository matchingRepository;

    public MatchingResponseDTO findByUserId(Long userId) {
        return matchingRepository.findByUserId(userId).orElseThrow().toResponse();
    }

    public MatchingResponseDTO matchingTeam(MatchingRequestDTO requestDTO) {
        // 1. 매칭할 팀이 있는지 탐색
        Team team = getTeamInfoByType(requestDTO.getTeamType());

        // 2. 해당 팀정보로 매칭 검색

        // 3. 멘토 2, 멘티 2 정원 확인
        int countByUserType = matchingRepository.countAllByUserTypeAndTeamTypeAndStatus(requestDTO.getUserType(), requestDTO.getTeamType(), MatchingStatus.READY);


        // 4. 매칭 생성
        Matching matching = matchingRepository.save(
                Matching.builder()
                        .userId(requestDTO.getUserId())
                        .userName(requestDTO.getUserName())
                        .teamId(team.getId())
                        .teamName(team.getName())
                        .teamType(team.getType())
                        .status(MatchingStatus.READY).build()
        );

        return matching.toResponse();
    }

    public Team getTeamInfoByType(TeamType teamType) {
        // 매칭 대기중인 팀이 있는지 확인 후 없다면 새로 생성
        Optional<Team> optionalTeam = teamRepository.findTopByTypeAndStatusOrderByIdAsc(teamType, TeamStatus.READY);
        return optionalTeam.orElseGet(() -> makeTeamByType(teamType));
    }

    public Team makeTeamByType(TeamType type) {
        return teamRepository.save(new Team(type + " 1팀", type, TeamStatus.READY));
    }
    // 2. 없다면 팀 생성, 있다면 팀 구하기
    // 3. 팀 id를 매칭 테이블에 저장
}

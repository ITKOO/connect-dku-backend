package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.config.MatchingStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import kr.itkoo.connectdkubackend.config.UserType;
import kr.itkoo.connectdkubackend.model.Matching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MatchingRepository extends JpaRepository<Matching, Long> {
    Optional<Matching> findById(Long id);
    
    Optional<Matching> findByUserId(Long userId);

    List<Matching> findAllByUserTypeAndTeamTypeAndStatus(UserType userType, TeamType teamType, MatchingStatus status);

    Integer countAllByUserTypeAndTeamTypeAndStatus(UserType userType, TeamType teamType, MatchingStatus status);
}

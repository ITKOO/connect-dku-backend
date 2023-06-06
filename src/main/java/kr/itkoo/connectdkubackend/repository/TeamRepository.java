package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.config.TeamStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import kr.itkoo.connectdkubackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Optional<Team> findById(Long id);

    Optional<Team> findTopByTypeAndStatusOrderByIdAsc(TeamType type, TeamStatus status);
}

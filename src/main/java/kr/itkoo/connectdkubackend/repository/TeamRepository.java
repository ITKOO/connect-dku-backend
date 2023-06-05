package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Optional<Team> findById(Long id);

    Optional<Team> findTopByTypeOrderByIdAsc(String type);
}

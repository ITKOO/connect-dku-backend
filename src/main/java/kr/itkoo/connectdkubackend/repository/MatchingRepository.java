package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.model.Matching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchingRepository extends JpaRepository<Matching, Long> {
    Optional<Matching> findById(Long id);
}

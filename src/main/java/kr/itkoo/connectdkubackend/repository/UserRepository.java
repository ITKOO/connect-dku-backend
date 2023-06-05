package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByPlatformTypeAndPlatformId(int platformType, String platformId);
}

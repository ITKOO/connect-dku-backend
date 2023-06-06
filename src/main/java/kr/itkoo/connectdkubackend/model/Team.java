package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.*;
import kr.itkoo.connectdkubackend.config.TeamStatus;
import kr.itkoo.connectdkubackend.config.TeamType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private TeamType type;

    private TeamStatus status;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    

    public Team(String name, TeamType type, TeamStatus status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }
}

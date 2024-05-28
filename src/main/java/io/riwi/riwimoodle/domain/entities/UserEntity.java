package io.riwi.riwimoodle.domain.entities;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import io.riwi.riwimoodle.utils.enums.RoleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @Column(nullable = false, length = 50)
    private String username;
    @Column(nullable = false, length = 255)
    private String password;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = true, length = 100)
    private String full_name;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;
}

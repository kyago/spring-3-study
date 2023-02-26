package com.github.kyago.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String email;

    private String firstname;

    private String lastname;

    private String phone;

    private String nickname;

    private String password;
}

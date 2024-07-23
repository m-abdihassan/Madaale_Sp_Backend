package com.example.MadaaleSp_MS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @Column(name = "user_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;

    @Column(name = "user_name",length = 255)
    private String username;
    @Column(name = "email",length = 255)
    private String email;

    @Column(name = "password",length = 255)
    private String password;
}

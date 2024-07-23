package com.example.MadaaleSp_MS.Repo;

import com.example.MadaaleSp_MS.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);

    Optional<User> findOneByEmailAndPassword(String email, String password);


//
//    Optional<User>FindOneByUsernameAndPassword(String username ,String password);
//    User FindUsername(String username);


}

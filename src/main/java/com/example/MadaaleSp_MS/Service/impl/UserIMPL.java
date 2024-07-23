package com.example.MadaaleSp_MS.Service.impl;

import com.example.MadaaleSp_MS.Dto.LoginDTO;
import com.example.MadaaleSp_MS.Dto.UserDTO;
import com.example.MadaaleSp_MS.Entity.User;
import com.example.MadaaleSp_MS.Repo.UserRepo;
import com.example.MadaaleSp_MS.Response.LoginMessage;
import com.example.MadaaleSp_MS.Service.Userservice;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserIMPL implements Userservice {
    private final UserRepo userRepo;

    public UserIMPL(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }
    private  final PasswordEncoder passwordEncoder;



    @Override
    public String addUser(UserDTO userDTO) {


        User user=new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),

                this.passwordEncoder.encode(userDTO.getPassword())


        );
        userRepo.save(user);

        return user.getUsername();
    }

    @Override
    public LoginMessage loginUser(LoginDTO loginDTO) {
        String msg="";
        User user1=userRepo.findByEmail(loginDTO.getEmail());
        if(user1!=null){
            String password=loginDTO.getPassword();
            String encodedPassword=user1.getPassword();
            Boolean isPwRight=passwordEncoder.matches(password,encodedPassword);
            if(isPwRight){
                Optional <User>user=userRepo.findOneByEmailAndPassword(loginDTO.getEmail(),encodedPassword);
                if(user.isPresent()){
                    return  new LoginMessage("Login Success",true);
                }else {
                    return  new LoginMessage("login failed ",false);
                }

            }else
            {
                return  new LoginMessage("password Not Match",false);
            }
        }else {
            return  new LoginMessage("Email not exist",false);
        }
    }


}

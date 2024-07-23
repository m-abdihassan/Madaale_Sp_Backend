package com.example.MadaaleSp_MS.Usercontroler;

import com.example.MadaaleSp_MS.Dto.LoginDTO;
import com.example.MadaaleSp_MS.Dto.UserDTO;
import com.example.MadaaleSp_MS.Response.LoginMessage;
import com.example.MadaaleSp_MS.Service.Userservice;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/Users")
public class Usercontroler {
    private final Userservice userservice;

    public Usercontroler(Userservice userservice) {
        this.userservice = userservice;
    }

    @PostMapping(path = "/save")
    public String saveUsere(@RequestBody UserDTO userDTO) {
        String Id = userservice.addUser(userDTO);
        return Id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginMessage loginMessage=userservice.loginUser(loginDTO);
        return ResponseEntity.ok(loginMessage);


    }
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        SecurityContextHolder.clearContext();
        return ResponseEntity.ok("Logged out successfully");
    }
}

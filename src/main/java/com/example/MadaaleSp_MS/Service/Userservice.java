package com.example.MadaaleSp_MS.Service;

import com.example.MadaaleSp_MS.Dto.LoginDTO;
import com.example.MadaaleSp_MS.Dto.UserDTO;
import com.example.MadaaleSp_MS.Response.LoginMessage;

public interface Userservice {
    String addUser(UserDTO user);

    LoginMessage loginUser(LoginDTO loginDTO);
}

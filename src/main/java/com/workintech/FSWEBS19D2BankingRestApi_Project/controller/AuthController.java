package com.workintech.FSWEBS19D2BankingRestApi_Project.controller;

import com.workintech.FSWEBS19D2BankingRestApi_Project.dto.RegisterResponse;
import com.workintech.FSWEBS19D2BankingRestApi_Project.dto.RegistrationMember;
import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Member;
import com.workintech.FSWEBS19D2BankingRestApi_Project.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationService authenticationService;

    @Autowired
    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }



    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegistrationMember registrationMember){

        Member registeredMember = authenticationService.register(registrationMember.email(), registrationMember.password());

        return new RegisterResponse(registrationMember.email(), "Account created successfully");
    }


}

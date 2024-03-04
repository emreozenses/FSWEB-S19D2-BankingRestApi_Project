package com.workintech.FSWEBS19D2BankingRestApi_Project.service;


import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Member;
import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Roles;
import com.workintech.FSWEBS19D2BankingRestApi_Project.repository.MemberRepository;
import com.workintech.FSWEBS19D2BankingRestApi_Project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class AuthenticationService {

    private MemberRepository memberRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;


    @Autowired
    public AuthenticationService(MemberRepository memberRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.memberRepository = memberRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public Member register (String email,String password){
        Optional<Member> byEmail = memberRepository.findByEmail(email);
        if(byEmail.isPresent()){
            throw new RuntimeException("Given user email is already exist! Email: "+email);
        }
        String encodedPassword = passwordEncoder.encode(password);
        Roles userRole = roleRepository.findByAuthority("USER").get();
        //Roles adminRole = roleRepository.findByAuthority("ADMIN").get();

        Set<Roles> rolesSet = new HashSet<>();
        rolesSet.add(userRole);
        //rolesSet.add(adminRole);

        Member member = new Member();
        member.setEmail(email);
        member.setPassword(encodedPassword);
        member.setAuthorities(rolesSet);

        return memberRepository.save(member);





    }

}

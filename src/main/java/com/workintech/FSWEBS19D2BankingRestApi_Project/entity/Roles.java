package com.workintech.FSWEBS19D2BankingRestApi_Project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "roles",schema = "fsweb")
public class Roles implements GrantedAuthority {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "authority")
    private String authority;



}

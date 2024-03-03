package com.workintech.FSWEBS19D2BankingRestApi_Project.repository;

import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles,Long> {


    @Query("SELECT r FROM Roles r WHERE r.authority=:authority")
    Optional<Roles> findByAuthority(String authority);
}

package com.workintech.FSWEBS19D2BankingRestApi_Project.repository;

import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts,Long> {
}

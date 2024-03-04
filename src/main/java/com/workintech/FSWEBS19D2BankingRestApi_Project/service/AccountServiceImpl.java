package com.workintech.FSWEBS19D2BankingRestApi_Project.service;

import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Accounts;
import com.workintech.FSWEBS19D2BankingRestApi_Project.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Accounts> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Accounts save(Accounts accounts) {
        return accountRepository.save(accounts);
    }
}

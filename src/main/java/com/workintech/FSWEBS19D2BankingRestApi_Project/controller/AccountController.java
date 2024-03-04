package com.workintech.FSWEBS19D2BankingRestApi_Project.controller;

import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Accounts;
import com.workintech.FSWEBS19D2BankingRestApi_Project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    public List<Accounts> findAll(){
        return accountService.findAll();
    }

    @PostMapping("/")
    public Accounts save(@RequestBody Accounts account){
        return accountService.save(account);
    }


}

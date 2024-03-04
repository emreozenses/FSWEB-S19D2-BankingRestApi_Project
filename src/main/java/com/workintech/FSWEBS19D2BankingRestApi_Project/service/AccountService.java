package com.workintech.FSWEBS19D2BankingRestApi_Project.service;

import com.workintech.FSWEBS19D2BankingRestApi_Project.entity.Accounts;

import java.util.List;

public interface AccountService {

    List<Accounts> findAll();

    Accounts save(Accounts accounts);




}

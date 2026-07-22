package org.example.account.controller;


import org.example.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {

        return new Account(
                1001,
                "Jyothirmai",
                50000
        );
    }
}
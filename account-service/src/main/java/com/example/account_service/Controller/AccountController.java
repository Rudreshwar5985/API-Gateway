package com.example.account_service.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    public String getAccount(@PathVariable Long id){
        return "Account details for customer:"+ id;
    }

    @GetMapping("/{id}/balance")
    public String getBalance(@PathVariable Long id){
        return "Available balance is 50000";
    }
}

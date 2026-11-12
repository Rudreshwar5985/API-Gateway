package com.example.transaction_service.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {


    @GetMapping("/{id}")
    public String getTransaction(@PathVariable Long id){
        return "Transaction: details  for Id:"+id;
    }

    @PostMapping("/transfer")
    public String transferMoney(){
        return "Money transfer received succesfully";
    }


}

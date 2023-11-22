package com.company.orm.controller;

import com.company.orm.Repo.CustomerRepo;
import com.company.orm.model.CustomerModel;
import com.company.orm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class Customer {

   @Autowired
    CustomerService customerService;

    @PostMapping(path = "/customer")
    public ResponseEntity<CustomerModel> createEmployee(@RequestBody CustomerModel customer) {
        return new ResponseEntity<>(customerService.createUserFeedback(customer), HttpStatus.CREATED);
    }
   /* @GetMapping(path = "/customer")
    public ResponseEntity<List<CustomerModel>> createEmployee() {
        return new ResponseEntity<>(customerRepo.findAll(), HttpStatus.CREATED);
    }*/
}

package com.company.orm.service;

import com.company.orm.Repo.CustomerRepo;
import com.company.orm.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;


    public CustomerModel createUserFeedback(CustomerModel customerModel) {
        return customerRepo.save(customerModel);
    }
}

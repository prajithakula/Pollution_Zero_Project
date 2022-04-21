package com.rentbyke.demo.services;


import com.rentbyke.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service

public class RepositoryService {

    @Autowired
    Environment env;

    @Autowired
    @Transactional(readOnly = true)
    public Employee getStudent() {



    }
}
package com.example.Internship.controller;

import com.example.Internship.model.RegistrationList;
import com.example.Internship.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register")
    public String addRegistration(@RequestBody RegistrationList registrationList){
        return registrationService.addRegistration(registrationList);
    }

    @GetMapping("/findRegistrations")
    public List<RegistrationList> getRegistrations(){
        return registrationService.getRegistrations();
    }
}

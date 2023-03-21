package com.example.Internship.service;

import com.example.Internship.model.RegistrationList;
import com.example.Internship.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public String addRegistration(RegistrationList registrationList){
        try{
            registrationRepository.save(registrationList);
        }catch (Exception e){
            return "not able to register";
        }
        return "successfully registered";
    }

    public List<RegistrationList> getRegistrations(){
        List<RegistrationList> ans = registrationRepository.findAll();
        return ans;
    }
}

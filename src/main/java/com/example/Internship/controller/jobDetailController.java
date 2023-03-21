package com.example.Internship.controller;

import com.example.Internship.DTO.JobDetailsDTO;
import com.example.Internship.model.JobDetails;
import com.example.Internship.service.JobDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class jobDetailController {

    @Autowired
    JobDetailsService jobDetailsService;

    @PostMapping("/addDetails")
    public String addDetails(@RequestBody JobDetailsDTO jobDetailsDTO){
       return jobDetailsService.addDetails(jobDetailsDTO);
    }

    @GetMapping("/findDetails")
    public JobDetails findDetails(@RequestParam("jobMnemonic") String jobMnemonic){
        return jobDetailsService.findDetails(jobMnemonic);
    }
}

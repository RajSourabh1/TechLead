package com.example.Internship.service;

import com.example.Internship.DTO.JobDetailsDTO;
import com.example.Internship.convertor.DtoToEntity;
import com.example.Internship.model.JobDetails;
import com.example.Internship.repository.JobDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class JobDetailsService {

    @Autowired
    JobDetailsRepository jobDetailsRepository;

    public String addDetails(JobDetailsDTO jobDetailsDTO){

        JobDetails jobDetails = DtoToEntity.DtoToDetailsEntity(jobDetailsDTO);
        try{
            jobDetailsRepository.save(jobDetails);
        }catch (Exception e){
            return "not added";
        }
        return "successfully added";
    }

    public JobDetails findDetails(String jobMnemonic){
        List<JobDetails> list = jobDetailsRepository.findAll();
        for(JobDetails jobDetails:list){
            if(Objects.equals(jobDetails.getJobMnemonic(), jobMnemonic))
                return jobDetails;
        }
        return null;
    }
}

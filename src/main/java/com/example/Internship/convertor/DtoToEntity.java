package com.example.Internship.convertor;

import com.example.Internship.DTO.JobDetailsDTO;
import com.example.Internship.model.JobDetails;

public class DtoToEntity {

    public static JobDetails DtoToDetailsEntity(JobDetailsDTO jobDetailsDTO){
        JobDetails jobDetails = JobDetails.builder()
                .jobMnemonic(jobDetailsDTO.getJobMnemonic())
                .jobSkill(jobDetailsDTO.getJobSkill())
                .designation(jobDetailsDTO.getDesignation())
                .numberOfPosition(jobDetailsDTO.getNumberOfPosition())
                .requestMedium(jobDetailsDTO.getRequestMedium())
                .location(jobDetailsDTO.getLocation())
                .jobType(jobDetailsDTO.getJobType())
                .jobSchedule(jobDetailsDTO.getJobSchedule())
                .contractType(jobDetailsDTO.getContractType())
                .JDName(jobDetailsDTO.getJDName())
                .hiringManagerInput(jobDetailsDTO.getHiringManagerInput())
                .maximumCTC(jobDetailsDTO.getMaximumCTC())
                .minimumCTC(jobDetailsDTO.getMinimumCTC())
                .currency(jobDetailsDTO.getCurrency()).build();

        return jobDetails;
    }
}

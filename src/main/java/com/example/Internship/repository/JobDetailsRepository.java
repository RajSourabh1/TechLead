package com.example.Internship.repository;

import com.example.Internship.DTO.JobDetailsDTO;
import com.example.Internship.model.JobDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface JobDetailsRepository extends JpaRepository<JobDetails,String>{

}

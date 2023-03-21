package com.example.Internship.repository;

import com.example.Internship.model.RegistrationList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationList,String> {

}

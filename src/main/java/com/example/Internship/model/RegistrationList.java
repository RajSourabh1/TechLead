package com.example.Internship.model;

import com.example.Internship.enums.RegistrationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "registrations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationList {

  private String registrationType;

  @Enumerated(value = EnumType.STRING)
  private RegistrationStatus registrationStatus;

  private String firstName;

  private String middleName;

  private String lastName;

  @Id
  private String email;

  private String phoneNo;

  private String organization;
}

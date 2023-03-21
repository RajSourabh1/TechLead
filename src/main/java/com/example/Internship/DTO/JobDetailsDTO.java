package com.example.Internship.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class JobDetailsDTO {

    private String jobMnemonic;

    private String jobSkill;

    private String designation;

    private int numberOfPosition;

    private String requestMedium;

    private String location;

    private String jobType;

    private String jobSchedule;

    private String contractType;

    private String JDName;

    private String hiringManagerInput;

    private int minimumCTC;

    private int maximumCTC;

    private String currency;
}

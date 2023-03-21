package com.example.Internship.model;

import com.example.Internship.enums.PublishStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "details")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobDetails {

    @Id
    private String jobMnemonic;

    @Enumerated(value = EnumType.STRING)
    private PublishStatus status;

    private String jobSkill;

    private long versionNumber;

    private String jobRole;

    private String designation;

    private int numberOfPosition;

    private String requestMedium;

    private String location;

    private String jobType;

    private String jobSchedule;

    private String contractType;

    private Date requestDate;

    private Date publishDate;

    private Date preferredJoinDate;

    private String JDName;

    private int previewViewDays;

    private String hiringSummary;

    private String hiringManagerInput;

    private int minimumCTC;

    private int maximumCTC;

    private String currency;
}

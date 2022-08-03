package com.example.HospitalManagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table

public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String patientname;
    @Column
    private int age;
    @Column
    private String gender;
    @Column
    private String address;
    @Column
    private String HealthIssuedetails;
    @Column
    private String dateofjoing;
    @Column
    private String pastTreatments;
    @Column
    private String dateofdischarge;

}

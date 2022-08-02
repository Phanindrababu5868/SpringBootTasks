package com.example.CustomerData.model;

import lombok.Data;
import lombok.Generated;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Data
@Entity
@Table
public class CustomerData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String fullname;
    @Column
    private long phonenumber;
    @Column
    private long aadharnumber;
    @Column
    private String adress;
    @Column
    private String dateofentry;
    @Column
    private String dateofexit;
}


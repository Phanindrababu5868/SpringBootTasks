package com.example.CustomerData.Repositry;

import com.example.CustomerData.model.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

public interface Customer_Repo extends JpaRepository<CustomerData,Integer> {
}

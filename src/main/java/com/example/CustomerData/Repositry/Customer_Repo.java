package com.example.CustomerData.Repositry;

import com.example.CustomerData.model.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface Customer_Repo extends JpaRepository<CustomerData,Integer> {
    Optional<CustomerData> findByEmail(String email);

}

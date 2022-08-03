package com.example.HospitalManagement.repositry;

import com.example.HospitalManagement.model.Records;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepo extends JpaRepository<Records,Integer> {
}

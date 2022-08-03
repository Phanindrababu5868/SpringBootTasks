package com.example.HospitalManagement.service;

import com.example.HospitalManagement.model.Records;

import java.util.List;

public interface Recordsservice {
    Records saveData(Records Data);
    List<Records> getAllData();

    Records getDataBYId(int id);
    Records updateData(Records Data,int id);
    void deleteData(int id);

}

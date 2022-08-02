package com.example.CustomerData.Service;

import com.example.CustomerData.model.CustomerData;

import java.util.List;

public interface service {
    CustomerData saveData(CustomerData Data);
    List<CustomerData> getAllData();
    CustomerData getDataBYId(int id);
    CustomerData updateData(CustomerData Data,int id);
    void deleteData(int id);
}

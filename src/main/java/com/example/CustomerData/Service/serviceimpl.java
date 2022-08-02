package com.example.CustomerData.Service;

import com.example.CustomerData.Repositry.Customer_Repo;
import com.example.CustomerData.model.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviceimpl implements service{
    @Autowired
    public Customer_Repo customer_repo;
    public serviceimpl(Customer_Repo customer_repo){
        this.customer_repo=customer_repo;
    }
    @Override
    public CustomerData saveData(CustomerData Data) {
        return customer_repo.save(Data);
    }

    @Override
    public List<CustomerData> getAllData() {
        return (List<CustomerData>) customer_repo.findAll();
    }

    @Override
    public CustomerData getDataBYId(int id) {
        return customer_repo.findById(id).orElseThrow();
    }

    @Override
    public CustomerData updateData(CustomerData Data, int id) {
        CustomerData existingData=customer_repo.findById(id).orElseThrow();

        existingData.setFullname(Data.getFullname());
        existingData.setPhonenumber(Data.getPhonenumber());
        existingData.setAadharnumber(Data.getAadharnumber());
        existingData.setAdress(Data.getAdress());
        existingData.setDateofentry(Data.getDateofentry());
        existingData.setDateofexit(Data.getDateofexit());
        customer_repo.save(existingData);
        return existingData;
    }

    @Override
    public void deleteData(int id) {
        customer_repo.findById(id).orElseThrow();
        customer_repo.deleteById(id);
    }
}

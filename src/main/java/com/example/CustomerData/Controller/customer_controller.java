package com.example.CustomerData.Controller;

import com.example.CustomerData.Service.service;
import com.example.CustomerData.model.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/CustomerData")
public class customer_controller {

    @Autowired
    private service custoservice;

    public customer_controller(service custoservice){
        this.custoservice= custoservice;
    }
    @PostMapping
    public ResponseEntity<CustomerData> saveData(@RequestBody CustomerData Data)
    {
        return new ResponseEntity<CustomerData>(custoservice.saveData(Data), HttpStatus.CREATED);
    }
    @GetMapping
    public List<CustomerData> getAllData()
    {
        return custoservice.getAllData();
    }
    @GetMapping("{id}")
    public ResponseEntity<CustomerData> getDataById(@PathVariable("id") int id)
    {
        return new ResponseEntity<CustomerData>(custoservice.getDataBYId(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<CustomerData> updateData(@PathVariable("id")int id,@RequestBody CustomerData Data)
    {
        return new ResponseEntity<CustomerData>(custoservice.updateData(Data,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id")int id)
    {
        custoservice.deleteData(id);
        return new ResponseEntity<String>("CustomerData data deleted successfully",HttpStatus.OK);
    }


}

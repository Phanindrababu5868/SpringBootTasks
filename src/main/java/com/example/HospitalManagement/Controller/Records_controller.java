package com.example.HospitalManagement.Controller;

import com.example.HospitalManagement.model.Records;
import com.example.HospitalManagement.service.Recordsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/HospitalRecords")

public class Records_controller {
    @Autowired
    private Recordsservice recordsservice;

    public Records_controller(Recordsservice recordsservice){
        this.recordsservice= recordsservice;
    }
    @PostMapping
    public ResponseEntity<Records> saveData(@RequestBody Records Data)
    {
        return new ResponseEntity<Records>(recordsservice.saveData(Data), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Records> getAllData()
    {
        return recordsservice.getAllData();
    }
    @GetMapping("{id}")
    public ResponseEntity<Records> getDataById(@PathVariable("id") int id)
    {
        return new ResponseEntity<Records>(recordsservice.getDataBYId(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Records> updateData(@PathVariable("id")int id,@RequestBody Records Data)
    {
        return new ResponseEntity<Records>(recordsservice.updateData(Data,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id")int id)
    {
        recordsservice.deleteData(id);
        return new ResponseEntity<String>("Patient data deleted successfully",HttpStatus.OK);
    }
}

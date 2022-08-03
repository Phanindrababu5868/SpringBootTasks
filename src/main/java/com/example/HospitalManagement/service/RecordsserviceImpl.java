package com.example.HospitalManagement.service;

import com.example.HospitalManagement.model.Records;
import com.example.HospitalManagement.repositry.RecordRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordsserviceImpl implements Recordsservice{
    RecordRepo recordRepo;
    public RecordsserviceImpl(RecordRepo recordREpo){
        this.recordRepo=recordREpo;
    }
    @Override
    public Records saveData(Records Data) {
        return recordRepo.save(Data);
    }

    @Override
    public List<Records> getAllData() {
        return (List<Records>) recordRepo.findAll();
    }

    @Override
    public Records getDataBYId(int id) {
        return recordRepo.findById(id).orElseThrow();
    }

    @Override
    public Records updateData(Records Data, int id) {
        Records existingData=recordRepo.findById(id).orElseThrow();

        existingData.setPatientname(Data.getPatientname());
        existingData.setAge(Data.getAge());
        existingData.setGender(Data.getGender());
        existingData.setAddress(Data.getAddress());
        existingData.setHealthIssuedetails(Data.getHealthIssuedetails());
        existingData.setDateofjoing(Data.getDateofjoing());
        existingData.setPastTreatments(Data.getPastTreatments());
        existingData.setDateofdischarge(Data.getDateofdischarge());
        recordRepo.save(existingData);
        return existingData;
    }

    @Override
    public void deleteData(int id) {
        recordRepo.findById(id).orElseThrow();
        recordRepo.deleteById(id);

    }
}


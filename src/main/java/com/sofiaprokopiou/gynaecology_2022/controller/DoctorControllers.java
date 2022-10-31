package com.sofiaprokopiou.gynaecology_2022.controller;


import com.sofiaprokopiou.gynaecology_2022.model.Doctor;
import com.sofiaprokopiou.gynaecology_2022.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DoctorControllers {
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctorList")
    public Iterable<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Doctor findDoctorById(@PathVariable Integer id){
        return doctorRepository.findDoctorById(id);
    }

//    @GetMapping("/find/{name}")
//    public Doctor findDoctorByName(@PathVariable String name){
//        return doctorRepository.findDoctorByName(name);
//    }

    @PostMapping("/add")
    public String addDoctor(@RequestBody Map<String,String> body){
        Doctor doctor = new Doctor();
        doctor.setName(body.get("name"));
        doctor.setEmail(body.get("email"));
        doctor.setJobSpecialty(body.get("jobSpecialty"));
        doctor.setPhone(body.get("phone"));
        doctor.setDoctorCode(body.get("doctorCode"));
        doctorRepository.save(doctor);
        return "Doctor inserted successfully";
    }
    @PutMapping("/update")
    public String updateCovidCase(@RequestBody Map<String,String> body){
        Doctor doctor = doctorRepository.findDoctorById(Integer.parseInt(body.get("id")));
        if (doctor!=null){
            doctor.setName(body.get("name"));
            doctor.setEmail(body.get("email"));
            doctor.setJobSpecialty(body.get("jobSpecialty"));
            doctor.setPhone(body.get("phone"));
            doctor.setDoctorCode(body.get("doctorCode"));
            doctorRepository.save(doctor);
        }
        return "Doctor updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String  deleteDoctor(@PathVariable Integer id) {
        doctorRepository.deleteById(id);
        return "The Doctor was deleted successfully";
    }
}

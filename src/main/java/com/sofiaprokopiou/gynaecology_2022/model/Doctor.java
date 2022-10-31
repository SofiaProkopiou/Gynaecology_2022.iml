package com.sofiaprokopiou.gynaecology_2022.model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String jobSpecialty;
    private String phone;
    private String doctorCode;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobSpecialty() {
        return jobSpecialty;
    }

    public void setJobSpecialty(String jobSpecialty) {
        this.jobSpecialty = jobSpecialty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

        public void setId(Integer id) {
        this.id = id;
    }
}

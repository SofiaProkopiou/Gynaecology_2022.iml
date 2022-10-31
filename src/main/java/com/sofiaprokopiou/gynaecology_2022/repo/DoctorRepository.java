package com.sofiaprokopiou.gynaecology_2022.repo;

import com.sofiaprokopiou.gynaecology_2022.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
    List<Doctor> findDoctorByName(@Param("name") String name);
    Doctor findDoctorById(Integer id);


}

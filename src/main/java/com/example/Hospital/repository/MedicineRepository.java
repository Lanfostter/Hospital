package com.example.Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.entity.MedicineEntity;

public interface MedicineRepository extends JpaRepository<MedicineEntity, Integer>{

}

package com.example.Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Hospital.entity.DoctorEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {
	@Query("select d from DoctorEntity d where d.name = :uname")
	List<DoctorEntity> getbyname(@Param("uname") String name);
}

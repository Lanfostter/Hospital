package com.example.Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Hospital.entity.NurseEntity;

public interface NurseRepository extends JpaRepository<NurseEntity, Integer> {
	@Query("select n from NurseEntity n where n.name = :uname")
	List<NurseEntity> getbyname(@Param("uname") String name);
}

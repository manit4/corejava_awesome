package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, String>{
	
//	public Optional<Laptop> findByStudentId(String studentId);

}

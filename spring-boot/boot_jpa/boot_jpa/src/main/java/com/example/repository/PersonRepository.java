package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Person;

public interface PersonRepository extends JpaRepository<Person, String>{

}

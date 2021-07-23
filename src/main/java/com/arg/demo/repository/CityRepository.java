package com.arg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arg.demo.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> { 
	
}  
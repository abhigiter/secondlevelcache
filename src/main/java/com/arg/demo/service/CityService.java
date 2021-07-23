package com.arg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arg.demo.entity.City;
import com.arg.demo.repository.CityRepository;

@Service
public class CityService {
	   
	   @Autowired  
	   private CityRepository cityRepository;  
	   
	   public City getCityById(Integer id){  
	     return cityRepository.findById(id).get();  
	   }  
	   
	   public City saveCity(City city){  
	     return cityRepository.save(city);  
	   }  
}

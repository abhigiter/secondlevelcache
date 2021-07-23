package com.arg.demo.entity;

import javax.persistence.*;  
import org.hibernate.annotations.CacheConcurrencyStrategy;  

@Entity(name = "city")  
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE) 
public class City {
	@Id  
	@Column(name = "id")  
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Integer id;  
	
	@Column(name = "name")  
	private String name;  
	
	@Column(name = "population")  
	private Long population;  
	
	public Integer getId() {  
	  return id;  
	}  
	
	public void setId(Integer id) {  
	  this.id = id;  
	}  
	
	public String getName() {  
	  return name;  
	}  
	
	public void setName(String name) {  
	  this.name = name;  
	}  
	
	public Long getPopulation() {  
	  return population;  
	}  
	
	public void setPopulation(Long population) {  
	  this.population = population;  
	}  
	
	@Override  
	public String toString() {  
	  return "City{" +  
	      "id=" + id +  
	      ", name='" + name + '\'' +  
	      ", population=" + population +  
	      '}';  
	}  
 }  

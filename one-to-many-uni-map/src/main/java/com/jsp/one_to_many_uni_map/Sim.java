package com.jsp.one_to_many_uni_map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String servise;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getServise() {
	return servise;
}
public void setServise(String servise) {
	this.servise = servise;
}


}

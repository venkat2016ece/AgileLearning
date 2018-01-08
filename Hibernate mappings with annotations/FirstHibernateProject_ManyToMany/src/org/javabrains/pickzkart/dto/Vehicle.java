package org.javabrains.pickzkart.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
private int VehicleId;
private String VehicleName;
@ManyToMany(mappedBy="vehicle")
private Collection<UserDetails> userList= new ArrayList<>();

public int getVehicleId() {
	return VehicleId;
}
public void setVehicleId(int vehicleId) {
	VehicleId = vehicleId;
}
public String getVehicleName() {
	return VehicleName;
}
public void setVehicleName(String vehicleName) {
	VehicleName = vehicleName;
}
public Collection<UserDetails> getUserList() {
	return userList;
}
public void setUserList(Collection<UserDetails> userList) {
	this.userList = userList;
}
 
}

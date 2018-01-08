package org.javabrains.pickzkart.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
private int VehicleId;
private String VehicleName;

private UserDetails user;
@ManyToOne
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
public UserDetails getUser() {
	return user;
}
public void setUser(UserDetails user) {
	this.user = user;
}
}

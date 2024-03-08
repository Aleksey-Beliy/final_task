package edu.training.it.final_task.logic;

import java.util.List;

import edu.training.it.final_task.entity.Vehicle;

public interface VehicleLogic {

	public void availableAdd(Vehicle vehicle) throws LogicException;

	public void rentedAdd(Vehicle vehicle) throws LogicException;
	
	public void returnCar(Vehicle vehicle, int id) throws LogicException;

	public void rentCar(Vehicle vehicle, int id) throws LogicException;

	public List<Vehicle> allAvailableCar() throws LogicException;

	public List<Vehicle> allRentedCar() throws LogicException;
	
	public void deleteCar(int id) throws LogicException;
	
	public List<Vehicle> find(String text) throws LogicException; 
}
 
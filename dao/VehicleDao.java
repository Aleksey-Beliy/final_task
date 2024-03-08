package edu.training.it.final_task.dao;

import java.util.List;

import edu.training.it.final_task.entity.Vehicle;

public interface VehicleDao {
	
	public void availableSave(Vehicle vehicle) throws DaoException;
	
	public void rentedSave(Vehicle vehicle) throws DaoException;
	
	public List<Vehicle> allRentedCar() throws DaoException;
	
	public List<Vehicle> allAvailableCar() throws DaoException;
	
	public void delete(int id) throws DaoException;
	
	public void rentCar(Vehicle vehicle, int id) throws DaoException;
	
	public void returnCar(Vehicle vehicle, int id) throws DaoException;
	
}

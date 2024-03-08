package edu.training.it.final_task.dao.impl;

import java.util.ArrayList;
import java.util.List;
import edu.training.it.final_task.dao.DaoException;
import edu.training.it.final_task.dao.VehicleDao;
import edu.training.it.final_task.entity.Vehicle;

public class FileVehicleDao implements VehicleDao {

	private FileSave fileSave = new FileSave();

	@Override
	public void availableSave(Vehicle vehicle) throws DaoException {

		fileSave.writeToFileAvailable(vehicle);

	}

	@Override
	public void rentedSave(Vehicle vehicle) throws DaoException {

		fileSave.writeToFileRented(vehicle);

	}

	@Override
	public List<Vehicle> allAvailableCar() throws DaoException {
		return fileSave.availableReadFromFile();
	}

	@Override
	public List<Vehicle> allRentedCar() throws DaoException {
		return fileSave.availableReadFromFile();
	}

	@Override
	public void delete(int id) throws DaoException {
		
		List<Vehicle> vehicle = new ArrayList<>();
		for (int i = 0; i < vehicle.size(); i++) {
			vehicle.remove(i);
		}
	}

	@Override
	public void rentCar(Vehicle vehicle, int id) throws DaoException{
//	List<Vehicle> result = new ArrayList<>();
//	for(Vehicle v: result) {
//		if(v.getId() == id) {
		fileSave.writeToFileRented(vehicle);
	}

	@Override
	public void returnCar(Vehicle vehicle, int id) throws DaoException {
		fileSave.writeToFileAvailable(vehicle);
	}
}

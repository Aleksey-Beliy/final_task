package edu.training.it.final_task.logic.impl;

import java.util.ArrayList;
import java.util.List;
import edu.training.it.final_task.dao.DaoException;
import edu.training.it.final_task.dao.DaoProvider;
import edu.training.it.final_task.dao.VehicleDao;
import edu.training.it.final_task.entity.Vehicle;
import edu.training.it.final_task.logic.LogicException;
import edu.training.it.final_task.logic.VehicleLogic;

public class VehicleLogicImpl implements VehicleLogic {

	private final DaoProvider provider = DaoProvider.getInstance();
	private final VehicleDao dao = provider.getVehicleDao();

	@Override
	public void availableAdd(Vehicle vehicle) throws LogicException {
		try {
			dao.availableSave(vehicle);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void rentedAdd(Vehicle vehicle) throws LogicException {
		try {
			dao.rentedSave(vehicle);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<Vehicle> allRentedCar() throws LogicException {
		try {
			return dao.allRentedCar();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<Vehicle> allAvailableCar() throws LogicException {
		try {
			return dao.allAvailableCar();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void rentCar(Vehicle vehicle, int id) throws LogicException {
		try {
			dao.rentCar(vehicle, id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void returnCar(Vehicle vehicle, int id) throws LogicException {
		try {
			dao.returnCar(vehicle, id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void deleteCar(int id) throws LogicException {
		try {
			dao.delete(id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<Vehicle> find(String text) throws LogicException {
		List<Vehicle> result = new ArrayList<>();
		List<Vehicle> vehicle;
		try {
			vehicle = dao.allAvailableCar();

		} catch (DaoException e) {
			throw new LogicException(e);
		}
		for (Vehicle v : vehicle) {
			if (isTextInVehicle(v, text)) {
				result.add(v);
			}
		}
		return result;
	}

	private boolean isTextInVehicle(Vehicle v, String text) throws LogicException {
		return v.getBrand().contains(text) || v.getModel().contains(text) || v.getYear().contains(text);
	}

}

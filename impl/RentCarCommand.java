package edu.training.it.final_task.controller.impl;

import edu.training.it.final_task.controller.Command;
import edu.training.it.final_task.entity.Vehicle;
import edu.training.it.final_task.logic.LogicException;
import edu.training.it.final_task.logic.LogicProvider;
import edu.training.it.final_task.logic.VehicleLogic;

public class RentCarCommand implements Command {

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final VehicleLogic logic = logicProvider.getVehicleLogic();

	@Override
	public String execute(String request) {
		String response = null;
		String[] params;
		Vehicle newVehicle;

		try {
			params = request.split("\n");
			newVehicle = new Vehicle();
			newVehicle.setRent(Boolean.parseBoolean(params[1].split("=")[1]));
			newVehicle.setId(Integer.parseInt(params[2].split("=")[1]));
			newVehicle.setBrand(params[3].split("=")[1]);
			newVehicle.setModel(params[4].split("=")[1]);
			newVehicle.setYear(params[5].split("=")[1]);
			newVehicle.setRentalRate(Integer.parseInt(params[6].split("=")[1]));
			newVehicle.setRentalDuration(Integer.parseInt(params[7].split("=")[1]));
			
			int id = Integer.parseInt(params[2].split("=")[1]);
				
			logic.rentCar(newVehicle, id);
			logic.deleteCar(id);
			response = "Авто арендовано.";
		} catch (LogicException e) {

			response = "Что-то пошло не так.";
		}

		return response;
	}

}
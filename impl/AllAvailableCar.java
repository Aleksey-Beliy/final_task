package edu.training.it.final_task.controller.impl;

import java.util.List;

import edu.training.it.final_task.controller.Command;
import edu.training.it.final_task.entity.Vehicle;
import edu.training.it.final_task.logic.LogicException;
import edu.training.it.final_task.logic.LogicProvider;
import edu.training.it.final_task.logic.VehicleLogic;

public class AllAvailableCar implements Command{

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final VehicleLogic logic = logicProvider.getVehicleLogic();

	@Override
	public String execute(String request) {
		String response;
		List<Vehicle> vehicle;

		try {
			vehicle = logic.allAvailableCar();
			response = "All available car:" + vehicle;
		} catch (LogicException e) {

			response = "Something went wrong. Try again.";
		}

		return response;

	}
}

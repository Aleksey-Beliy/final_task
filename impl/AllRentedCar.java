package edu.training.it.final_task.controller.impl;

import edu.training.it.final_task.controller.Command;
import edu.training.it.final_task.logic.LogicException;
import edu.training.it.final_task.logic.LogicProvider;
import edu.training.it.final_task.logic.VehicleLogic;

public class AllRentedCar implements Command {

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final VehicleLogic logic = logicProvider.getVehicleLogic();

	@Override
	public String execute(String request) {
		String response = null;

		try {
			response = "All rented car:" + logic.allRentedCar();
		} catch (LogicException e) {

			response = "Something went wrong. Try again.";
		}

		return response;

	}
}
package edu.training.it.final_task.controller;

import java.util.HashMap;
import java.util.Map;

import edu.training.it.final_task.controller.impl.AddVehicleCommand;
import edu.training.it.final_task.controller.impl.AllAvailableCar;
import edu.training.it.final_task.controller.impl.AllRentedCar;
import edu.training.it.final_task.controller.impl.NoSuchCommand;
import edu.training.it.final_task.controller.impl.RentCarCommand;
import edu.training.it.final_task.controller.impl.ReturnCarCommand;

public class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.ALL_RENTED_CAR, new AllRentedCar());
		repository.put(CommandName.ALL_AVAILABLE_CAR, new AllAvailableCar());
		repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
		repository.put(CommandName.ADD, new AddVehicleCommand());
//		repository.put(CommandName.ADD_RENTED, new AddRentedVehicleCommand());
		repository.put(CommandName.RETURN_CAR, new ReturnCarCommand());
		repository.put(CommandName.RENT_CAR, new RentCarCommand());

		/* repository.put(CommandName.FIND, new FindCommand()); */
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;

		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}

}
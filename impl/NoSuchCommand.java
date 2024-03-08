package edu.training.it.final_task.controller.impl;

import edu.training.it.final_task.controller.Command;

public class NoSuchCommand implements Command{

	@Override
	public String execute(String request) {
		return "The request failed.";
	}
}

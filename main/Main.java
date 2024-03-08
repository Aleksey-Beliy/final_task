package edu.training.it.final_task.main;

import edu.training.it.final_task.controller.Controller;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();

		String request;
		String response;

//		request = "ADD\nrent=false\nid=1\nbrand=bmw\nmodel=m5\nyear=2020\nrentalRate=2150";
//		response = controller.doAction(request);
//		System.out.println(response);

//		request = "ADD\nrent=false\nid=2\nbrand=mazda\nmodel=6-series\nyear=2010\nrentalRate=1000";
//		response = controller.doAction(request);
//		System.out.println(response);
//
//		request = "ADD\nrent=false\nid=3\nbrand=audi\nmodel=A6\nyear=2000\nrentalRate=800";
//		response = controller.doAction(request);
//		System.out.println(response);

		request = "RENT_CAR\nrent=true\nid=1\nbrand=bmw\nmodel=m5\nyear=2020\nrentalRate=250\nrentalDuration=2";
		response = controller.doAction(request);
		System.out.println(response);

//		request = "RETURN_CAR\nrent=false\nid=1\nbrand=bmw\nmodel=m5\nyear=2020\nrentalRate=250";
//		response = controller.doAction(request);
//		System.out.println(response);
	}
}

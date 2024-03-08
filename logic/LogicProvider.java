package edu.training.it.final_task.logic;

import edu.training.it.final_task.logic.impl.VehicleLogicImpl;

public final class LogicProvider {
	private static final LogicProvider instance = new LogicProvider();
	
	private LogicProvider() {}
	
	private VehicleLogic logic = new VehicleLogicImpl();
	
	public VehicleLogic getVehicleLogic() {
		return logic;
	}
	
	public static LogicProvider getInstance() {
		return instance;
	}
}
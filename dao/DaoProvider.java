package edu.training.it.final_task.dao;

import edu.training.it.final_task.dao.impl.FileVehicleDao;

public final class DaoProvider {
	private static final DaoProvider INSTANCE = new DaoProvider();
	
	private DaoProvider() {}
	
	private VehicleDao vehicleDao = new FileVehicleDao();
	
	
	public VehicleDao getVehicleDao() {
		return vehicleDao;
	}

	public static DaoProvider getInstance() {
		return INSTANCE;
	}
	

}
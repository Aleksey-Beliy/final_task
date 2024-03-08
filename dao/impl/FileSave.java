package edu.training.it.final_task.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.training.it.final_task.entity.Vehicle;

public class FileSave {

	private static final String fileAvailable = "available.txt";
	private static final String fileRented = "rented.txt";

	private List<Vehicle> vehicle = new ArrayList<>();

	synchronized public void writeToFileAvailable(Vehicle vehicle) {

		try (FileWriter fw = new FileWriter(fileAvailable, true)) {
			fw.write("/Rent=" + vehicle.getRent() + "/id=" + vehicle.getId() + "/Brand=" + vehicle.getBrand()
					+ "/Model=" + vehicle.getModel() + "/Year=" + vehicle.getYear() + "/RentalRate"
					+ vehicle.getRentalRate());
			fw.append("\n");
			fw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	synchronized public void writeToFileRented(Vehicle vehicle) {
		try (FileWriter fw = new FileWriter(fileRented, true)) {
			fw.write("/Rent=" + vehicle.getRent() + "/id=" + vehicle.getId() + "/Brand=" + vehicle.getBrand()
					+ "/Model=" + vehicle.getModel() + "/Year=" + vehicle.getYear() + "/RentalDuration"
					+ vehicle.getRentalDuration());
			fw.append("\n");
			fw.close();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	synchronized public List<Vehicle> availableReadFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader(fileAvailable))) {
			String[] params;
			String line = br.readLine();

			while (line != null) {
				params = line.split("&");
				while ((line = br.readLine()) != null) {
					params = line.split("&");
					Vehicle newVehicle = new Vehicle();
					newVehicle.setRent(Boolean.parseBoolean(params[0].split("=")[1]));
					newVehicle.setId(Integer.parseInt(params[1].split("=")[1]));
					newVehicle.setBrand(params[2].split("=")[1]);
					newVehicle.setModel(params[3].split("=")[1]);
					newVehicle.setYear(params[4].split("=")[1]);
					newVehicle.setRentalRate(Integer.parseInt(params[5].split("=")[1]));
					newVehicle.setRentalDuration(Integer.parseInt(params[6].split("=")[1]));

					vehicle.add(newVehicle);
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return vehicle;
	}

	synchronized public List<Vehicle> rentedReadFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader(fileRented))) {
			String[] params;
			String line = br.readLine();

			while (line != null) {
				params = line.split("&");
				Vehicle newVehicle = new Vehicle();
				newVehicle.setRent(Boolean.parseBoolean(params[0].split("=")[1]));
				newVehicle.setId(Integer.parseInt(params[1].split("=")[1]));
				newVehicle.setBrand(params[2].split("=")[1]);
				newVehicle.setModel(params[3].split("=")[1]);
				newVehicle.setYear(params[4].split("=")[1]);
				newVehicle.setRentalRate(Integer.parseInt(params[5].split("=")[1]));
				newVehicle.setRentalDuration(Integer.parseInt(params[6].split("=")[1]));

				vehicle.add(newVehicle);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return vehicle;
	}

//	public int readFromId() {
//
//		try (BufferedReader br = new BufferedReader(new FileReader(fileAvailable))) {
//			String[] params;
//			String line = br.readLine();
//
//			while (line != null) {
//				params = line.split("&");
//
//				int id = Integer.parseInt(params[0].split("=")[1]);
//			}
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//		return id;
//	}
}

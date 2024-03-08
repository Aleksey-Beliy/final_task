package edu.training.it.final_task.entity;

import java.util.Objects;

import edu.training.it.final_task.util.GenerateId;

public class Vehicle {

	private int id;
	private String brand;
	private String model;
	private String year;
	private int rentalRate;
	private int rentalDuration;
	private boolean rent;

	public Vehicle() {

	}

	public Vehicle(int id, boolean rent, String brand, String model, String year, int rentalRate, int rentalDuration) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.rentalRate = rentalRate;
		this.rentalDuration = rentalDuration;
		this.rent = rent;
	}

	public Vehicle(String brand,boolean rent, String model, String year, int rentalRate, int rentalDuration) {
		super();
		this.id = GenerateId.nextId();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.rentalRate = rentalRate;
		this.rentalDuration = rentalDuration;
		this.rent = rent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(int rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public boolean getRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, id, model, rent, rentalDuration, rentalRate, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && id == other.id && Objects.equals(model, other.model)
				&& rent == other.rent && rentalDuration == other.rentalDuration && rentalRate == other.rentalRate
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", rentalRate="
				+ rentalRate + ", rentalDuration=" + rentalDuration + ", rent=" + rent + "]";
	}

}

package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private String year;
	private Double price;
	
	/**
	 * constructor with no argument
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 * constructor with argument to initialize the object
	 */
	public Car(String make, String model, String year, Double price) {
		super();
	    this.make=make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
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
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	public void setYear(String year) {
		this.year = year;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	//hashcode method for make and model
	@Override
	public int hashCode() {
		return Objects.hash(make,model);
	}
	//equals method for make and model
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	//override method of comparable
	@Override
	public int compareTo(Car car) {
		
		return this.make.compareTo(car.make);
	
		
		
	}

}
	

	
	
	
	


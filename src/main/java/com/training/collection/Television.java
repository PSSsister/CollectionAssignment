package com.training.collection;

import java.util.Objects;

public class Television {
	
  private String company;
  private String type;
  private boolean _3Denabled;
  private Double price;
  
  
  
  
/**
 * constructor with no argument
 */
public Television() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param company
 * @param type
 * @param _3Denabled
 * @param price
 * constructor with argument to initialize the object
 */
public Television(String company, String type, boolean _3Denabled, Double price) {
	super();
	this.company = company;
	this.type = type;
	this._3Denabled = _3Denabled;
	this.price = price;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public boolean is_3Denabled() {
	return _3Denabled;
}

public void set_3Denabled(boolean _3Denabled) {
	this._3Denabled = _3Denabled;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}
// hashcode method for company,price and type
@Override
public int hashCode() {
	return Objects.hash(company,type,price);
	
}
//equals method for company,price and type
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Television other = (Television) obj;
	if (company == null) {
		if (other.company != null)
			return false;
	} else if (!company.equals(other.company))
		return false;
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}



  
  
  
}

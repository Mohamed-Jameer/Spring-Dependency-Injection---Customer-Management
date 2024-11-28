package com.ioc.classes;

import com.ioc.Interface.Customer;

public class GoldCustomer implements Customer {
	
	private String name;
	private String type;
	private Address address;
	
	

	public GoldCustomer(String name, String type, Address address) {
		super();
		this.name = name;
		this.type = type;
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}



//	public void setAddress(Address address) {
//		this.address = address;
//	}



	public String getName() {
		return name;
	}



//	public void setName(String name) {
//		this.name = name;
//	}



	public String getType() {
		return type;
	}



//	public void setType(String type) {
//		this.type = type;
//	}



	@Override
	public void defineCustomer() {
		
		System.out.println(name +" is a "+type+" from "+ address.getCity()+","+address.getState());

	}

}

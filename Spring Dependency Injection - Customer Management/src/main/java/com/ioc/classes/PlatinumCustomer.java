package com.ioc.classes;

import com.ioc.Interface.Customer;

public class PlatinumCustomer implements Customer {
	

	private String name;
	private String type;
    private Address address;
    
    


public PlatinumCustomer(String name, String type, Address address) {
		super();
		this.name = name;
		this.type = type;
		this.address = address;
	}






//	public void setAddress(Address address) {
//		this.address = address;
//	}


//	public void setName(String name) {
//		this.name = name;
//	}



//	public void setType(String type) {
//		this.type = type;
//	}



	public String getName() {
		return name;
	}






	public String getType() {
		return type;
	}






	public Address getAddress() {
		return address;
	}






	@Override
	public void defineCustomer() {
		System.out.println(name +" is a "+type+" from "+ address.getCity()+","+address.getState());

	}


}

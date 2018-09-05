package com.metacube.training;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is the class to declare, get and set collections.
 * @author Chirag Jain
 */
@SuppressWarnings("rawtypes")
public class JavaCollection {

	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;

	// a setter method to set List
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	// prints and returns all the elements of the list.
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	// a setter method to set Set
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	// prints and returns all the elements of the Set.
	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);
		return addressSet;
	}

	// a setter method to set Map
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	// prints and returns all the elements of the Map.
	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);
		return addressMap;
	}

}

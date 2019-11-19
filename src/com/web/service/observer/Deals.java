package com.web.service.observer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



public class Deals implements ISubject {
 public	 List<String> passengerEmail;
 public String dealName;
 public Timestamp fromDate;
 public Timestamp toDate;
 public String description;
 public double discount;
 private List<IObserver> iObserverList =new ArrayList<IObserver> ();
public List<IObserver> getiObserverList() {
	return iObserverList;
}
public void setiObserverList(List<IObserver> iObserverList) {
	this.iObserverList = iObserverList;
}

public List<String> getPassengerEmail() {
	return passengerEmail;
}
public void setPassengerEmail(List<String> passengerEmail) {
	this.passengerEmail = passengerEmail;
}
public String getDealName() {
	return dealName;
}
public void setDealName(String dealName) {
	this.dealName = dealName;
}
public Timestamp getFromDate() {
	return fromDate;
}
public void setFromDate(Timestamp fromDate) {
	this.fromDate = fromDate;
}
public Timestamp getToDate() {
	return toDate;
}
public void setToDate(Timestamp toDate) {
	this.toDate = toDate;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
@Override
public void registerPassenger(IObserver iObserver) {
	
	this.iObserverList.add(iObserver);
}
@Override
public void removePassenger(IObserver iObserver) {
	
	this.iObserverList.remove(iObserver);
}
@Override
public int notifyPassenger() {

	for(IObserver dealObserver :this.iObserverList){

        for(String themail : passengerEmail) {
            dealObserver.update(dealName, themail);
        }
	}

	return iObserverList.size();
}

 
}

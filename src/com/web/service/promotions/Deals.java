package com.web.service.promotions;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.web.pojo.*;

public class Deals extends DealMaster  implements ISubject {
	
	 private List<IObserver> iObserverList =new ArrayList<IObserver> ();
	 
	 private String dealName;
	 private String availablity;
	  

public List<IObserver> getiObserverList() {
	return iObserverList;
}
public void setiObserverList(List<IObserver> iObserverList) {
	this.iObserverList = iObserverList;
}

public Deals(String dealName,String availablity){
	super();
	this.dealName=dealName;
	this.availablity=availablity;
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

 System.out.println("All subscribers are notified when the deal goes online ");
	for(IObserver dealObserver :this.iObserverList){

            dealObserver.update(this.availablity);
        
	}

	return iObserverList.size();
}
public String getDealName() {
	return dealName;
}
public void setDealName(String dealName) {
	this.dealName = dealName;
}
public String getAvailablity() {
	return availablity;
}
public void setAvailablity(String availablity) {
	this.availablity = availablity;
	notifyPassenger();
}

 
}

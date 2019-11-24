package com.web.service.observer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.web.pojo.*;

public class Deals extends DealMaster  implements ISubject {
private	 List<String> passengerEmail;
 
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
            dealObserver.update(this.dealName, themail);
        }
	}

	return iObserverList.size();
}

 
}

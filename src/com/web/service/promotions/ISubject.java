package com.web.service.promotions;

public interface ISubject {
public void registerPassenger(IObserver iObserver);
public void removePassenger(IObserver iObserver);
public void notifyPassenger();
}

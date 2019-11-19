package com.web.service.observer;

public interface ISubject {
public void registerPassenger(IObserver iObserver);
public void removePassenger(IObserver iObserver);
public int notifyPassenger();
}

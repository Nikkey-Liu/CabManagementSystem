package com.web.service.verification;

public interface Command {
	public abstract void execute();
	public abstract void undo(); 	
}

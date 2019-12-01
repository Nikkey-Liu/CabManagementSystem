package com.web.service.verification;

import java.util.*;

public class CarInvoker{
	
	
	private Stack<Command> history ; 
	
	public CarInvoker(){
		history = new Stack<Command>(); 
	}
	
	public void executeCommand(Command cmd){
		cmd.execute();
		history.push(cmd); 
	}
	
	public void undo(){		//undo 
		Command lastCommand = history.pop();
		lastCommand.undo(); 
	}
	 
	

}
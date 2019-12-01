package com.web.service.verification;

import java.util.*;

public class CarInvoker_ImplementedByList{
	
	private List<Command> history;
	private int commandIndex;
	
	public CarInvoker_ImplementedByList(){
		history = new ArrayList<Command>();
		commandIndex = history.size();
	}
	
	public void executeCommand(Command cmd){
		cmd.execute();
		history.add(cmd);
		commandIndex = history.size() -  1; 	
	}
	
	public void undo(){		//undo
		if(commandIndex > 0) {
			Command lastCommand = history.get(commandIndex--);
			lastCommand.undo();
		}
	}
	

}
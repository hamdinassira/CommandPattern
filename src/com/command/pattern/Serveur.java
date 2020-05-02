package com.command.pattern;
/**
 * 
 * author: Hamdi Nassira
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	List<CommandNourrit> cmd=new ArrayList<CommandNourrit>();
	
	public void addCommand(CommandNourrit c) {
		cmd.add(c);
		
	}
	
	public void buy() {
		for(CommandNourrit cmdNourrit:cmd) {
			cmdNourrit.execute();
			System.out.println("Vendu");
		}
		cmd.clear();
		
	}

}

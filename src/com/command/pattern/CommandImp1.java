package com.command.pattern;

/**
 * 
 * author: Hamdi Nassira
 *
 */

public class CommandImp1 implements CommandNourrit{
	Cuisinier cuisinier;
	public CommandImp1(Cuisinier cuis) {
		// TODO Auto-generated constructor stub
		this.cuisinier=cuis;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cuisinier.preparRepas1();
		
	}

}

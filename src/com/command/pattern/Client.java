package com.command.pattern;
/**
 * 
 * author: Hamdi Nassira
 *
 */

import com.command.pattern.Cuisinier;
import com.command.pattern.Serveur;
import com.command.pattern.CommandNourrit;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuisinier c=new Cuisinier();
		CommandImp1 cmd1=new CommandImp1(c);
		CommandImp2 cmd2=new CommandImp2(c);
		Serveur s=new Serveur();
		s.addCommand(cmd1);
		s.addCommand(cmd2);
		s.buy();
		System.out.println("********************");
		s.addCommand(cmd1);
		s.buy();
		

	}

}

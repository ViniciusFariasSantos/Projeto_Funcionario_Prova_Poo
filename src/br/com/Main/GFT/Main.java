package br.com.Main.GFT;

import br.com.Funcionario.GFT.*;

public class Main {

	public static void main(String[] args) {
		 
		Gestor G = new Gestor("Paulo",30, 20000.00);		
		Supervisor S = new Supervisor("Jean", 40, 10000.00);
		Vendedor V= new Vendedor("André", 25, 5000.00);
		
		S.bonificacao();
		V.bonificacao();
		G.bonificacao();
	
	
	}

}

package br.com.Funcionario.GFT;

public class Gestor extends Funcionario {

public Gestor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

public void bonificacao() {
		
	double boni = 10000.00;
	
	System.out.println("---------------------------------------------");
	System.out.println("Seu Salario anterior  : " + Salario );
	System.out.println("Seu Salario atual é  :  " +(Salario + boni) );
	System.out.println("Você recebeu  "+ boni + "  mil de Bonificação ");
	
}

}

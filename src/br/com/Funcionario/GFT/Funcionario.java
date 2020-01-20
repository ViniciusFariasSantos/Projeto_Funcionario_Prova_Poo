package br.com.Funcionario.GFT;

public abstract class Funcionario {
	String nome;
	int Idade;
	double Salario;
	
	public Funcionario(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		Idade = idade;
		Salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public void bonificacao() {
		
	}
	
}

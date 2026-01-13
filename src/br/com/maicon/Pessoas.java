package br.com.maicon;

public class Pessoas {
	
	private String nome;
	
	private String email;
	
	private int idade;
	
	private double altura;
	
	
	public Pessoas ( String nome, String email, int idade, double altura) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.altura = altura;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double altura() {
		return altura;
	}
	
public void setNome (String nome) {
	this.nome = nome;
}



	@Override
	public String toString() {
		return " Nome: " + nome + "| Email: " + email + " | Idade: " + idade + " | Altura: " + altura;
	}
	
	
	
	
	
	
	}
	
	
	



package app;

public class Cliente {
	private int cpf;
	private String nome;

	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() { // para toString ele retorna nome
		return this.nome; 
	}

	public Cliente(int cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}
	
}

package app;

public class Cliente {
	private int cpf;
	private String nome;
	private String Sobrenome;
	private String email;
	private String telefone;
	
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
	
	public String getSobrenome() {
		return Sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() { // para toString ele retorna nome
		return this.nome; 
	}

	public Cliente(int cpf, String nome, String sobrenome, String email, String telefone) {
		
		this.cpf = cpf;
		this.nome = nome;
		Sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Cliente(int cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(int cpf) {
		
		this.cpf = cpf;
	}
}

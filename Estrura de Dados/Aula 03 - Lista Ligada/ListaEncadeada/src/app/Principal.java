package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionarValor("AC");
		lista.adicionarValor("BA");
		lista.adicionarValor("CE");
		lista.adicionarValor("DF");
		
		lista.getTamanho();
		
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		System.out.println("Tamanho: " + lista.getTamanho());
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.posicaoValor(i).getValor());
		}
		
		lista.removerValor("BA");
		lista.removerValor("AC");
		lista.removerValor("CE");
		lista.removerValor("DF");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.adicionarValor("AC");
		lista.adicionarValor("BA");
		lista.adicionarValor("CE");
		lista.adicionarValor("DF");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.removerValor("BA");
		lista.removerValor("AC");
		lista.removerValor("CE");
		lista.removerValor("DF");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		
	}
}

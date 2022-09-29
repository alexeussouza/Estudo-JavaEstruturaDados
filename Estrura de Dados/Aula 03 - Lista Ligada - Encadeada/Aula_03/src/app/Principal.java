package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaLigada lista = new ListaLigada(); // estanciando uma nova lista
		
		lista.adicionar("AC");
		lista.adicionar("DF");
		lista.adicionar("CE");
		lista.adicionar("MS");
		
		System.out.println("\nTamanho: " +  lista.getTamanho());
		System.out.println("\nPrimeiro: " +  lista.getPrimeiro().getValor());
		System.out.println("\nUltimo: " +  lista.getUltimo().getValor());
		System.out.println("\n");
		
		System.out.println("\n" + lista.getPosicao(0));
		System.out.println(lista.getPosicao(0).getValor());
		
		System.out.println("\n" + lista.getPosicao(1));
		System.out.println(lista.getPosicao(1).getValor());
		
		System.out.println("\n" + lista.getPosicao(2));
		System.out.println(lista.getPosicao(2).getValor());
		
		System.out.println("\n" + lista.getPosicao(3));
		System.out.println(lista.getPosicao(3).getValor());
		
		System.out.println("\n");
		
		lista.remover("AC");
	}
}

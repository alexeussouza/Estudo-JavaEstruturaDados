package app;

public class Main_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaGenerica<String> lista = new ListaGenerica<String>();
		
		lista.adicionarElemento("AC");
		lista.adicionarElemento("AM");
		lista.adicionarElemento("BA");
		lista.adicionarElemento("CE");
		
		System.out.println("Lista Ligada\n");
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.procurarElemento(i).getValor());
		}
		
		System.out.println("\nPrimeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		System.out.println("\nTamanho: " + lista.getTamanho());
		
		lista.removerElemento("AC");
		lista.removerElemento("AM");
		lista.removerElemento("BA");
		lista.removerElemento("CE");
		System.out.println("\nTamanho: " + lista.getTamanho());

	}
}

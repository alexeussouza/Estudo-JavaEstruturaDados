package app;

public class Main_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ListaGenerica<Integer> lista = new ListaGenerica<Integer>();
		
		lista.adicionarElemento(2);
		lista.adicionarElemento(4);
		lista.adicionarElemento(6);
		lista.adicionarElemento(8);
		lista.adicionarElemento(10);
		
		System.out.println("Lista Ligada\n");
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.procurarElemento(i).getValor());
		}
		
		System.out.println("\nPrimeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.removerElemento(2);
		lista.removerElemento(4);
		lista.removerElemento(6);
		lista.removerElemento(8);
		lista.removerElemento(10);
		System.out.println("\nFunção remover executada!");
		System.out.println("Tamanho: " + lista.getTamanho());

	}
}

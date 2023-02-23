package app;

public class Main_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaGenerica<Cliente> cliente = new ListaGenerica<Cliente>();
		
		cliente.adicionarElemento(new Cliente(123, "alexandre"));
		cliente.adicionarElemento(new Cliente(124, "maria"));
		cliente.adicionarElemento(new Cliente(125, "jose"));
		cliente.adicionarElemento(new Cliente(126, "marcos"));
		
		System.out.println("Lista Ligada\n");
		for (int i = 0; i < cliente.getTamanho(); i++) {
			System.out.println(cliente.procurarElemento(i).getValor());
		}
		
		System.out.println("\nPrimeiro: " + cliente.getPrimeiro().getValor());
		System.out.println("Ultimo: " + cliente.getUltimo().getValor());
		System.out.println("Tamanho: " + cliente.getTamanho());
		
		System.out.println("\nFunção Remover Executada!");
		cliente.removerElemento(cliente.procurarElemento(0).getValor());
		cliente.removerElemento(cliente.procurarElemento(1).getValor());
		cliente.removerElemento(cliente.procurarElemento(2).getValor());
		cliente.removerElemento(cliente.procurarElemento(3).getValor());
		//cliente.removerElemento((Cliente) cliente.procurarElemento(2).getValor());
		//cliente.removerElemento((Cliente) cliente.procurarElemento(1).getValor());
		
		
		System.out.println("Lista Ligada\n");
		
		
		for (int i = 0; i < cliente.getTamanho(); i++) {
			cliente.removerElemento((Cliente) cliente.procurarElemento(i).getValor());
		}
		
		System.out.println("Primeiro: " + cliente.getPrimeiro().getValor());
		System.out.println("Ultimo: " + cliente.getUltimo().getValor());
		System.out.println("Tamanho: " + cliente.getTamanho());
	}
}

package app;

public class ListaLigada {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
		
		tamanho = 0;
	}
	
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	
	public Elemento getUltimo() {
		return ultimo;
	}
	
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String novoValor) {
		
		Elemento novoElemento  = new Elemento(novoValor);
		
		if(primeiro == null && ultimo == null) {
			
			primeiro = novoElemento;
			ultimo = novoElemento;
		}
		else {
			
			ultimo.setProximo(novoElemento);
			ultimo = novoElemento;
		}
		tamanho++;
		
	}
	
	public void remover(String valorProcurado) {
		
		int cont=0;
		
		Elemento atual = this.primeiro; 
		
		for (int i = 0; i < this.getTamanho(); i++) {
			
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
				
				
				
			}	
		}
	}
	
	public Elemento getPosicao(int posicao) {
		
		Elemento atual = primeiro;
		for (int i = 0; i < posicao; i++) {
			
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}	
		} 
		return atual;
	}
}

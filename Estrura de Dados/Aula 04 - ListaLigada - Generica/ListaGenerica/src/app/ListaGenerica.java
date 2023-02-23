package app;

public class ListaGenerica<TIPO> { // lista generica, equivalente a lista LinkedList do Java
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;
	
	public ListaGenerica(){
		tamanho = 0;
	}

	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento<TIPO> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento<TIPO> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
public void adicionarElemento(TIPO valor) {
		
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		
		if(primeiro == null && ultimo == null) {
			primeiro = novoElemento;
			ultimo = novoElemento;
		}else {
			ultimo.setProximo(novoElemento);
			ultimo = novoElemento;
		}
		tamanho++;
	}
	
	public void removerElemento(TIPO valor) {
		
		Elemento atual = primeiro; // atual recebe valor do primeiro
		Elemento anterior = null;
		if(atual.getValor().equals(valor)) {
			for (int i = 0; i < getTamanho(); i++) { //Varre toda a lista procurando o valor
				if(primeiro == null && ultimo == null) {
					primeiro = null;
					ultimo = null;
					
				}else if(atual == primeiro) {
					 primeiro = atual.getProximo();
					 atual.setProximo(null); // setproximo do primeiro sempre será null
					
				}else if(atual == ultimo) {
					ultimo = anterior;
					anterior.setProximo(null); //anterior do ultimo sempre sera null
				}else {
					
					anterior.setProximo(atual.getProximo());
					anterior = atual.getProximo();
					atual = null;
				}
				
				tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento procurarElemento(int posicao) {
		
		Elemento atual = primeiro; // atual recebe valor do primeiro
		
		for (int i = 0; i < posicao; i++) { //Varre a lista até a posição informada
			if(atual.getProximo() != null)
				atual = atual.getProximo();
		}
		return atual;
	}
}
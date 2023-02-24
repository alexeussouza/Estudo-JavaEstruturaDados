package app;

public class ListaGenerica<TIPO> { // lista generica, equivalente a lista LinkedList do Java
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;
	
	public ListaGenerica(){
		this.tamanho = 0;
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
		
		if(this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}
	
	public void removerElemento(TIPO valorProcurado) {
		
		Elemento<TIPO> atual = this.primeiro; // atual recebe valor do primeiro
		Elemento<TIPO> anterior = null;
		if(atual.getValor().equals(valorProcurado)) {
			for (int i = 0; i < this.getTamanho(); i++) { //Varre toda a lista procurando o valor
				if(this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
					
				}else if(atual == this.primeiro) {
					 this.primeiro = atual.getProximo();
					 atual.setProximo(null); // setproximo do primeiro sempre será null
					
				}else if(atual == this.ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null); //anterior do ultimo sempre sera null
				}else {
					
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento procurarElemento(int posicao) {
		
		Elemento atual = this.primeiro; // atual recebe valor do primeiro
		
		for (int i = 0; i < posicao; i++) { //Varre a lista até a posição informada
			if(atual.getProximo() != null)
				atual = atual.getProximo();
		}
		return atual;
	}
}

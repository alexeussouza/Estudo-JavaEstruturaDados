package app;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = new int[10];
		
		//vetor é inicializado com 0 em todas posições
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor na posicao [" + i + "]: " + vetor[i]);
		}
		
		System.out.println("\n\nInicializando o vetor\n");
		
		vetor[0] = 3;
		vetor[1] = 7;
		vetor[2] = 15;
		vetor[3] = 20;
		vetor[4] = 25;
		vetor[5] = 33;
		vetor[6] = 43;
		vetor[7] = 73;
		vetor[8] = 18;
		vetor[9] = 21;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor na posicao [" + i + "]: " + vetor[i]);
		}

	}

}

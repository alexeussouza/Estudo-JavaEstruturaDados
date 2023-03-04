package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor =  new int[10];
		int aux=0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 10);
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] =aux;
				}
			}
			
		}
		System.out.println("\n\nVetor em Ordem");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
	}

}

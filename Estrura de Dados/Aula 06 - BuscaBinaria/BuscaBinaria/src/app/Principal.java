package app;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listaBinaria = new int[8];
		
		for (int i = 0; i < listaBinaria.length; i++) {
			listaBinaria[i] =  i * 2;
			System.out.println(listaBinaria[i]);
		}
		
		System.out.println("Qual numero vc busca? ");
		Scanner leitor = new Scanner(System.in);
		int valorBuscado = leitor.nextInt();
		boolean achou = false;
		int inicio =0;
		int meio =0;
		int fim = listaBinaria.length  -1;
		
		while(inicio <= fim) {
			
			meio = (int) ((inicio + fim) /2);
			if(listaBinaria[meio] == valorBuscado) {
				achou = true;
				break;
			}else if(listaBinaria[meio] < valorBuscado ) {
				inicio = meio + 1;
				
			}else if(listaBinaria[meio] > valorBuscado) {
				fim = meio -1;
				
			}
		}
		
		if(achou)
			System.out.println("Achou!");
		else
			System.out.println("Não achou!");

	}

}

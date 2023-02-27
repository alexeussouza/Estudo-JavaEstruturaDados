package app;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listaLinear = new int[6];
		
		for (int i = 0; i < listaLinear.length; i++) {
			
			listaLinear[i] = (int) (Math.random() * 61);
			System.out.println(listaLinear[i]);
		}
		
		System.out.println("Digite um numero: ");
		Scanner leitor = new Scanner(System.in);
		int valorBuscado = leitor.nextInt();
		boolean achou = false;
		for (int i = 0; i < listaLinear.length; i++) {	
			if(listaLinear[i] == valorBuscado) {
				achou = true;
				break;
			}
		}
		
		if(achou)
			System.out.println("achou");
		else
			System.out.println("Não achou");
		
	}
}

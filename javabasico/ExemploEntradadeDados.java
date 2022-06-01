package javabasico;

import java.util.Scanner;

public class ExemploEntradadeDados {

	public static void main(String[] args) {
		
		//Inserir dados via teclado
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um valor:");
			int valor1=sc.nextInt();
			
			System.out.println("Digite um valor:");
			int valor2=sc.nextInt();
			
			int resultado= valor1+valor2;
					
			System.out.println("O valor do resultado é: "+resultado);
		}

	}

}

/* Apostila Faccat  
7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo.  */

package javabasico;

import java.util.Scanner;

public class SetimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da base do retângulo:");
		int base = sc.nextInt();
		
		System.out.println("Digite o número da altura do retângulo:");
		int altura = sc.nextInt();
		
		int area = base*altura;
		
		System.out.println("O valor da área é: "+area);
		
		sc.close();
	
	}

}

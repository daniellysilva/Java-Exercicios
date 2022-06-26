/*Apostila Manzano
 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.*/

package ifelse;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int valor1 = ler.nextInt();
		
		System.out.println("Digite outro número:");
		int valor2 = ler.nextInt();
		
		if (valor1>valor2) {
			System.out.println("A diferença do maior para o menor é: "+(valor1-valor2));
		} else {
			System.out.println("A diferença do maior para o menor é: "+(valor2-valor1));
		}
		
		ler.close();

	}

}

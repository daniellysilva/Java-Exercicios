/*Apostila Manzano
 * 1) Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do maior pelo menor valor.*/

package ifelse;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int valor1 = ler.nextInt();
		
		System.out.println("Digite outro n�mero:");
		int valor2 = ler.nextInt();
		
		if (valor1>valor2) {
			System.out.println("A diferen�a do maior para o menor �: "+(valor1-valor2));
		} else {
			System.out.println("A diferen�a do maior para o menor �: "+(valor2-valor1));
		}
		
		ler.close();

	}

}

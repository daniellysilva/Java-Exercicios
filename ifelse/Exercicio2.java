/*Apostila Manzano
 * 2)Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o n�mero lido como sendo um
valor positivo, ou seja, o programa dever� apresentar o m�dulo de um n�mero fornecido. Lembre-se
de verificar se o n�mero fornecido � menor que zero; sendo, multiplique-o por -1.*/

package ifelse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int numero = ler.nextInt();
		
		if (0<=numero) {
			System.out.println("O n�mero "+numero+" � positivo");
		} else {
			System.out.println("O n�mero "+(numero*-1)+" � positivo");
		}
		
		ler.close();
		
	}

}

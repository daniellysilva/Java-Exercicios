/*Apostila Manzano
 * 2)Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.*/

package ifelse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = ler.nextInt();
		
		if (0<=numero) {
			System.out.println("O número "+numero+" é positivo");
		} else {
			System.out.println("O número "+(numero*-1)+" é positivo");
		}
		
		ler.close();
		
	}

}

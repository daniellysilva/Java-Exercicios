/*Apostila Manzano
 * 1)Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer.*/

package lacoderepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int i = 1;
		
		System.out.println("Digite um n�mero:");
		int numero = ler.nextInt();
		
		while (i<11) {
			System.out.println(numero+" X "+i+" = "+(numero*i));
			i++;
			
		ler.close();
		}

	}

}

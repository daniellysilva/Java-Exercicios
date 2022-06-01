/* Apostila Manzano  
15) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
Volume =pi *Raio^2 * Altura     */

package javabasico;

import java.util.Scanner;

public class DecimoSextoPrograma {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da lata:");
		int altura = sc.nextInt();
		
		System.out.println("Digite o raio da lata:");
		int raio = sc.nextInt();
		
		float volume =(float) ((raio*raio)*altura*3.1);
		
		System.out.println("O valor do volume da lata é: "+volume);
		
		sc.close();


	}

}

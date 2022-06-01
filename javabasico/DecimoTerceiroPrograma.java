/* Apostila Faccat  
12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):    */

package javabasico;

import java.util.Scanner;

public class DecimoTerceiroPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		int fahrenheit = sc.nextInt();
		
		float celsius = (fahrenheit-32) * 5/9;
		
		System.out.println("O valor convertido fica: "+celsius+" graus.");
		
		sc.close();

	}

}

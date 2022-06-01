/*Apostila Manzano
 * 26)Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e
D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro
valor, e o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma
(variável S) do segundo com o quarto valor.*/

package javabasico;

import java.util.Scanner;

public class VigesimoSetimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor3 = sc.nextInt();
		
		System.out.println("Digite o último valor:");
		int valor4 = sc.nextInt();
		
		int produto = valor1*valor3;
		int soma = valor2+valor4;
		
		System.out.println("O resultado do produto com as variáveis A e C: "+produto+". O resultado da soma com as variáveis B e D: "+soma+".");
		
		sc.close();
	}

}

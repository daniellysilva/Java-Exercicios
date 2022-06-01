/* Apostila Manzano
 * 20)Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
VOLUME = COMPRIMENTO * LARGURA * ALTURA.*/

package javabasico;

import java.util.Scanner;

public class VigesimoPrimeiroPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa:");
		int comprimento = sc.nextInt();
		
		System.out.println("Digite a largura da caixa:");
		int largura = sc.nextInt();
		
		System.out.println("Digite a altura da caixa:");
		int altura = sc.nextInt();
		
		int volume = comprimento*largura*altura;
		
		System.out.println("O volume da caixa retagular é: "+volume);
		
		sc.close();

	}

}

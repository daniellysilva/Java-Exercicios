/*Apostila Manzano
 * 24)Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final �
soma dos quadrados dos tr�s valores lidos.*/

package javabasico;

import java.util.Scanner;

public class VigesimoQuinto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		System.out.println("Digite o �ltimo valor:");
		int valor3 = sc.nextInt();
		
		int resultado = (valor1*valor1)+(valor2*valor2)+(valor3*valor3);
		
		System.out.println("O resultado final ser�: "+resultado);
		
		sc.close();

	}

}

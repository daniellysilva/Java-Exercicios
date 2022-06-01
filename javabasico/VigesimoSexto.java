/*Apostila Manzano
 *25)Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
quadrado da soma dos três valores lidos.*/

package javabasico;

import java.util.Scanner;

public class VigesimoSexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		int valor2 = sc.nextInt();
		
		System.out.println("Digite o último valor");
		int valor3 = sc.nextInt();
		
		int resultado = (valor1+valor2+valor3)*(valor1+valor2+valor3);
		
		System.out.println("O resultado final será: "+resultado);
		
		sc.close();
		
	}

}

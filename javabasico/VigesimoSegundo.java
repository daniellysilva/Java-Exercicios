/*Apostila Manzano
 * 27)Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
segundo.*/

package javabasico;

import java.util.Scanner;

public class VigesimoSegundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		int resultado = valor1-valor2;
		int resultadofinal = resultado*resultado;
		
		System.out.println("O valor final é: "+resultadofinal);
		
		sc.close();

	}

}

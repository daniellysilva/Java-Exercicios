/* Apostila Manzano
 * 18)Ler dois valores (inteiros, reais ou caracteres) para as vari�veis A e B, e efetuar a troca dos valores de
forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da
vari�vel A. Apresentar os valores trocados*/

package javabasico;

import java.util.Scanner;

public class DecimoNonoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		int aux = valor2;
		valor2 = valor1;
		valor1 = aux;
		
		System.out.println("Os valores trocados fica: "+valor1+" e "+valor2);
		
		sc.close();
						
	}

}
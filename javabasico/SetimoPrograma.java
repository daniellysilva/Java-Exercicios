/* Apostila Faccat  
7) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a
�rea do ret�ngulo.  */

package javabasico;

import java.util.Scanner;

public class SetimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero da base do ret�ngulo:");
		int base = sc.nextInt();
		
		System.out.println("Digite o n�mero da altura do ret�ngulo:");
		int altura = sc.nextInt();
		
		int area = base*altura;
		
		System.out.println("O valor da �rea �: "+area);
		
		sc.close();
	
	}

}

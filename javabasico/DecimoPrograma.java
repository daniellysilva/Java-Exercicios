/* Apostila Faccat  
9) Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
Calcular e escrever o valor do novo sal�rio  */

package javabasico;

import java.util.Scanner;

public class DecimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do seu funcion�rio:");
		int salarioantigo = sc.nextInt();
		
		System.out.println("Digite a porcetagem do reajuste do seu funcion�rio:");
		int reajuste = sc.nextInt();
		
		float salarionovo = salarioantigo * reajuste/100 + salarioantigo;
		
		System.out.println("O sal�rio atual do seu funcion�rio �: "+salarionovo);
		
		sc.close();

	}

}

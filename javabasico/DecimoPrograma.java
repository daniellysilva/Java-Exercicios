/* Apostila Faccat  
9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário  */

package javabasico;

import java.util.Scanner;

public class DecimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário do seu funcionário:");
		int salarioantigo = sc.nextInt();
		
		System.out.println("Digite a porcetagem do reajuste do seu funcionário:");
		int reajuste = sc.nextInt();
		
		float salarionovo = salarioantigo * reajuste/100 + salarioantigo;
		
		System.out.println("O salário atual do seu funcionário é: "+salarionovo);
		
		sc.close();

	}

}

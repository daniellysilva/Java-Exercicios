/*Apostila Manzano
 * 28)Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).*/

package javabasico;

import java.util.Scanner;

public class VigesimoOitavo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual do seu funcionário:");
		int salarioatual = sc.nextInt();
		
		System.out.println("Digite o novo reajuste do seu funcionário:");
		int reajuste = sc.nextInt();
		
		int salarionovo = (salarioatual*reajuste/100)+salarioatual;
		
		System.out.println("O salário novo do seu funcionário será: "+salarionovo+" reais.");
		
		sc.close();
	}

}

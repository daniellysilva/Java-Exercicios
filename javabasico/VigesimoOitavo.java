/*Apostila Manzano
 * 28)Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do
percentual de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).*/

package javabasico;

import java.util.Scanner;

public class VigesimoOitavo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio atual do seu funcion�rio:");
		int salarioatual = sc.nextInt();
		
		System.out.println("Digite o novo reajuste do seu funcion�rio:");
		int reajuste = sc.nextInt();
		
		int salarionovo = (salarioatual*reajuste/100)+salarioatual;
		
		System.out.println("O sal�rio novo do seu funcion�rio ser�: "+salarionovo+" reais.");
		
		sc.close();
	}

}

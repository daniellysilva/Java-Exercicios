/*Apostila Manzano
 * 23)Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário, para que seja apresentado o valor em moeda americana.*/

package javabasico;

import java.util.Scanner;

public class VigesimoQuarto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos reais tem:");
		float quantidadereal = sc.nextInt();
		
		System.out.println("Digite a cotação do dólar agora:");
		float cotacaodolar = sc.nextFloat();
		
		float dinheirodolar = (quantidadereal/cotacaodolar);
		
		System.out.println("O dinheiro convertido ficará: "+dinheirodolar+" doláres.");
		
		sc.close();
	}

}

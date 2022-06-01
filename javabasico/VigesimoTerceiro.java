/*Apostila Manzano
 * 22)Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.*/

package javabasico;

import java.util.Scanner;

public class VigesimoTerceiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos dólares tem:");
		float quantidadedolar = sc.nextInt();
		
		System.out.println("Digite a cotação do dólar agora:");
		float cotacaodolar = sc.nextFloat();
		
		float dinheiroreal = (quantidadedolar*cotacaodolar);
		
		System.out.println("O dinheiro convertido ficará: "+dinheiroreal+" reais.");
		
		sc.close();
	}

}

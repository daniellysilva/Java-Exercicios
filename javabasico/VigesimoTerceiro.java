/*Apostila Manzano
 * 22)Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em
d�lar. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.*/

package javabasico;

import java.util.Scanner;

public class VigesimoTerceiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos d�lares tem:");
		float quantidadedolar = sc.nextInt();
		
		System.out.println("Digite a cota��o do d�lar agora:");
		float cotacaodolar = sc.nextFloat();
		
		float dinheiroreal = (quantidadedolar*cotacaodolar);
		
		System.out.println("O dinheiro convertido ficar�: "+dinheiroreal+" reais.");
		
		sc.close();
	}

}

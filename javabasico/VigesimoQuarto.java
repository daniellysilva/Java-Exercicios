/*Apostila Manzano
 * 23)Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em
real. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel
com o usu�rio, para que seja apresentado o valor em moeda americana.*/

package javabasico;

import java.util.Scanner;

public class VigesimoQuarto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos reais tem:");
		float quantidadereal = sc.nextInt();
		
		System.out.println("Digite a cota��o do d�lar agora:");
		float cotacaodolar = sc.nextFloat();
		
		float dinheirodolar = (quantidadereal/cotacaodolar);
		
		System.out.println("O dinheiro convertido ficar�: "+dinheirodolar+" dol�res.");
		
		sc.close();
	}

}

/* Apostila Faccat  
7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.   */

package javabasico;

import java.util.Scanner;

public class OitavoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Digite quantos meses tem:");
		int meses = sc.nextInt();
		
		System.out.println("Digite quantos dias tem:");
		int dias = sc.nextInt();
		
		int resultado = (idade*365)+(meses*30)+dias;
		
		System.out.println("Você tem "+resultado+" dias.");
		
		sc.close();
		
	}

}

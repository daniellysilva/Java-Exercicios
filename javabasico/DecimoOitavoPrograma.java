/* Apostila Manzano  
17) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTACAO = VALOR + (VALOR * TAXA/100) * TEMPO).   */

package javabasico;

import java.util.Scanner;

public class DecimoOitavoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação que está atrasada:");
		int valor = sc.nextInt();
		
		System.out.println("Digite o valor da taxa da prestação que está atrasada:");
		int taxa = sc.nextInt();
		
		System.out.println("Digite quantos dias a prestação está atrasada:");
		int dia = sc.nextInt();
		
		int prestacao = valor + (valor*taxa/100) * dia;
		
		System.out.println("O valor da prestação está: "+prestacao);
		
		sc.close();

	}

}

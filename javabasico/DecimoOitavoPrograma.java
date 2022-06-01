/* Apostila Manzano  
17) Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula
PRESTACAO = VALOR + (VALOR * TAXA/100) * TEMPO).   */

package javabasico;

import java.util.Scanner;

public class DecimoOitavoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da presta��o que est� atrasada:");
		int valor = sc.nextInt();
		
		System.out.println("Digite o valor da taxa da presta��o que est� atrasada:");
		int taxa = sc.nextInt();
		
		System.out.println("Digite quantos dias a presta��o est� atrasada:");
		int dia = sc.nextInt();
		
		int prestacao = valor + (valor*taxa/100) * dia;
		
		System.out.println("O valor da presta��o est�: "+prestacao);
		
		sc.close();

	}

}

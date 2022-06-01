/* Apostila Faccat  
8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores  */

package javabasico;

import java.util.Scanner;

public class NonoPrograma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o total de eleitores tem na sua cidade:");
		int eleitor = sc.nextInt();
		
		System.out.println("Digite o total de eleitores que votaram no nulo na sua cidade:");
		int nulo = sc.nextInt();
		
		System.out.println("Digite o total de eleitores que votaram no branco na sua cidade:");
		int branco = sc.nextInt();
		
		System.out.println("Digite o total de eleitores que votaram no válido na sua cidade:");
		int valido = sc.nextInt();
		
		int resultadonulo = 100*nulo/eleitor;
		int resultadobranco = 100*branco/eleitor;
		int resultadovalido = 100*valido/eleitor;
		
		System.out.println("A porcetagem de votos nulos na sua cidade é: "+resultadonulo+"%");
		System.out.println("A porcetagem de votos brancos na sua cidade é: "+resultadobranco+"%");
		System.out.println("A porcetagem de votos válidos na sua cidade é: "+resultadovalido+"%");
		
		sc.close();
	}

}

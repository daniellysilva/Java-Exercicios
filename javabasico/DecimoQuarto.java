/* Apostila Faccat  
13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é:     */

package javabasico;

import java.util.Scanner;

public class DecimoQuarto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da primeira prova do seu aluno:");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a nota da segunda prova do seu aluno:");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a nota da terceira prova do seu aluno:");
		int nota3 = sc.nextInt();
		
		float notafinal = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("A nota final do seu aluno é: "+notafinal);
		
		sc.close();

	}

}

/* Apostila Faccat  
13) Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia
final �:     */

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
		
		System.out.println("A nota final do seu aluno �: "+notafinal);
		
		sc.close();

	}

}

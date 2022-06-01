/*Apostila Manzano
19)Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
multiplicação e apresentar doze resultados de saída.*/

package javabasico;

import java.util.Scanner;

public class VigesimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		int A = sc.nextInt();
		
		System.out.println("Digite o valor B");
		int B = sc.nextInt();
		
		System.out.println("Digite o valor C");
		int C = sc.nextInt();
		
		System.out.println("Digite o valor D");
		int D = sc.nextInt();
	
		System.out.println("A adição de A e B será: "+(A+B)+".");
		System.out.println("A adição de A e C será: "+(A+C)+".");
		System.out.println("A adição de A e D será: "+(A+D)+".");
		System.out.println("A adição de B e C será: "+(B+C)+".");
		System.out.println("A adição de B e D será: "+(B+D)+".");
		System.out.println("A adição de C e D será: "+(C+D)+".");
		
		System.out.println("A multiplicação de A e B será: "+(A*B)+".");
		System.out.println("A multiplicação de A e C será: "+(A*C)+".");
		System.out.println("A multiplicação de A e D será: "+(A*D)+".");
		System.out.println("A multiplicação de B e C será: "+(B*C)+".");
		System.out.println("A multiplicação de B e D será: "+(B*D)+".");
		System.out.println("A multiplicação de C e D será: "+(C*D)+".");
		
		sc.close();
	}

}

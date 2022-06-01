/*Apostila Manzano
19)Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na
utiliza��o do conceito da propriedade distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de
multiplica��o e apresentar doze resultados de sa�da.*/

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
	
		System.out.println("A adi��o de A e B ser�: "+(A+B)+".");
		System.out.println("A adi��o de A e C ser�: "+(A+C)+".");
		System.out.println("A adi��o de A e D ser�: "+(A+D)+".");
		System.out.println("A adi��o de B e C ser�: "+(B+C)+".");
		System.out.println("A adi��o de B e D ser�: "+(B+D)+".");
		System.out.println("A adi��o de C e D ser�: "+(C+D)+".");
		
		System.out.println("A multiplica��o de A e B ser�: "+(A*B)+".");
		System.out.println("A multiplica��o de A e C ser�: "+(A*C)+".");
		System.out.println("A multiplica��o de A e D ser�: "+(A*D)+".");
		System.out.println("A multiplica��o de B e C ser�: "+(B*C)+".");
		System.out.println("A multiplica��o de B e D ser�: "+(B*D)+".");
		System.out.println("A multiplica��o de C e D ser�: "+(C*D)+".");
		
		sc.close();
	}

}

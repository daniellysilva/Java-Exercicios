/*Apostila Manzano
 * 3)Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 5. Se o aluno n�o
foi aprovado, indicar uma mensagem informando esta condi��o. Apresentar junto das mensagens o
valor da m�dia do aluno para qualquer condi��o.*/

package ifelse;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a nota da primeira prova do seu aluno:");
		int nota1 = ler.nextInt();
		
		System.out.println("Digite a nota da segunda prova do seu aluno:");
		int nota2 = ler.nextInt();
		
		System.out.println("Digite a nota da terceira prova do seu aluno:");
		int nota3 = ler.nextInt();
		
		System.out.println("Digite a nota da quarta prova do seu aluno:");
		int nota4 = ler.nextInt();
		
		int notafinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notafinal >= 5) {
			System.out.println("O aluno foi APROVADO por "+notafinal);
		} else {
			System.out.println("O aluno foi REPROVADO por "+notafinal);
		}
		
	
		ler.close();
		
	}

}

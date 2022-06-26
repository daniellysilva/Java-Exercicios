/*Apostila Manzano
 * 4)Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 7. Se o valor da
m�dia for menor que 7, solicitar a nota de exame, somar com o valor da m�dia e obter nova m�dia.
Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta
condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para qualquer condi��o.*/

package ifelse;

import java.util.Scanner;

public class Exercicio4 {

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
		
		if (notafinal >= 7) {
			System.out.println("O aluno foi APROVADO por "+notafinal);
		} else {
			System.out.println("O aluno precisa fazer uma recupera��o pela nota "+notafinal);
			System.out.println("Qual foi a nota de recupera��o do seu aluno?");
			int recuperacao = ler.nextInt();
			
			if (recuperacao>=5) {
				System.out.println("O aluno foi APROVADO pelo exame de recupera��o por "+recuperacao);
			} else {
				System.out.println("O aluno foi REPROVADO pelo exame de recupera��o por "+recuperacao);
			}
		}
		
	
		ler.close();
		
	}

}

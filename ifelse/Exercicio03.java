/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.*/

package faccat;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas maças você comprou:");
		int maca = sc.nextInt();
		
		if (maca<12) {
			float total = (float) (maca * 1.30) ;
			System.out.println("O preço final das maças é: "+total);
		} else if (maca==12) {
			float total = (float) (maca * 1) ;
			System.out.println("O preço final das maças é: "+total);
		}

	}

}

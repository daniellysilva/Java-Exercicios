/* Apostila Faccat  
10) O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor.   */

package javabasico;

import java.util.Scanner;

public class DecimoPrimeiroPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro na f�brica:");
		int valordocarro = sc.nextInt();
		
		int distribuidor = valordocarro*28/100;
		int imposto = valordocarro*45/100;
		int valortotalcarro = valordocarro+distribuidor+imposto;
		
		System.out.println("O custo final do carro ser�: "+valortotalcarro+" reais.");
		
		sc.close();

	}

}

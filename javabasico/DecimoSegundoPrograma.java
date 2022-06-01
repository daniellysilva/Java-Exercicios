/* Apostila Faccat  
11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.   */

package javabasico;

import java.util.Scanner;

public class DecimoSegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário fixo do seu funcionário:");
		int salariofixo = sc.nextInt();
		
		System.out.println("Digite quantos carros o seu funcionário vendeu:");
		int carrosvendidos = sc.nextInt();
		
		System.out.println("Digite a comissão de cada carro vendido pelo seu funcionário:");
		int comissao = sc.nextInt();
		
		System.out.println("Digite o valor total de vendas do mês que seu funcionário vendeu:");
		int valortotalvendas = sc.nextInt();
		
		float salariofinal = salariofixo+(carrosvendidos*comissao)+(valortotalvendas*5/100);
		
		System.out.println("O salário final do seu funcionário nesse mês é: "+salariofinal+" reais.");
		
		sc.close();

	}

}

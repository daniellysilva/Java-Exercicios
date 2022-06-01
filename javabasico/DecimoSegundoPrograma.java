/* Apostila Faccat  
11) Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
vendedor.   */

package javabasico;

import java.util.Scanner;

public class DecimoSegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio fixo do seu funcion�rio:");
		int salariofixo = sc.nextInt();
		
		System.out.println("Digite quantos carros o seu funcion�rio vendeu:");
		int carrosvendidos = sc.nextInt();
		
		System.out.println("Digite a comiss�o de cada carro vendido pelo seu funcion�rio:");
		int comissao = sc.nextInt();
		
		System.out.println("Digite o valor total de vendas do m�s que seu funcion�rio vendeu:");
		int valortotalvendas = sc.nextInt();
		
		float salariofinal = salariofixo+(carrosvendidos*comissao)+(valortotalvendas*5/100);
		
		System.out.println("O sal�rio final do seu funcion�rio nesse m�s �: "+salariofinal+" reais.");
		
		sc.close();

	}

}

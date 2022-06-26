/*Apostila Manzano
 *3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500.*/

package lacoderepeticao;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int cont = 0;
		int soma = 0;
		
		while (cont<501) {
			
			if (cont % 2 == 0) {
				
				soma = cont + soma;
				
				System.out.println(soma);
			}
			
			cont++;
		}
		
	}
	
}

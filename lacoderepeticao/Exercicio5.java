/*Apostila Manzano
 *5) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/

package lacoderepeticao;

import java.lang.Math;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int cont = 0;
		
		while (cont <= 15) {
			int resultado = (int) Math.pow(cont, 3);
			System.out.println(cont+ " ao cubo será: "+resultado);
			cont++;
		}

	}

}

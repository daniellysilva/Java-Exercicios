/*Apostila Manzano
 *5) Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser
considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que
neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).*/

package lacoderepeticao;

import java.lang.Math;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int cont = 0;
		
		while (cont <= 15) {
			int resultado = (int) Math.pow(cont, 3);
			System.out.println(cont+ " ao cubo ser�: "+resultado);
			cont++;
		}

	}

}

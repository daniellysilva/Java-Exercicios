/*Apostila Manzano
 *2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/

package lacoderepeticao;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int cont = 0;
		int i = 1;
		
		while (i <= 100) {
			cont = cont + i;
			System.out.println(cont);
			i++;
		}
		
	}

}

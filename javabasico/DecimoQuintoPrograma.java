/* Apostila Manzano  
14) Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. A f�rmula de
convers�o � F (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.:     */

package javabasico;

import java.util.Scanner;

public class DecimoQuintoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius");
		int celsius = sc.nextInt();
		
		float fahrenheit = (celsius*9/5) + 32;
		
		System.out.println("O valor em Fahrenheit �: "+fahrenheit);
		
		sc.close();

	}

}

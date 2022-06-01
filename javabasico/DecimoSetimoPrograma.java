/* Apostila Manzano  
16) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Possuindo o valor da
distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS = DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
quantidade de litros (LITROS_USADOS) utilizada na viagem.   */

package javabasico;

import java.util.Scanner;

public class DecimoSetimoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto da viagem:");
		int tempo = sc.nextInt();
		
		System.out.println("Digite a velocidade média:");
		int velocidade = sc.nextInt();
		
		int distancia = tempo*velocidade;
		float litrousados = distancia/12;
		
		System.out.println("O tempo gasto na viagem foi "+tempo+" hora(s)");
		System.out.println("A velocidade média na viagem foi "+velocidade+" km/h");
		System.out.println("A distância na viagem foi "+distancia+" km");
		System.out.println("Os litros usados na viagem foi "+litrousados+" litros");
		
		sc.close();
		
	}

}

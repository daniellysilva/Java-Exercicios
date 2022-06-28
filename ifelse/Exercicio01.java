package faccat;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if (numero<10) {
			System.out.println("O NÚMERO É MENOR QUE 10!");
		} else {
			System.out.println("O NÚMERO É MAIOR QUE 10!");
		}
		
		sc.close();
		
	}

}

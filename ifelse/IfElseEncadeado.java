package ifelse;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = ler.nextInt();
		
		System.out.println("Digite outro valor:");
		int valor2 = ler.nextInt();
		
		int soma=valor1+valor2;
		
		if (soma>10) {
			System.out.println("� maior que 10");
		} else if(soma == 10) {
			System.out.println("� igual que 10");
		} else {
			System.out.println("� menor que 10");
		}
		
		ler.close();

	}

}

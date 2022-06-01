/* Apostila Faccat  
5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */

package javabasico;

import java.util.Scanner;

public class SextoPrograma {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite um valor:");
		 int valor = sc.nextInt();
		 
		 int resultado= valor-1;
		 
		 System.out.println("O antecessor desse número é: "+resultado);
		 
		 sc.close();
	}

}

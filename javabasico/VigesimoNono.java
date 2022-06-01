/*Apostila Manzano
 * 29)Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a
apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para
cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e
votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos
válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de
eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de
eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de
eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de
eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último
o percentual correspondente de votos em branco em relação à quantidade de eleitores.*/

package javabasico;

import java.util.Scanner;

public class VigesimoNono {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Perguntas
		
		System.out.println("Digite quantos eleitores tem na sua cidade:");
		int eleitor = sc.nextInt();
		
		System.out.println("Digite quantos eleitores votaram candidato A.");
		int votosA = sc.nextInt();
		
		System.out.println("Digite quantos eleitores votaram candidato B.");
		int votosB = sc.nextInt();
	
		System.out.println("Digite quantos eleitores votaram candidato C.");
		int votosC = sc.nextInt();
		
		System.out.println("Digite quantos eleitores votaram no nulo:");
		int nulo = sc.nextInt();
		
		System.out.println("Digite quantos eleitores votaram no branco:");
		int branco = sc.nextInt();
		
		//Total
		
		float resultadovalidos = 100*(votosA+votosB+votosC)/eleitor;
		float resultadoA = 100*votosA/eleitor;
		float resultadoB = 100*votosB/eleitor;
		float resultadoC = 100*votosC/eleitor;
		float resultadonulo = 100*nulo/eleitor;
		float resultadobranco = 100*branco/eleitor;
		
		//Mensagem
		
		System.out.println("O resultado das eleições 2022 foi:");
		System.out.println("O candidato(a) candidato A teve "+resultadoA+"% de votos.");
		System.out.println("O candidato(a) candidato B teve "+resultadoB+"% de votos.");
		System.out.println("O candidato(a) candidato C teve "+resultadoC+"% de votos.");
		System.out.println("Com "+resultadovalidos+"% de votos válidos.");
		System.out.println("Com "+resultadonulo+"% de votos nulos.");
		System.out.println("Com "+resultadobranco+"% de votos brancos.");
		
		sc.close();

	}

}

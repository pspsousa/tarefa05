package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o estoque atual do produto: ");
		float QdtEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Maxima do Estoque: ");
		float MaxEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Minima do Estoque: ");
		float MinEstoque = sc.nextFloat();

		float Media = (MaxEstoque + MinEstoque) / 2;

		if (QdtEstoque >= Media) {
			System.out.println("Não Efetuar Compra");
		} else {
			System.out.println("Efetuar Compra");
		}

		sc.close();
	}
}

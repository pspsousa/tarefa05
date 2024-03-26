package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avaliação: ");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a nota da segunda avaliação: ");
		float nota2 = sc.nextFloat();

		float Media = (nota1 + nota2) / 2;

		if (Media >= 6) {
			System.out.println("Aluno aprovado, com a media: " + Media);
		} else {
			System.out.println("Aluno reprovado, com a media " + Media);
		}

		sc.close();
	}
}

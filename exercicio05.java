package tarefa05;

import java.util.Scanner;

public class Exercicio05 {

	/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Ano atual: ");
		int Ano = sc.nextInt();

		System.out.println("Digite o Ano do seu Nascimento: ");
		int Nascimento = sc.nextInt();

		int Idade = Ano - Nascimento;

		if (Idade >= 18) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		System.out.println("Você tem " + Idade + " Anos");
		sc.close();
	}
}

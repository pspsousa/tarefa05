package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	/* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, casoontrário escrever NÃO É MAIOR QUE 10!*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor : ");
		int valor1 = sc.nextInt();

		if (valor1 > 10) {
			System.out.println("É maior que 10");
		} else {
			System.out.println("É menor que 10");
		}

		sc.close();
	}
}

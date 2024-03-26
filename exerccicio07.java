package tarefa05;

import java.util.Scanner;

public class Exercicio07{

	/*Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo Valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("A ordem Crescente é: " + valor2 + (",") + valor1);
		} else {
			System.out.println("A ordem Crescente é: " + valor1 + (",") + valor2);
		}

		sc.close();
	}
}

package tarefa05;

import java.util.Scanner;

public class Exercicio06 {

	/* Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior Valor é : "+valor1);
		}else {
			System.out.println("O maior valor é : "+valor2);
		}
		
		sc.close();
	}
}

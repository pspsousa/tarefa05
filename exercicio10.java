package tarefa05;

import java.util.Scanner;

public class Exercicio10 {

	/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário");
		float salario = sc.nextFloat();

		System.out.println("Digite o valor de vendas:");
		float Vendas = sc.nextFloat();

		if (Vendas < 1501) {
			float salarioFinal1 = Vendas / 100 * 3 + salario;
			System.out.println("O salario Final é : R$" + salarioFinal1);
		} else {
			float salarioFinal2 = (Vendas - 1500) * 5 / 100 + (1500 * 3 / 100) + salario;
			System.out.println("O salário final é : " + salarioFinal2);
		}

		sc.close();
	}
}

package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	/* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de horas Trabalhada: ");
		float HRSTrabalhadas = sc.nextFloat();

		System.out.println("Digite o Valor ganho Por hora: ");
		float ValorHora = sc.nextFloat();

		if (HRSTrabalhadas > 160) {
			float Extra = (HRSTrabalhadas - 160) * (HRSTrabalhadas) + (ValorHora * 50 / 100);
			float ComExtra = (160 * ValorHora) + Extra;
			System.out.println(ComExtra);
		} else {
			float SemExtra = ValorHora * 160;
			System.out.println(SemExtra);
		}
		sc.close();
	}
}

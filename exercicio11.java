package tarefa05;

import java.util.Scanner;

public class Exercicio11 {

	/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		String Conta = scanner.nextLine();
		
		System.out.print("Digite o saldo da conta: R$ ");
		float Saldo = scanner.nextFloat();
		System.out.print("Digite o total de débitos: R$ ");
		float Debito = scanner.nextFloat();
		System.out.print("Digite o total de créditos: R$ ");
		float Credito = scanner.nextFloat();
		
		double SaldoAtual = Calculo(Saldo, Debito, Credito);
		
		System.out.printf("O saldo atual da conta é: R$ ", SaldoAtual);
		
		if (SaldoAtual >= 0) 
		{
		System.out.println("Saldo Positivo");
		} 
		else 
		{
		System.out.println("Saldo Negativo");
		}
		
			sc.close();
		}
		
		public static double Calculo(double saldo, double debito, double credito) {
			return Saldo - Debito + Credito;
		}
		}
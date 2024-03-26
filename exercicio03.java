package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	/* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o número * de maçãs compradas, calcule e escreva o custo total da compra. */

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
		
	System.out.println("Digite o valor de numero de Maças: ");
	float QtdMaças = sc.nextFloat();
	
	float Menos12 = 1.30f;
	float Maior12 = 1;	
	
	if(QtdMaças >= 12) {
		float Valor1 = QtdMaças*Maior12;
		System.out.println("O valor da compra Foi: R$ "+Valor1);
	}else {
		float Valor2 = QtdMaças*Menos12;
		System.out.println("O valor da Compra Foi: R$ "+Valor2);
	}
	System.out.println("O numero de maças compradas são "+QtdMaças);
	
	
	sc.close();	
	}	
}

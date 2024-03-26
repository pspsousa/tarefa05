package tarefa05;

import java.util.Scanner;

public class Exercicio02 {

	/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("Digite um numero: ");
	int Valor = sc.nextInt();
	
	if(Valor >= 0){
		System.out.println("O numero é Positivo");
	}else {
		System.out.println("O numero é Negativo");
	}
	
	sc.close();
	}
}

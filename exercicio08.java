package tarefa05;

import java.util.Scanner;

public class Exercicio08 {

	/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.*/

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora do inicio: ");
		int hrInicio = sc.nextInt();

		System.out.println("Digite a hora do fim: ");
		int hrFim = sc.nextInt();

		int tempo = hrFim - hrInicio;

		if (tempo > 0) {
			System.out.println("A partida durou " + tempo + " hrs ");
		} else {
			int tempo2 = tempo > 24;
			System.out.println("A partida durou " + tempo2 + " hrs ");
		}

		sc.close();
	}
}

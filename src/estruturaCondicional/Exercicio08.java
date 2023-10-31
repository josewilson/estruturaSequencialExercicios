package estruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// if e else duração de jogo
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
			
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
		
		sc.close();

	}

}

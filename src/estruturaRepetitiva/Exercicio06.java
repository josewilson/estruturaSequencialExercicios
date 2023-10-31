package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// digitar senha correta de acesso a sistema

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			   System.out.println("Senha Invalida");
			   senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

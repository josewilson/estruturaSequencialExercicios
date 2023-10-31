package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Digitar um número inteiro N e calcular todos os seus divisores
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}

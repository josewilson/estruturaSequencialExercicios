package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Digitar N numeros e em seguida efetuar a soma dos N numeros
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
			System.out.println(soma);
		}
		
		sc.close();

	}

}

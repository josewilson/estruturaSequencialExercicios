package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Digitar um numero e exibir os impares
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Tabuada de N numeros
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	}

}

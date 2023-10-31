package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Digitar 01 numero N e exibir o numero que esta dentro ou fora 
		// do intervalo entre 10 e 20
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in ");
		System.out.println(out + " out ");
		
		sc.close();

	}

}

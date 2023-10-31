package estruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// if e else numero inteiro negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N < 0 ) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}

}

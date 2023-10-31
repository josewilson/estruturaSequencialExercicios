package estruturaCondicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// if e else numero inteiro par ou impar
		
		
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 == 0 ) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}



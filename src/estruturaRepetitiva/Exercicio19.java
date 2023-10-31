package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Achar 6 bit, dizer se ele vale 1 e se é V ou F

		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}

package string;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args)
    {
      try (Scanner in = new Scanner(System.in)) {
		System.out.print("Insira um número inteiro: ");
		  int digits = in.nextInt();
		  System.out.println("A soma é " + sumDigits(digits));
	}
    }

 public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 }
package estruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// if e else numeros inteiros multiplos ou não multiplos
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();

	}

}

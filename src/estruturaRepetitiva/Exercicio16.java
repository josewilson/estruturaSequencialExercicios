package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// Digitar um numero N e exibir seu respectivo Fatorial
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// digitação de numeros, até digitar o zero e exibir a soma dos numeros
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			//soma += x;
			x =sc.nextInt();
		}
		
		System.out.println(soma);
        sc.close();
	}

}

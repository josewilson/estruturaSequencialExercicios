import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// diferença de valores
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = A * B - C * D;
		
		System.out.println("DIFERENÇA = " + dif);
		
		
		sc.close();
		
		

	}

}

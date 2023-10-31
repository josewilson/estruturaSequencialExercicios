import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// scanner flutuante

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
			
		sc.close();
	}

}

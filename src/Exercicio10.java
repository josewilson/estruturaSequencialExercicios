import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// scanner caracter

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
			
		sc.close();
	}

}

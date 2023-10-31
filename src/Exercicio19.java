import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// salario de funcionario

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.println("NÚMERO = " + numero);
		System.out.printf("SALÁRIO = U$ %.2f%n", salario);
		
		
		sc.close();

	}

}

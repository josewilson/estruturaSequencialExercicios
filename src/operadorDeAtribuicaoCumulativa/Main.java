package operadorDeAtribuicaoCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Consumo de minutos de franquia/valor da conta de internet
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			//conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
				
				
		sc.close();

	}

}

package estruturaCondicional;

public class Exercicio15 {

	public static void main(String[] args) {
		// Escopo de uma variavel condicional
		
		double price = 400.00;
		
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);
		
	}

}
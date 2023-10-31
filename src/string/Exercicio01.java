package string;

import java.util.Scanner;
public class Exercicio01 {
  public static void main(String[] args)
         // Digitar uma palavra e exibir a qte de vogais(String)          
  
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Escreva sua palavra: ");
			String str = sc.nextLine();

			System.out.print("O numero de vogais é: " + count_Vowels(str)+"\n");
		}
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
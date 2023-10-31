package string;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Digitar uma frase e exibir a qte de palavras(String)

	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Insira a string: ");
		String str = sc.nextLine();

		System.out.print("Numero de palavras na string: " + count_Words(str)+"\n");
	}
}

public static int count_Words(String str)
{
   int count = 0;
    if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }
        count = count + 1; 
    }
    return count; // returns 0 if string starts or ends with space " ".
    }
}


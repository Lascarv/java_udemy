package Udemy;
import java.util.Scanner;

public class Exerc01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Insira dois valores para serem somados:");
		
		int soma1 = sc.nextInt();
		int soma2 = sc.nextInt();
		int resultado = soma1 + soma2; 
		
		System.out.println("O número " + soma1 + " e o número " + soma2 + " é igual a: " + resultado);
		
		sc.close();
		
	}

}

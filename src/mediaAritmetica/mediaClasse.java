package mediaAritmetica;

import java.util.Scanner;


//Sem a estrutura de repetição controlada por Sentinela
public class mediaClasse {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int total = 0;
		int counter = 1;
		
		while(counter <= 10) {
			System.out.print("Enter grade pupil " + counter + ": ");
			int grade = teclado.nextInt();
			total += grade;
			counter++;
		}
		
		int avarage = total / 10;
		System.out.println("O total das 10 notas foi: " + total);
		System.out.println("A media da sala é: " + avarage);
		
	
	}

}

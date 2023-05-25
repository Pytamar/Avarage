package mediaAritmeticaSentinela;

import java.util.Scanner;

public class mediaClasse {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int total = 0;
		int counter = 0;
		
		System.out.print("Enter grade or '-1' for exit: ");
		int grade = teclado.nextInt();
		
		
		//faz o loop até ler o valor sentinela(-1)
		while(grade != -1) {
			
			total+= grade;
			counter++;
			
			System.out.print("Enter grade or '-1' for exit: ");
			grade = teclado.nextInt();
			
		}
		
		if(counter !=0 ) {
			
			double avarage = (double) total / counter;
			System.out.println("O total das " + counter + "notas da classe foi: " + total);
			System.out.print("A media da classe foi: " + avarage);
		}
		else {
			System.out.println("No grade enter");
		}
		
		
		
	}

}

package zadaciJava;

import java.util.Scanner;

public class Zadatak1BrojanjeCifara {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje koliko cifara ima uneti broj n.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj sa vise cifara: ");
		int n = sc.nextInt();
		int brojCifara = 0;
		
		do {
			n = n / 10;
			brojCifara ++;
			
		}while(n > 0);
		
		System.out.println("Broj cifara unetog broja je: " + brojCifara);
	}

}

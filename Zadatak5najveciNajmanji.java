package zadaciJava;

import java.util.Scanner;

public class Zadatak5najveciNajmanji {

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i
		 * minimalni broj.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva cete uneti?");
		int n = sc.nextInt();
		System.out.println("Unesite 1. broj: ");
		int prvi = sc.nextInt();
		int najmanji = prvi;
		int najveci = prvi;
		
		for (int i = 1; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			int unos = sc.nextInt();
			if(unos > najveci) {
				najveci = unos;
			}
			if(unos < najmanji) {
				najmanji = unos;
			}
			
		}

		System.out.println("Najveci unos je " + najveci + " a najmanji " + najmanji);
	}

}

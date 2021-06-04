package zadaciJava;

import java.util.Scanner;

public class Zadatak7RastuciNiz {

	public static void main(String[] args) {
	
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza: ");
		int brojClanova = sc.nextInt();
		int[] niz = new int[brojClanova];
		boolean rastuci = true;
		
		for(int i = 0; i < brojClanova; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = sc.nextInt();
		}
		
		for (int i = 1; i < niz.length; i++) {
				if(niz[i] < niz[i - 1]) {
					rastuci = false;
					break;
				}
		}if(rastuci) {
			System.out.println("Niz je rastuci.");
		}else {
			System.out.println("Niz nije rastuci.");
		}
		
	}

}

package zadaciJava;

import java.util.Scanner;

public class Zadatak6InverzniNiz {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = sc.nextInt();
		int[]niz = new int[duzinaNiza];
		System.out.println("Unesite elemente niza: ");
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for(int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
	}

}

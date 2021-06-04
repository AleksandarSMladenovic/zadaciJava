package zadaciJava;

import java.util.Scanner;

public class Zadatak3zbirPrvihN {

	public static void main(String[] args) {	
		
		/*
		 * Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj do koga se racuna zbir: ");
		int n = sc.nextInt();
		System.out.println("Unesite broj za uslov deljivosti: ");
		int k = sc.nextInt();
		int zbir = 0;
		
		for(int i = 0; i <= n; i++) {
			if(i % k != 0) {
				zbir = zbir + i;
			}
		}

		System.out.println("Zbir odabranih brojeva je: " + zbir);
	}

}

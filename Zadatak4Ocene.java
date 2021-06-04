package zadaciJava;

import java.util.Scanner;

public class Zadatak4Ocene {

	public static void main(String[] args) {

		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerickom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvu ocenu: ");
		int ocena1 = sc.nextInt();
		System.out.println("Unesite drugu ocenu: ");
		int ocena2 = sc.nextInt();
		System.out.println("Unesite trecu ocenu: ");
		int ocena3 = sc.nextInt();
		double prosecnaOcena = (ocena1 + ocena2 + ocena3) / 3.0;

		if (prosecnaOcena < 1.5 && prosecnaOcena >=1) {
			System.out.println(prosecnaOcena + " nedovoljan");
		} else if (prosecnaOcena >= 1.5 && prosecnaOcena < 2.5) {
			System.out.println(prosecnaOcena + " dovoljan");
		} else if (prosecnaOcena >= 2.5 && prosecnaOcena < 3.5) {
			System.out.println(prosecnaOcena + " dobar");
		} else if (prosecnaOcena >= 3.5 && prosecnaOcena < 4.5) {
			System.out.println(prosecnaOcena + " vrlo dobar");
		} else if (prosecnaOcena >= 4.5 && prosecnaOcena <= 5) {
			System.out.println(prosecnaOcena + " odlican");
		}else {
			System.out.println("Pogresan unos ocena...");
		}

	}

}

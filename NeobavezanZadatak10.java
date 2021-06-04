package zadaciJava;

import java.util.Scanner;

public class NeobavezanZadatak10 {

	public static void main(String[] args) {
		boolean pogresanUnos = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite u kom redu je pion: ");
		int pionR = sc.nextInt();
		if (pionR < 2 || pionR > 8) {
			pogresanUnos = true;
		}
		System.out.println("Unesite u kojoj koloni je pion: ");
		int pionK = sc.nextInt();
		if (pionK < 2 || pionK > 8) {
			pogresanUnos = true;
		}
		System.out.println("Unesite u kom redu je skakac: ");
		int skakacR = sc.nextInt();
		if (skakacR < 2 || skakacR > 8) {
			pogresanUnos = true;
		}
		System.out.println("Unesite u kojoj koloni je skakac: ");
		int skakacK = sc.nextInt();
		if (skakacK < 2 || skakacK > 8) {
			pogresanUnos = true;
		}

		while (!pogresanUnos) {
			if (((pionR + 2 == skakacR) || (pionR - 2 == skakacR))
					&& ((pionK == skakacK - 1) || (pionK == skakacK + 1))) {
				System.out.println("Pion je napadnut!");
				break;
			} else if (((pionR + 1 == skakacR) || (pionR - 1 == skakacR))
					&& ((pionK == skakacK - 2) || (pionK == skakacK + 2))) {
				System.out.println("Pion je napadnut!");
				break;
			} else {
				System.out.println("Pion nije napadnut!");
				break;
			}
		}
		if (pogresanUnos) {
			System.out.println(pionR + " " + pionK + " " + skakacK + " " + skakacR + " " + "Greska u unosu!");
		}
	}

}
/*
 * if (pionR == skakacR + 1 && ((pionK == skakacK - 1) || (pionK == skakacK +
 * 1))) { System.out.println("Skakac je napadnut!"); break; } else {
 * System.out.println("Skakac nije napadnut!"); break; }
 */

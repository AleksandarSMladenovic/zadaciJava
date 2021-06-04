package zadaciJava;

import java.util.Scanner;

public class Zadatak8IspravljenKod {

	public static void main(String[] args) {

		// Ovaj kod predstavlja kalkulator povrsina
		// kvadrata, pravougaonika i kruga.
		// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		// Ukoliko se unese 'izadji', program treba da se zavrsi.
		// Program treba da se ponavlja dokle god se ne unese izadji.

		
		Scanner sc = new Scanner(System.in);
		String figura;
		boolean izlaz = false;
		
		while (!izlaz) {
			System.out.println("Unesite naziv figure:");

			figura = sc.nextLine().toLowerCase();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				izlaz = true;
				break;
			default:
				System.out.println("Pogresan unos.");
				break;
			}
		}
	}

	public static void racunajKrug() {
		System.out.println("Unesite precnik kruga: ");
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r));
	}

	public static void racunajPravougaonik() {
		System.out.println("Unesite stranice pravougaonika: ");
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite stranicu a: ");
		a = sc.nextDouble();
		System.out.println("Unesite stranicu b: ");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	}

	public static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata: ");
		double a;
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	}

	public static double pKruga(double r) {
		return r * r * 3.14;
	}

	public static double pKvadrata(double a) {
		return a * a;
	}

	public static double pPravougaonika(double a, double b) {
		return a * b;

	}

}

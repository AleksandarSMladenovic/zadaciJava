package zadaciJava;

public class Zadatak2ZamenaBrojeva {

	public static void main(String[] args) {

		/*
		 * ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih
		 */
		
		int x = 3; 
		int y = 7;
		System.out.println("Prave vrednosti: x = " + x + ", y =  " + y);
		
		int zamena = x;
		x = y;
		y = zamena;
		System.out.println("Zamenjene vrednosti sa uvodjenjem promenljive: x = " + x + ", y =  " + y);
		
		
		x = 7;
		y = 3;
		System.out.println("Zamenjene vrednosti: x = " + x + ", y =  " + y);
	}

	
}

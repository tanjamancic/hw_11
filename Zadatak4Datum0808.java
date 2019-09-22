package prvipaket;

import java.util.Scanner;

public class Zadatak4Datum0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Koliko ima elemenata niza u koloni: ");
		int kol = sc.nextInt();
		int red;
		int[][] a = new int[kol][];
		for (int i = 0; i < kol; i++) {
			System.out.print("Koliko ima elemenata u redu sa " + i + " indeksom?");
			red = sc.nextInt();
			a[i] = new int[red];
			System.out.println("Unesite te elemente: ");
			for (int j = 0; j < red; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Potrebna je suma koje kolone? ");
		int n = sc.nextInt();
		int suma = sumaKolone(a, n);
		System.out.println("Suma " + n + ". kolone (index kolone " + (n - 1) + ") je: " + suma);

	}

	static int sumaKolone(int[][] a, int n) {
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length > n - 1)
				suma += a[i][n - 1];
		}
		return suma;
	}

}

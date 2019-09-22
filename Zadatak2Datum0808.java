package prvipaket;

import java.util.Scanner;

public class Zadatak2Datum0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Elemenata niza u koloni: ");
		int kol = sc.nextInt();
		System.out.print("Elemenata niza u redu: ");
		int red = sc.nextInt();
		int[][] a = new int[kol][red];
		unesiNiz(a);
		System.out.print("Potrebna je suma kog reda? ");
		int n = sc.nextInt();
		int suma = sumaReda(a, n);
		System.out.println("Suma " + n + ". reda (index reda " + (n - 1) + ") je: " + suma);
	}

	static void unesiNiz(int[][] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Unesite element niza: ");
				int element = sc.nextInt();
				a[i][j] = element;
			}
		}
	}

	static int sumaReda(int[][] a, int n) {
		int suma = 0;
		for (int i = 0; i < a[n - 1].length; i++) {
			suma += a[n - 1][i];
		}
		return suma;
	}
}

package prvipaket;

import java.util.Scanner;

public class Zadatak1Datum0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko ima elemenata niza u koloni: ");
		int kol = sc.nextInt();
		System.out.println("Koliko ima elemenata niza u redu: ");
		int red = sc.nextInt();
		int[][] a = new int[kol][red];
		unesiNiz(a);
		int[] b = minMax(a);
		System.out.println("Minimum i maksimum niz: " + b[0] + " , " + b[1]);
	}
	

	static void unesiNiz(int[][] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Unesite element " + j + " niza " + i + ": ");
				int element = sc.nextInt();
				a[i][j] = element;
			}
		}
	}

	static int[] minMax(int[][] a) {
		int [] b = new int [2];
		b[0] = b[1] = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ( b[0] > a[i][j]) {
					b[0] = a[i][j];
				} else if ( b[1] < a[i][j]) {
					b[1] = a[i][j];
				}
			}
		}
		return b;
	}

}

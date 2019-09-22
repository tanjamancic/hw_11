package prvipaket;

import java.util.Scanner;

public class Zadatak5Datum0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int[] brojSlova = brojSlova(s);
		for (int i = 0; i < brojSlova.length; i++) {
			System.out.print(brojSlova[i]);
			if (i < (brojSlova.length - 1)) {
				System.out.print(",");
			}
		}

	}

	static int[] brojSlova(String s) {
		char karakter;
		int pozicija = 0;
		int[] brojSlova = new int[26];
		for (char i = 'a'; i <= 'z'; ++i) {
			int brojac = 0;
			for (int j = 0; j < s.length(); j++) {
				karakter = s.charAt(j);
				if (karakter == i) {
					brojac++;
				}
			}
			brojSlova[pozicija] = brojac;
			pozicija++;

		}
		return brojSlova;
	}

}

package prvipaket;

import java.util.Scanner;

public class Zadatak3Datum0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		System.out.print("Unesite karakter: ");
		char c = sc.next().charAt(0);
		int brojac = brojKaraktera(s, c);
		if ( brojac > 0) {
		System.out.println("Karakter " + c + " je " + brojac + " puta ponovljen.");
		} else System.out.println("Karakter " + c + " ne postoji u datom stringu.");
	}

	static int brojKaraktera(String s, char c) {
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				brojac++;
			}
		}
		return brojac;
	}
}

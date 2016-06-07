package de.paustale;

import java.util.Scanner;

public class KleinGross {
	public static void main(String args[])
	{
		//Scannen Eingabe
		Scanner sc = new Scanner(System.in);
		System.out.println("Eingabe: ");
		//Eingabe in String
		String eingabe = sc.next();
		//Ausgabe
		System.out.println("Das wurde eingegeben: " + eingabe);
		//Eingabe in Groﬂbuchstaben umwandeln
		String gross = eingabe.toUpperCase();
		//Ausgabe
		System.out.println("Umgewandelt: " + gross);
	}
}

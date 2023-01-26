package org.lessons.java.security;

import java.util.Scanner;

public class FestaFerragnez {

	public static void main(String[] args) {
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
		
		String invitato;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("scrivi il tuo nome per verificare se sei invitato: ");
		invitato = s.nextLine();
		
	    String messaggio = "non puoi entrare";
		
		for (int i = 0; i < invitati.length; i++ ) {
			String allInvitati = invitati[i];
			
			if (invitato.equals(allInvitati)) {
				messaggio = "puoi entrare";
			}
				
			
		}
		
			System.out.println(messaggio);
		
		s.close();
	}
	
}

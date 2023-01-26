package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		String name;
		
		String lastName;
		
		String favoriteColor;
		
		int dayOfBirth;
		
		int monthOfBirth;
		
		int yearOfBirth;
		
		int dateOfBirth;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("scrivi il tuo nome: " );
		name = s.nextLine();
		
		
		System.out.print("scrivi il tuo cognome: " );
		lastName = s.nextLine();
		

		System.out.print("scrivi il tuo colore preferito: " );
		favoriteColor = s.nextLine();
		
		
		System.out.print("scrivi il tuo girono di nascita: " );
		dayOfBirth = s.nextInt();
		
		
		System.out.print("scrivi il tuo mese di nascita: " );
		monthOfBirth = s.nextInt();
		
		
		System.out.print("scrivi il tuo anno di nascita: " );
		yearOfBirth = s.nextInt();
		
		
		dateOfBirth = (dayOfBirth + monthOfBirth + yearOfBirth);
		
		System.out.println(name + "-" + lastName + "-" + favoriteColor + "-" + dateOfBirth);
		
		
		s.close();
	}
	
}

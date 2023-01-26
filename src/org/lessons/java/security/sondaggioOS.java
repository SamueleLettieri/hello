package org.lessons.java.security;

import java.util.Scanner;

public class sondaggioOS {

	public static void main(String[] args) {
		
		int linux; 
		
		int windows;
		
		int mac;
		
		int totalUser;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Quanti studenti usano Linux: " );
		linux = s.nextInt();
		
		System.out.print("Quanti studenti usano Mac: " );
		windows = s.nextInt();
		
		System.out.print("Quanti studenti usano Windws: " );
		mac = s.nextInt();
		
		
		totalUser = (linux + windows + mac);
		
		System.out.println("gli utenti Linux sono: " + (linux*100/(totalUser)) + "%");
		System.out.println("gli utenti Windows sono: " +  (windows*100/(totalUser)) +"%");
		System.out.println("gli utenti Mac sono: " +  (mac*100/(totalUser)) + "%");
		

		s.close();
	}
	
}

package org.lessons.java.security;

import java.util.Scanner;

public class BigliettoDelTreno {
	
	public static void main(String[] args) {
		
		float km;
		int passengerAge;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti km vuole percorrere? ");
		km = Integer.parseInt(s.nextLine());
		
		System.out.print("Quanti anni a? ");
		passengerAge = Integer.parseInt(s.nextLine());
		
		double price = (km * 0.21);
		
		
		if (passengerAge > 65) {
			System.out.println("il costo del biglietto è " + price + ", con lo scontato del 40% è " + (price*40)/100 + "€");
		} else if (passengerAge < 18) {
			System.out.println("il costo del biglietto è " + price + ", con lo scontato del 20% è " + (price*20)/100 + "€");
		} else {
			System.out.println("il costo del biglietto è " + price + "€");
		}
		
		s.close();
	}
	
}

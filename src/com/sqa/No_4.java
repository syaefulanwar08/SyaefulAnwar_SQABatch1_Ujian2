package com.sqa;

import java.util.Scanner;

public class No_4 {
	
	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner scan    = new Scanner(System.in);

        System.out.print("Masukkan sisa BBM dalam tangki (liter)  : ");
        double sisa = scan.nextInt();

        System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) : ");
        double jarakPerLiter = scan.nextInt();
        
        System.out.println("Kendaraan anda dapat menempuh jarak " + hitungSisaJarak(sisa, jarakPerLiter) + " kilometer dengan sisa"
        		+ " BBM yang ada di tangki");
	}
	
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}
}

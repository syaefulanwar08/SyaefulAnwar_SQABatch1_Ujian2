package com.sqa;

import java.util.Scanner;

public class No_3 {
	
	
     
	public static void main(String[]args) {
		// Silakan isi bagian ini

        // Input dari keyboard
        Scanner scan    = new Scanner(System.in);

        System.out.print("Jarak yang ditempuh (km) : ");
        int jarakTempuh     = scan.nextInt();

        System.out.print("Nilai kecepatan (km/jam) : ");
        int kecepatan       = scan.nextInt();
        
        hitungKecepatan(jarakTempuh, kecepatan);
        
        
       
	}
	
	static void hitungKecepatan(int jarakTempuh, int kecepatan) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
		
		// Buat variabel perhitungan
	    double waktu;
	    int ubahWaktu;
	    int totalJam, totalMenit, totalDetik, modWaktu;
		
		// Ubah jarakTempuh dan kecepatan
        jarakTempuh = jarakTempuh * 1000;
        kecepatan   = kecepatan * 1000;

        // Hitung waktu yang dibutuhkan
        waktu       = jarakTempuh / ((double) kecepatan / 3600);
        ubahWaktu  = (int) waktu; // jadikan int

        modWaktu    = ubahWaktu % 3600; // cari sisa bagi
        totalJam    = (ubahWaktu - modWaktu) / 3600; // hitung untuk jam
        totalMenit  = (modWaktu - modWaktu % 60) / 60; // hitung untuk menit
        
        // Tampilkan hasil perhitungan
        System.out.println("\nWaktu tempuh yang dibutuhkan:");
        System.out.printf("%d jam %d menit km/jam", totalJam, totalMenit);

	}

}

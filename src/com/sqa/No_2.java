package com.sqa;

import java.util.Scanner;

public class No_2 {
	
	public static void main(String[] args) {
		
		
		No_2 main = new No_2();
		main.hitungPajak();
		

	}
	


	public static void hitungPajak() {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan merk kendaraan = ");
		String merk = in.nextLine();
		System.out.println("Masukkan tipe kendaraan = ");
		String tipe = in.nextLine();
		System.out.println("Masukkan tahun pembuatan = ");
		int produksi = in.nextInt();
		
		int pajak;
			
		if (produksi>2020) {
			pajak = 4000000;
		}else if (produksi>2010) {
			pajak = 2000000;
		}else if(produksi>2000){
			pajak = 1000000;
		}else if(produksi>1990) {
			pajak = 750000;
		}else if(produksi>1980) {
			pajak = 500000;
		}else {
			pajak = 250000;
		}

		System.out.println("Pajak tahunan untuk "+merk+" "+tipe+" tahun "+produksi+ " adalah Rp."+pajak);
		
	}

}

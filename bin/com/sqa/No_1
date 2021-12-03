package com.sqa;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);

	}
	
	static void cetakFibonacci(int batas) {
		// silakan isi bagian ini		
		int nilai_sesudah = 1;
        int nilai_sebelumnya = 1;
        int fibonacci = 1;
        for (int i =1; i <= batas; i++){
            System.out.print(nilai_sebelumnya + ", ");
            fibonacci = nilai_sesudah + nilai_sebelumnya;
            nilai_sesudah = nilai_sebelumnya;
            nilai_sebelumnya = fibonacci;
        }
	}

}

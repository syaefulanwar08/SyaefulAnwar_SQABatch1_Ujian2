package com.sqa;

import java.util.Scanner;

class BebasException extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Error : Anda bukan Pria dan Wanita");
	}
	
}

public class No_6 {
	public static void main(String[] args) {
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin
		//tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut
		//gunakan catch
		
		System.out.println("NOTES: Jika sudah menikah ketik 1 dan jika belum menikah ketik 2");
		
		Scanner scan    = new Scanner(System.in);
		
        System.out.print("Jenis Kelamin : ");
        String jenisKelamin     = scan.nextLine();

        System.out.print("Status : ");
        int status       = scan.nextInt();
        
		
		try {
				System.out.println("Pajak anda sebesar = "+ pajak(jenisKelamin, status)+ "%");
			} catch (Exception bebas) {
			// TODO: handle exception
				bebas.printStackTrace();
			}
	}
	
	private static void hitung() {
		// TODO Auto-generated method stub
		throw new NullPointerException();
	}
	
	private static int pajak(String jenisKelamin, int status) throws Exception {
		
		// String jenisKelamin = "Pria";
		// boolean menikah = false;
		int pajak = 0;
		
		if (jenisKelamin.equalsIgnoreCase("pria")) {
			if(status == 1) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		}else if(jenisKelamin.equalsIgnoreCase("wanita")) {
			if(status == 1) {
				pajak = 3;
			}else {
				pajak = 7;
			}
		}else {
			throw new BebasException();
		}
		
		return pajak;
	} 
}

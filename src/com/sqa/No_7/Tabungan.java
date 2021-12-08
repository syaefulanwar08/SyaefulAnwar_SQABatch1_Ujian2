//package com.sqa.No_7;
//
//public class Tabungan {
//	protected String namaPemlik;
//	protected int noRekening, jumlahSaldo;
//	
//	public Tabungan(String nama, int nomor, int setoranAwal) {
//		this.namaPemlik = nama;
//		this.noRekening = nomor;
//		this.jumlahSaldo = setoranAwal;
//	}
//	
//	public Tabungan(String nama, int nomor) {
//		this.namaPemlik = nama;
//		this.noRekening = nomor;
//	}
//	
//	public void selamatDatang() {
//		System.out.println("Hallo Selamat Datang "+ this.namaPemlik);
//	}
//	
//	public void cekSaldo() {
//		System.out.println("Saldo anda saat ini sebesar "+ this.jumlahSaldo);
//	}
//	
//	public int setor(int setoran) {
//		this.jumlahSaldo += setoran;
//		System.out.println("Setoran anda sebesar "+ setoran + " Telah berhasil dilakukan "+ "Saldo anda sebesar : "+ this.jumlahSaldo);
//		return this.jumlahSaldo;
//	}
//	
//	public int tarik(int tarik) {
//		if (tarik > jumlahSaldo) {
//			System.out.println("Penarikan tidak dapat anda lakukan karena anda tidak punya uang di tabungan tersebut");
//		}else {
//			this.jumlahSaldo -= tarik;
//			System.out.println("Penarikan anda sebesar : "+ tarik +" Berhasil dilakukan, saldo anda sekarang sebesar : "+ this.jumlahSaldo);
//		}
//		
//		return this.jumlahSaldo;
//	}
//	
//}

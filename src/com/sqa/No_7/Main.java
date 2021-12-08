package com.sqa.No_7;

class Tabungan {
	private String namaNasabah;
	private int noRek, jumlahSaldo;

	Tabungan(String inputNamaNasabah, int inputNorek, int inputSaldo) {
		namaNasabah = inputNamaNasabah;
		this.noRek = inputNorek;
		this.jumlahSaldo = inputSaldo;	
    }
	
	Tabungan(String inputNamaNasabah, int inputNorek) {
		namaNasabah = inputNamaNasabah;
		this.noRek = inputNorek;
    }
	
	public void cekSaldo() {		
		System.out.println("Saldo anda saat ini adalah "+ this.jumlahSaldo);
	}

	public void setor(int inputSetor) {
		// TODO Auto-generated method stub
		this.jumlahSaldo += inputSetor;
		System.out.println("Setoran sebesar "+ inputSetor +" berhasil dilakukan, saldo anda sekarang "+ this.jumlahSaldo);
	}
	
	public void tarik(int inputTarik) {
		// TODO Auto-generated method stub
		if (inputTarik <= this.jumlahSaldo) {
			this.jumlahSaldo -= inputTarik;
			System.out.println("Penarikan sebesar "+ inputTarik +" berhasil dilakukan, saldo anda sekarang "+ this.jumlahSaldo);
		} else if (inputTarik == this.jumlahSaldo) {
			this.jumlahSaldo -= inputTarik;
			System.out.println("Penarikan sebesar "+ inputTarik +" berhasil dilakukan, saldo anda sekarang "+ this.jumlahSaldo);
		}
		else {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		}
		
	}
	
}

public class Main {
		public static void main (String[] args) {
			Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
			simpedes.cekSaldo();				
			simpedes.setor(8000);
			simpedes.cekSaldo();
			simpedes.tarik(230000);
			simpedes.tarik(60000);
			simpedes.cekSaldo();
			System.out.println();
			
			Tabungan tabanas = new Tabungan ("Hindun",90);
			tabanas.cekSaldo();
			tabanas.tarik(10000);
			tabanas.tarik(1000);
			tabanas.setor(20000);
			tabanas.tarik(20000);
	}
}

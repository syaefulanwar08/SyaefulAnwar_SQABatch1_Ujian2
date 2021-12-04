package com.sqa.No_7;

class Tabungan {
	private String namaNasabah;
	private int nomer;
	private int saldo;
	private int jumlahSetor, jumlahTarik;
	private int inSetor, inTarik;


	Tabungan(String inputNamaNasabah, int inputNomer, int inputSaldo) {
		namaNasabah = inputNamaNasabah;
		nomer = inputNomer;
		saldo = inputSaldo;	
    }
	
	public void cekSaldo() {
		saldo += inSetor;
		saldo -= inTarik;
		
		System.out.println("Saldo anda saat ini adalah "+ saldo);
	}

	public void setor(int inputSetor) {
		// TODO Auto-generated method stub
		inSetor = inputSetor;
		jumlahSetor = saldo + inSetor;
		System.out.println("Setoran sebesar "+ inSetor +" berhasil dilakukan, saldo anda sekarang "+ jumlahSetor);
	}
	
	public void tarik(int inputTarik) {
		// TODO Auto-generated method stub
		inTarik = inputTarik;
		if (inTarik <= saldo) {
			jumlahTarik = saldo - inTarik;
			System.out.println("Penarikan sebesar "+ inTarik +" berhasil dilakukan, saldo anda sekarang "+ jumlahTarik);
		} else if (inTarik == saldo) {
			jumlahTarik = saldo - inTarik;
			System.out.println("Penarikan sebesar "+ inTarik +" berhasil dilakukan, saldo anda sekarang "+ jumlahTarik);
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
			
			Tabungan tabanas = new Tabungan ("Hindun",90, 0);
			tabanas.cekSaldo();
			tabanas.tarik(10000);
			tabanas.tarik(1000);
			tabanas.setor(20000);
			tabanas.tarik(20000);
	}
}

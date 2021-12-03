package com.sqa.No_7;

public class Tabungan {
	private static String nama;
	private static int nomer;
	private static int saldo;
	private static int isiSaldo;
	private static int jumlahSetor;
	private static int setorSaldo;
	private static int tarikSaldo;

	public Tabungan(String namaNasabah, int nomor, int isiSaldo) {
		// TODO Auto-generated constructor stub
		nama = namaNasabah;
		nomer = nomor;
		saldo = isiSaldo;
		
		
	}
	
	public static void cekSaldo(int saldoSekarang) {
		
		isiSaldo = saldo + saldoSekarang;
		
	}
	
	public static void setor(int setorSaldo) {
		jumlahSetor = isiSaldo + setorSaldo ;
		
	}
	
	public static void tarik(int jumlahTarikan) {
		saldo = saldo + tarikSaldo ;
	}

	public static void main (String[] args) {
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		Tabungan.cekSaldo(0);
		System.out.println("Isi saldo anda " + isiSaldo);
		simpedes.setor(8000);
		System.out.println("jumlah setor " + setorSaldo);
		simpedes.cekSaldo(0);
		simpedes.tarik(230000);
		simpedes.tarik(60000);
		simpedes.cekSaldo(0);
		System.out.println();
		
		Tabungan tabanas = new Tabungan ("Hindun",90, 0);
		tabanas.cekSaldo(0);
		tabanas.tarik(10000);
		tabanas.tarik(1000);
		tabanas.setor(20000);
		tabanas.tarik(20000);
	}
	

}


package com.sqa.No_8;

class Tabungan{
	private String namaNasabah;
	private int nomor;
	private int saldo;
	
	public Tabungan(String nama, int inputNomor, int inputSaldo) {
		// TODO Auto-generated constructor stub
		namaNasabah = nama;
		nomor = inputNomor;
		saldo = inputSaldo;	
	}
	
	@Override
	public String toString() {
		return "Tabungan nomor "+ nomor +" atas nama "+ namaNasabah + "dengan saldo sebesar "+ saldo;
	}
}

public class Main {

	public static void main (String[] args) {
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		System.out.println(simpedes.toString());
		System.out.println();
		Tabungan tabanas = new Tabungan("Hindun",90, 0);
		System.out.println(tabanas.toString());
	}

}

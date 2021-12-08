package com.sqa.No_10;

public class MainSekolah {
	
	public static void main(String[] args) {
		Sekolah sekolah = new Sekolah();
		
		/// SMA
		SMA sma = new SMA();
		
		sma.setNama("SMAN 1");
		sma.setAlamat("Bandung");
		sma.setJenjang("SMA");
		
		sekolah.nama(); 
		System.out.println(sma.getNama());
		sekolah.alamat(); 
		System.out.println(sma.getAlamat());
		sekolah.jenjang(); 
		System.out.println(sma.getJenjang());
		
		/// SMK
		SMK smk = new SMK();
		
		smk.setNama("SMKN 1");
		smk.setAlamat("Jakarta");
		smk.setJenjang("SMK");
		
		sekolah.nama(); 
		System.out.println(smk.getNama());
		sekolah.alamat(); 
		System.out.println(smk.getAlamat());
		sekolah.jenjang(); 
		System.out.println(smk.getJenjang());
			
	}
}

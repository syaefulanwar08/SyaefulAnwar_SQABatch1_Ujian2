package com.sqa.No_10;

public class SMA extends Sekolah {

	private String nama;
	private String alamat;
	private String jenjang;
	
	public SMA() {
		System.out.println("Sekolah SMA");
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJenjang() {
		return jenjang;
	}

	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}
	
}

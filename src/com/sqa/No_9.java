package com.sqa;

import java.util.Scanner;

public class No_9 {
	
	public static void main(String[]args) {
		// Silakan isi bagian ini

        Scanner scan = new Scanner(System.in);

        System.out.print("Maks input array : ");
        int size = scan.nextInt();
        
        int[] nilai = new int[size];
        
        for(int i=0; i<size; i++) {
        	System.out.printf("Masukan nilai pada index ke " + i + " : ");
        	nilai[i] = scan.nextInt();
         }	
        
        System.out.println(jumlahArray(nilai));        
        
        
        //////////////////////////////////////////////////////////////////////////////////////
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++) {
        	System.out.printf("Masukan nilai pada index ke " + i + " : ");
        	arr[i] = scan.nextInt();
         }	
        
        System.out.print("Masukkan input nilai : ");
        int nilai1 = scan.nextInt();
              
        System.out.println(cariNilai(arr, nilai1));
             
	}
	
	public static int jumlahArray(int[] nilai) {		
		 int sum = 0;
		 
		 for (int i = 0; i<nilai.length; i++) {			 
		  sum += nilai[i];		  
		 }
		 
		 return sum;
	}
	
	
	public static boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x < arr.length; x++) {
		  if (arr[x] == nilai)
		   return true;
		 }
		 
		 return false;
	}


}

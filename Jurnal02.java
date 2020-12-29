package org.d3ifcool.ima10;
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int angka, cek=0;
		angka=input.nextInt();

		for(int i = 2; i<=angka; i++){
			if (angka%i==0){
				cek++;
			}
		}
		if (cek==1){
			System.out.println ("YA");
		}else{
			System.out.println ("BUKAN");
		}
	}
}

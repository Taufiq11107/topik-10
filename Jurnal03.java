package org.d3ifcool.ima10;
import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		
		int angka;
		int cetakAngka =0;
		
		angka = input.nextInt();
		for(int i=1; i<=angka; i++){
		
			for(int j=1; j<=i; j++){
				cetakAngka %=10;
				System.out.print(cetakAngka);
				cetakAngka++;
			}
			System.out.println("");
		}
	}
}

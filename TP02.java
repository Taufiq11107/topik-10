package org.d3ifcool.ima10;
import java.util.Scanner;

public class TP02 {
	
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini	
		Scanner input = new Scanner(System.in);
		long faktorial =1;
		int angka = input.nextInt();
		
		for(int i = 1; i<=angka; i++){
			faktorial = i * faktorial;
		}
		System.out.println(faktorial);
	}
}

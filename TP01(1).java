package org.d3ifcool.ima10;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		// variabel
		int dikali = 0;
		int i; 
		int hasil = 0;
		dikali = input.nextInt();
		
		//perulangan for
		for( i = 1; i <=10; i++){
			hasil = dikali * i;
			System.out.println( i + " x " + dikali + " = " + hasil );
		}
	}
}

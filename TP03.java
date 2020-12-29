package org.d3ifcool.ima10;
import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		// variabel
		int x,y,z,n;
		n = input.nextInt();
		for(x=1; x<=n; x++){
			//outer loop
			// ke bawah sebanyak input
			for(y= n-1; y>=x; y--){
				System.out.print(" ");
				// untuk membentuk spasi ke samping
			}
			for(z=1;z<=x; z++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

package percabangan;

import java.util.Scanner;

public class If {
	
	public static void main (String[] args) {
		
		//buat var dan input scanner
		int belanja = 0;
		Scanner scan = new Scanner(System.in);
		
		//mengambil input
		System.out.print("Belanja berapa? : Rp.");
		belanja = scan.nextInt();
		
		//
		if (belanja>=10000) {
			System.out.println("Anda dapat hadiah!");
		}
		
		System.out.println("Selamat berbelanja!");
	}

}

package percabangan;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		//var dan scanner input
		int nilai = 0;
		String nama;
		Scanner scan = new Scanner(System.in);
		
		//mengambil input
		System.out.print("Nama? : ");
		nama = scan.nextLine(); //string
		System.out.print("Nilai: ");
		nilai = scan.nextInt(); //integer
		
		//cek lulus atau tidak
		if(nilai>=75) {
			System.out.println("Lulus Bos!");
		}
		else {
			System.out.println("Tidak lulus");
		}
	}

}

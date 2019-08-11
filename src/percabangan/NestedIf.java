package percabangan;
import java.util.Scanner;
public class NestedIf {
	
	public static void main(String[] args) {
		
		int belanjaan, diskon, bayar;
		String kartu;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Apakah ada kartu member? (ya/tdk) ");
		kartu = scan.nextLine();
		System.out.print("Belanjaan: Rp.");
		belanjaan = scan.nextInt();
		
		if(kartu.equalsIgnoreCase("ya")) { //membandingkan String dengan tidak memperdulikan huruf besar dan kecilnya.
			if(belanjaan > 500000) {
				diskon = 50000;
			} else if(belanjaan > 100000) {
				diskon = 10000;
			} else {
				diskon = 0;
			}
		}
		else {
			if(belanjaan > 100000) {
				diskon = 5000;
			}
			else {
				diskon = 0;
			}
		}
		
		System.out.println("Anda mendapatkan diskon Rp." + diskon);
		bayar = belanjaan - diskon;
		System.out.print("Total bayar: Rp." + bayar);
	}

}

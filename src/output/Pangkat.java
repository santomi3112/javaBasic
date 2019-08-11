package output;
import java.util.Scanner;
public class Pangkat {
	
	public static void main(String[] args) {
		
		int angka,pangkat;
		double hasil;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan angka yang akan dipangkatkan: ");
		angka = scan.nextInt();
		System.out.print("Pangkat berapa?: ");
		pangkat = scan.nextInt();
		
		hasil = Math.pow(angka,pangkat);
		System.out.print("Hasilnya: "+hasil);
	}

}

package soalsmk;
import java.util.Scanner;
public class penggantiAbsen { 
	
		static class perhitungan {
			
			int sisi, pilih, luas, volume, panjang, tinggi, lebar;
			Scanner scan = new Scanner(System.in);
			
			void kubus() {
				
				System.out.println("Perhitungan kubus");
				System.out.println("1.Mencari Luas ");
				System.out.println("2.Mencari Volume ");
				System.out.print("Pilih 1/2: ");
				pilih = scan.nextInt();
				switch(pilih) {
					case 1 : 
						System.out.print("Masukkan jumlah sisi: ");
						sisi = scan.nextInt();
						luas = sisi * sisi;
						System.out.print("Hasil: "+luas);
					case 2 :
						System.out.print("Masukkan jumlah sisi: ");
						sisi = scan.nextInt();
						volume = sisi * sisi * sisi;
						System.out.print("Hasil: "+volume);
						
				}
			}
			
			void balok(int panjang,int tinggi, int lebar) {
				
				System.out.println("Perhitungan balok");
				System.out.println("1.Mencari Luas ");
				System.out.println("2.Mencari Volume ");
				System.out.print("Pilih 1/2: ");
				pilih = scan.nextInt();
				switch(pilih) {
					case 1 : 
						luas = panjang * tinggi;
						System.out.print("Hasil: "+luas);
						break;
					case 2 :
						volume = panjang * lebar * tinggi;
						System.out.print("Hasil: "+volume);
						break;
					default :
						System.out.print("salah input");		
				}				
			}
		}
		
public static void main(String[] args) {
	
	int pilih;
	Scanner scan = new Scanner(System.in);
	
	perhitungan coba = new perhitungan();
	
	System.out.println("1. Kubus");
	System.out.println("2. Balok");
	System.out.print("pilih 1/2: ");
	pilih = scan.nextInt();
	
	switch(pilih) {
		case 1 :
			coba.kubus();
			break;
		case 2 :
			coba.balok(5, 2, 10);
			break;
		default:
			System.out.print("salah inputan");
			
	}
	
}
}

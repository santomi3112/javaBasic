package perulangan;
import java.util.Scanner;
public class ForMod {
	
	public static void main(String[] args) {
		
		int i=0;
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Masukkan bilangan: ");
		i = scan.nextInt();
		
		if(i%2==1) {
			System.out.print("Bilangan "+i+" ganjil");
		} else {
			System.out.print("Bilangan "+i+" genap");
		}
	}
}

package percabangan;
import java.util.Scanner;
public class IfElseIf {
	
	public static void main(String[] args) {
		
		int nilai = 0;
		String nama;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Nama: ");
		nama = keyboard.nextLine();
		System.out.print("Nilai: ");
		nilai = keyboard.nextInt();
		
		System.out.println("--------------------------------------");
		
		if(nilai>=90) {
			System.out.println("Nama: "+nama);
			System.out.println("Nilai: "+nilai);
			System.out.println("Grade A");
		} else if(nilai>=80) {
			System.out.println("Nama: "+nama);
			System.out.println("Nilai: "+nilai);
			System.out.println("Grade B");
		} else if(nilai>=75) {
			System.out.println("Nama: "+nama);
			System.out.println("Nilai: "+nilai);
			System.out.println("Grade C");
		} else {
			System.out.println("Nama: "+nama);
			System.out.println("Nilai: "+nilai);
			System.out.println("Tidak lulus");
		}
		System.out.println("Terima Kasih");
	}

}

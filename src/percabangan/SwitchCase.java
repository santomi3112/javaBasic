package percabangan;
import java.util.Scanner;
public class SwitchCase {
	
	public static void main(String[]args) {
		
		String lampu;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lampu Lantas Warna: ");
		lampu = scan.nextLine();
		
		switch(lampu) {
			case "merah":
				System.out.print("Berhenti!");
				break;
			case "kuning":
				System.out.print("Hati-Hati!");
				break;
			case "hijau":
				System.out.print("Jalan!");
				break;
			default:
				System.out.print("Salah input!");
		}
		
	}

}

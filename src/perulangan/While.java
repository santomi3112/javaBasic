package perulangan;
import java.util.*;
public class While {
	
	public static void main(String[] args) {
		
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);
		
		while(running) {
			System.out.println("Apakah anda ingin keluar?");
			System.out.println("Jawab ya bila ingin keluar");
			jawab = scan.nextLine();
			
			if(jawab.equalsIgnoreCase("ya")) {
				running = false;
			}
			
			counter++;
			
		}
		System.out.print("Anda melakukan sebanyak "+counter+" kali");
	}
}
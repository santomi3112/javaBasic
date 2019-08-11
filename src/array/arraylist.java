package array;
import java.util.ArrayList;
public class arraylist {
	
	public static void main(String[] args) {
		
		ArrayList kantung = new ArrayList();
		
		kantung.add("Uang");
		kantung.add(5000);
		kantung.add("Kontol");
		kantung.add("Rupiah");
		kantung.add(true);
		
		kantung.remove("Kontol");
		
		System.out.println(kantung);
		
		System.out.print("Kantung berisi "+kantung.size()+" item");
	}

}

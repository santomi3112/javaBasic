package array;

public class Array1 {
	
	public static void main(String[] args) {
		
		String[] buah = new String[5];
		buah[0] = "Jambu";
		buah[1] = "Merah";
		buah[2] = "Indonesia";
		buah[3] = "Jaya";
		buah[4] = "Selalu";
		
		for (int i=0; i<buah.length; i++) {
			System.out.println(buah[i]);
		}
	}
}
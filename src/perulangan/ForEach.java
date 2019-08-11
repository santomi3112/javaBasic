package perulangan;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] nomor = new int[4];
		
		nomor[0] = 1;
		nomor[1] = 2;
		nomor[2] = 3;
		nomor[3] = 4;
		
		for(int n : nomor) {
			System.out.print(n+" ");
		}
	}

}

package percabangan;

public class OperatorLogika{
	
	public static void main(String[] args) {
		
        boolean SIM = false;
        boolean STNK = true;

        // cek apakah dia akan ditilang atau tidak
        if(SIM == true && STNK == true){
            System.out.println("Tidak ditilang!");
        } else {
            System.out.println("Anda ditilang!");
        }
	}
}

// Percabangan IF, hanya memiliki satu pilihan;
// Percabangan IF/ELSE memiliki dua pilihan;
// Percabangan dengan operator ternary adalah bentuk lain dari IF/ELSE;
// Percabangan IF/ELSE/IF memiliki lebih dari dua pilihan;
// Percabangan SWITCH/CASE adalah bentuk lain dari IF/ELSE/IF;
// Percabangan bersarang adalah percabangan dalam Percabangan;
// Penggunaan operator logika dalam percabangan bisa membuat percabangan menjadi lebih singkat.
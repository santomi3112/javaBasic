package sort;
import java.util.Scanner;
public class CobaBblSort {
	
	public static void main(String[] args) {
		
		int jumlah, i, j, temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nMasukkan jumlah bilangan yg tidak urut : ");
		jumlah = scan.nextInt();
		int array[] = new int[jumlah];
		
		System.out.println("\nMasukkan "+jumlah+" buah bilangan");
		
		for(i=0; i<jumlah; i++) {
			System.out.print("bilangan ke -"+(i+1)+": ");
			array[i]=scan.nextInt();
		}
		
		System.out.print("\nBilangan tidak terurutmu:");
		for (int a=0; a<jumlah; a++) {
			System.out.print(array[a]+" ");
			
		}
		
		for(i=0; i<(jumlah-1);i++) {
			for(j=0; j<jumlah-i-1;j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		
		System.out.println("Bilangan terurutnya :");
		for(i=0; i<jumlah; i++) {
			System.out.print(array[i]);
		}
		
	}

}

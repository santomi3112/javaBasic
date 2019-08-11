package sort;

import java.util.Scanner;
import java.util.Arrays;

public class NewSort {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int x, y, jumlah, selisih, jumlahArr, cari, temp = 0;
        boolean ketemu = false;
        
        System.out.print("Masukkan jumlah array: ");
        jumlahArr = scan.nextInt();
        int[] arr = new int[jumlahArr];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = scan.nextInt();
        }
        System.out.println("\nSebelum diurutkan: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < (arr.length-1); j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nSetelah diurutkan: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\nMasukkan angka yang ingin dicari: ");
        cari = scan.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == cari){
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println("Angka ditemukan"); 
            } else System.out.println("Angka tidak ditemukan");
        
        
    }
    
}
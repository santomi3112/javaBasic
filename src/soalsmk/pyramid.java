package soalsmk;

import java.util.Scanner;

public class pyramid {
    
    void hitung(){
        Scanner input =  new Scanner(System.in);
        int balok,i,j=0;
        System.out.print("Masukkan Balok : ");
        balok=input.nextInt();
        for(i=1; i<=balok; i++){
            if(balok>1){
                balok=balok-i;
                j++;
            }
        }
        System.out.println("Tinggi : "+j);
    }
    
    public static void main(String[] args) {
        pyramid a = new pyramid();
        a.hitung();
    }
}
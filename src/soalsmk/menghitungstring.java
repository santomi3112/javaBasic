package soalsmk;
import java.util.Scanner;
public class menghitungstring {
    public static void main(String[] args) { 
    	
        String kalimat;
        int panjangkalimat, jumlahHuruf = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan Kalimat : ");
        kalimat = scan.nextLine(); 
        
        char[] arrHuruf = kalimat.toCharArray(); 
        panjangkalimat = arrHuruf.length;
        
        for(int i = 0; i < panjangkalimat; i++){
            for(int j = 0; j < panjangkalimat; j++){ 
                if(arrHuruf[i]!=' '){ 
                    if(i!=j&&(arrHuruf[i]==arrHuruf[j])){ 
                        jumlahHuruf++; 
                        arrHuruf[j]=' '; 
                    }
                    if(j==panjangkalimat-1){  
                        System.out.println("Jumlah huruf '"+arrHuruf[i]+"' = "+jumlahHuruf); 
                        jumlahHuruf=1; 
                    }
                }
            }
        }
    }
}
package search;

public class BinSerch {
    public static void main(String[] args) {
System.out.println("***** BINARY SEARCH *****"+"\n" );
        //pendeklarasian variabel
        int A[] = {12, 22, 24, 34, 54};
        int cari = 12;
        int N = 5;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int tengah = 0;

        //menampilkan data dalam array
        System.out.print("isi data adalah ");
        for (int i = 0; i < A.length; i++) {

            System.out.print(A[i] + " ");
        }
        System.out.println("");


while ((batasatas < batasbawah) && (!ketemu)) { //perulangan dua kondisi dimana batasatas < batas bawah dan nilai boolean tidak ketemu
tengah = (batasatas + batasbawah) / 2; //mencari nilai tengah denga cara batasatas+batasbawah dibagi 2

            if (A[tengah] == cari) { //koondisi nilai tengah sama dengan data yang dicari
                ketemu = true; //maka kondisi ketemu adaah true

            } else {
                if (A[tengah] < cari) { //sebaliknya jika nilai tengah <dari yng dicari
                    batasatas = tengah++; //maka batas atas = nilai tenga + 1
                } else {                //kondisi sebaliknya maka nilai atas = nilai tengah - 1
                    batasatas = tengah--;
                }
            }
        }

        //mencetak hasil dari pencarian :
        if (ketemu) {
            System.out.println("Data " + cari + " Telah ditemukan pada index ke " +(tengah + " beris ke " + (tengah + 1)));
        } else {
            System.out.println("Data " + cari + " Tidak ditemukan");
        }
System.out.println("\n");
         System.out.println(" ***** Terima Kasih ***** ");
    }
}
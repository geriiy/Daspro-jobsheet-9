import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        

       
        int nilaiMhs=0, banyakMhs, lulus=0, tidakLulus=0;
        double total1 = 0, total2 = 0;
        double rata2, rata1;
        System.out.print("Masukkan jumlah Mahasiswa     : ");
        banyakMhs = input12.nextInt();
        
        for (int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs = input12.nextInt();
            if (nilaiMhs > 70){
                total1 += nilaiMhs;
                lulus++;
            }
            else {
                total2 += nilaiMhs++;
                tidakLulus++;

            }
            
        }
 

        rata2 = total1/lulus;
            System.out.println("Rata-rata nilai Lulus       = "+rata2);
        rata1 = total2/tidakLulus;
            System.out.println("Rata-rata nilai Tidak Lulus = "+rata1);
input12.close();
    }
    
}

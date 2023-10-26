import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        

       
        int nilaiMhs=0, lulus=0, tidakLulus=0;
        double total1 = 0, total2 = 0;
        double rata2Lulus, rata2TidakLulus;
        System.out.print("Masukkan jumlah Mahasiswa     : ");
        int n = input12.nextInt();
        int[] banyakMhs = new int[n];
        
        for (int i = 0; i < n; i++) {
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
 

        rata2Lulus = total1/lulus;
            System.out.println("Rata-rata nilai Lulus       = "+rata2Lulus);
        rata2TidakLulus = total2/tidakLulus;
            System.out.println("Rata-rata nilai Tidak Lulus = "+rata2TidakLulus);

            
input12.close();
    }
    
}

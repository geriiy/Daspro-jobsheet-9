import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input12.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" Lulus!");
        }
            else {
                System.out.println("Mahasiswa ke-"+i+" Tidak Lulus!");
            }
        
input12.close();
    }
    
}
}
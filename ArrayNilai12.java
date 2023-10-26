import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input12.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }


        input12.close();
    }
    
}

import java.util.Scanner;

public class LinearSearch12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int hasil=0;
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input12.nextInt();
        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+" : ");
            arrayInt[i] = input12.nextInt();
            
        }
        System.out.print("Masukkan key yang ingin anda cari: ");
        int key = input12.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-"+hasil);
              
            }

            }
            
        
      
     

        
        input12.close();
    }
    
}


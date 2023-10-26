import java.util.Scanner;

public class MenentukanNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
   
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input12.nextInt();

    
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = input12.nextInt();
        }

 
        int max = cariMax(array);
        int min = cariMin(array);
        double rata2 = cariRata2(array);


        System.out.println("Nilai Tertinggi: " + max);
        System.out.println("Nilai Terendah: " + min);
        System.out.println("Rata-rata: " + rata2);
    }

    static int cariMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    static int cariMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

 
    static double cariRata2(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    }


    


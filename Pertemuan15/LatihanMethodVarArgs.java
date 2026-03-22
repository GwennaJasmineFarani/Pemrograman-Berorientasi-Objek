package Pertemuan15;

public class LatihanMethodVarArgs {
      public static double hitungRataRata(int... nilai) {
        int total = 0;

        // Enhanced for loop
        for (int n : nilai) {
            total += n;
        }

        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        
        double rata1 = hitungRataRata(80, 85, 75);
        System.out.println("Rata-rata (3 nilai): " + rata1);

        double rata2 = hitungRataRata(90, 85, 88, 80, 87);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 21 Maret 2026*/
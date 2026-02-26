package Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println( "=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) { // Outer loop
            System.out.println("Hari ke-" + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {

                if (hari == 1){
                    if (waktu == 1){
                        System.out.println("Pagi : Nasi Goreng");
                    } else {
                        System.out.println("Siang : Soto Ayam");
                    }
                }

                if (hari == 2){
                    if (waktu == 1){
                        System.out.println("Pagi : Bubur Ayam");
                    } else {
                            System.out.println("siang : Mie Ayam");
                    }
                }

                if (hari == 3){
                    if (waktu == 1){
                        System.out.println("Pagi : Roti Bakar");
                    } else {
                        System.out.println("Siang : Nasi Uduk");
                        }
                    }
                 }
             }
        }
}
        
/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 26 / 2 / 2026 */
package Pertemuan5;

public class LatihanDiskon {
    public static void main(String[] args) {
        double totalBelanja = 750000; 
        double diskon = 0;

        // Menentukan diskon 
        if (totalBelanja < 100000) {
            diskon = 0;
        } else if (totalBelanja < 500000) {
            diskon = 0.05; // 5%
        } else if (totalBelanja < 1000000) {
            diskon = 0.10; // 10%
        } else {
            diskon = 0.15; // 15%
        }

        double jumlahDiskon = totalBelanja * diskon;
        double hargaAkhir = totalBelanja - jumlahDiskon;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon (" + (diskon * 100) + "%): Rp " + jumlahDiskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + jumlahDiskon);
    }
}

/* Nama : Gwenna Jasmina Farani (D1041241079)
Tanggal : 24 / 2 / 2026 */
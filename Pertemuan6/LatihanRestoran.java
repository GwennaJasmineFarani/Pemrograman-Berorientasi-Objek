package Pertemuan6;

public class LatihanRestoran {
     public static void main(String[] args) {
        int menuCode = 1;   // kode menu 
        int quantity = 2;   // jumlah pesanan

        String namaMenu = "";
        int harga = 0;

        // Menentukan menu berdasarkan kode
        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                break;
            default:
                System.out.println("Kode menu tidak valid");
                return;
        }

        int total = harga * quantity;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + total);
    }
}

/*Nama: Gwenna Jasmine Farani (D1041241079)
Tanggal : 24 / 2 / 2026 */
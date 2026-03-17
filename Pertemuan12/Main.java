package Pertemuan12;

class Mahasiswa {
    static int jumlahMahasiswa = 0;
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }

    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class Main {
    public static void main(String[] args) {
        new Mahasiswa("Andi");
        new Mahasiswa("Budi");
        new Mahasiswa("Citra");

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getJumlah());
    }
}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 16 Maret 2026 */
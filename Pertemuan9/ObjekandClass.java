package Pertemuan9;

class ObjekandClass {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat() {
        kecepatan += 10; // Setiap dipanggil, kecepatan bertambah 10 km/jam
        System.out.println("Kecepatan sekarang: " + kecepatan + " km/jam");
    }
    
    public void tampilkanInfo(){
    System.out.println("Merk:" + merk);
    System.out.println("Warna:" + warna);
    System.out.println("Tahun:" + tahun);
    System.out.println("Kecepatan:" + kecepatan + "km/jam"); 
    }

    public static void main(String[] args) {
        ObjekandClass mobil1 = new ObjekandClass();
        mobil1.merk = "Honda";
        mobil1.warna = "Biru";
        mobil1.tahun = 2024;
        mobil1.kecepatan = 0; //kecepatan awal

        
        mobil1.tampilkanInfo();
        mobil1.percepat();
    }

}

/* Nama : Gwenna Jasmine Farani (D1041241079)
Tanggal : 20/2/2026 */
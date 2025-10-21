import java.util.Scanner;

public class SiakadFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi dan inisialisasi variabel
        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        
        // Variabel tambahan untuk perhitungan kelulusan
        int jmlLulus = 0;
        int jmlTidakLulus = 0;
        final double BATAS_LULUS = 60.0; 

        // Struktur Perulangan FOR untuk 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            // Output dan Input nilai
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Cek Nilai Tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // Cek Nilai Terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // MODIFIKASI: Hitung Mahasiswa Lulus dan Tidak Lulus
            if (nilai >= BATAS_LULUS) {
                jmlLulus++; // Nilai 60 atau lebih, dianggap LULUS
            } else {
                jmlTidakLulus++; // Nilai di bawah 60, dianggap TIDAK LULUS
            }
        } // Akhir perulangan FOR

        // Output Hasil 
        System.out.println("\n--- Hasil Analisis Nilai ---");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        // Menampilkan jumlah mahasiswa lulus dan tidak lulus
        System.out.println("Jumlah mahasiswa LULUS (>= " + BATAS_LULUS + "): " + jmlLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS (< " + BATAS_LULUS + "): " + jmlTidakLulus);
        System.out.println("----------------------------");

        sc.close();
    }
}
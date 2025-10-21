import java.util.Scanner;

public class SiakadFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi dan inisialisasi variabel 
        double nilai;
        double tertinggi = 0;   
        double terendah = 100;  
        
        // Struktur Perulangan FOR untuk 10 mahasiswa (i=1 sampai i<=10) 
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
        } 
        // Output Hasil 
        System.out.println("\nNilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}
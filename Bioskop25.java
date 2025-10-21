import java.util.Scanner;

public class Bioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        long totalPenjualanBersih = 0; 
        long totalDiskonDiberikan = 0;
        int totalTiketTerjual = 0;
        
        System.out.println("--- Sistem Penjualan Tiket Bioskop ---");

        // Perulangan DO-WHILE untuk transaksi berulang
        do {
            long hargaBersih = 0;
            double diskonPersen = 0.0;
            boolean inputValid = false;

            // Perulangan DO-WHILE untuk validasi input jumlah tiket
            do {
                System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk berhenti): ");
               jumlahTiket = sc.nextInt();
                
                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Silakan masukkan ulang.");
                    // Jika input negatif, inputValid tetap false, mengulang perulangan
                } else {
                    inputValid = true; // Input berhasil dibaca dan nilainya >= 0
                }
            } while (!inputValid);
            
             sc.nextLine(); 

            // Kondisi berhenti
            if (jumlahTiket == 0) {
                break; // Keluar dari perulangan DO-WHILE luar
            }

            // Penentuan Diskon
            if (jumlahTiket > 10) {
                diskonPersen = 0.15; // 15% diskon
                System.out.println("Diskon: 15% karena membeli > 10 tiket.");
            } else if (jumlahTiket > 4) {
                diskonPersen = 0.10; // 10% diskon
                System.out.println("Diskon: 10% karena membeli > 4 tiket.");
            } else {
                System.out.println("Diskon: 0%");
            }

            // Perhitungan
            long hargaKotor = (long)jumlahTiket * HARGA_TIKET;
            long nilaiDiskon = (long)(hargaKotor * diskonPersen);
            hargaBersih = hargaKotor - nilaiDiskon;

            // Akumulasi Total
            totalPenjualanBersih += hargaBersih;
            totalDiskonDiberikan += nilaiDiskon;
            totalTiketTerjual += jumlahTiket;

            System.out.println("Harga Kotor: Rp " + hargaKotor);
            System.out.println("Nilai Diskon: Rp " + nilaiDiskon);
            System.out.println("Total Pembayaran Transaksi Ini: Rp " + hargaBersih);

        } while (true); 

        // Output Hasil Akhir
        System.out.println("\n--- REKAPITULASI PENJUALAN HARI INI ---");
        System.out.println("Total Tiket Terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total Diskon Diberikan: Rp " + totalDiskonDiberikan);
        System.out.println("Total Harga Penjualan Bersih: Rp " + totalPenjualanBersih);
        System.out.println("---------------------------------------");

        sc.close();
    }
}
import java.util.Scanner;

public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan Inisialisasi Harga
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        // Deklarasi variabel untuk input
        int kopi, teh, roti;
        String namaPelanggan;
        long totalHarga;

        System.out.println("--- Sistem Kasir Kafe (DO-WHILE) ---");
        
        // Struktur Perulangan DO-WHILE (while(true) untuk perulangan tak terbatas)
        do {
            // 1. Input Nama Pelanggan
            System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine(); 

            // 2. Cek Kondisi Keluar
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; // Keluar dari perulangan DO-WHILE
            }

            // 3. Input Jumlah Item
            System.out.print("Jumlah kopi (Rp " + hargaKopi + "): ");
            kopi = sc.nextInt();
            
            System.out.print("Jumlah teh (Rp " + hargaTeh + "): ");
            teh = sc.nextInt();
            
            System.out.print("Jumlah roti (Rp " + hargaRoti + "): ");
            roti = sc.nextInt();

            // 4. Hitung Total Harga
            totalHarga = (long)kopi * hargaKopi + (long)teh * hargaTeh + (long)roti * hargaRoti;

            // 5. Tampilkan Total Harga
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine(); 

        } while (true); // Perulangan akan terus berjalan kecuali ada 'break'

        System.out.println("Semua transaksi selesai.");
        
        sc.close();
    }
}
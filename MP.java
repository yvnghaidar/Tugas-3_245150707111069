import java.util.Scanner;

public class MP {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        // Menampilkan informasi perusahaan logistik
        Info.tampilkanInformasi();
        System.out.println(); 

       
        System.out.print("Masukkan Nama Pengirim: ");
        String nama = hai.nextLine();
        System.out.print("Masukkan Alamat Tujuan: ");
        String alamat = hai.nextLine();
        System.out.print("Masukkan Berat Barang (kg): ");
        double berat = hai.nextDouble();
        System.out.print("Masukkan Biaya Dasar Pengiriman: Rp ");
        double biayaDasar = hai.nextDouble();
        hai.nextLine(); 

        Pengiriman pengiriman = new Pengiriman(nama, alamat, berat, biayaDasar);
        pengiriman.tampilkanDetail();

        // Menghitung ongkos kirim berdasarkan diskon
        System.out.print("\nMasukkan diskon persentase: ");
        double diskon = hai.nextDouble();
        System.out.printf("Ongkos Kirim setelah diskon %.2f%%: Rp %.2f\n",diskon, pengiriman.hitungOngkir(diskon));

        // Menghitung ongkos kirim berdasarkan diskon + biaya tambahan
        System.out.print("Masukkan biaya tambahan (asuransi, handling, dll): Rp ");
        double biayaTambahan = hai.nextDouble();
        System.out.printf("Ongkos Kirim setelah diskon %.2f%% + biaya tambahan: Rp %.2f\n",
                diskon, pengiriman.hitungOngkir(diskon, biayaTambahan));

        // Menghitung ongkos kirim berdasarkan jarak
        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = hai.nextInt();
        System.out.printf("Ongkos Kirim untuk jarak %d km: Rp %.2f\n",
                jarak, pengiriman.hitungOngkir(jarak));

        hai.close();
    }
}

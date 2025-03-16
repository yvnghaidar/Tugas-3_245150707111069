public class Pengiriman {
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    // Constructor default 
    public Pengiriman() {
        this("", "", 0.0, 0.0);
    }

    // Constructor dengan parameter
    public Pengiriman(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    // Metode Overload hitungOngkir
    public double hitungOngkir(double diskonPersen) {
        return biayaDasar * (1 - diskonPersen / 100);
    }

    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        return hitungOngkir(diskonPersen) + biayaTambahan;
    }

    public double hitungOngkir(int jarak) {
        if (jarak > 50) {
            return biayaDasar + (biayaDasar * 0.10); // Surcharge 10%
        } else {
            return biayaDasar - (biayaDasar * 0.05); // Diskon 5%
        }
    }
    
    public void tampilkanDetail() {
        System.out.println("\n===== Detail Pengiriman Barang =====");
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Berat Barang: " + berat + " kg");
        System.out.printf("Biaya Dasar: Rp %.2f\n", biayaDasar);
    }
}

package uas;

/**
 *
 * @author user
 */
public class Smartphone implements InterfacePajakable {
    private String vendor;
    private String tipe;
    private double harga;

    // Constructor dengan tiga parameter (vendor, tipe, harga)
    public Smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Implementasikan method hitungHargaSetelahPPN() dari interface Pajakable
    @Override
    public double hitungHargaSetelahPPN() {
        double ppn = 0;
        if (harga > 4200000 && harga <= 4500000) {
            ppn = 0.02; // PPN 2% jika harga > Rp 4.200.000,00 sampai Rp 4.500.000,00
        } else if (harga > 4500000) {
            ppn = 0.05; // PPN 5% jika harga > Rp 4.500.000,00
        }

        return harga + (harga * ppn);
    }

    // Getter untuk vendor
    public String getVendor() {
        return vendor;
    }

    // Getter untuk tipe
    public String getTipe() {
        return tipe;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Method untuk menampilkan informasi smartphone
    public void displayInfo() {
        System.out.println("Vendor: " + vendor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga: Rp" + String.format("%.2f", harga));
        System.out.println("Harga Setelah Ditambah PPN: Rp" + String.format("%.2f", hitungHargaSetelahPPN()));
    }
}


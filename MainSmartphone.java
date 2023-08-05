package uas;

/**
 *
 * @author user
 */
public class MainSmartphone{
    public static void main(String[] args) {
        // Membuat objek smartphone dengan parameter (vendor, tipe, harga)
        Smartphone samsungA51 = new Smartphone("Samsung", "A 51", 5000000.00);
        Smartphone oppoReno5 = new Smartphone("Oppo", "Reno 5", 4400000.00);
        Smartphone xiaomiA1 = new Smartphone("Xiaomi", "A1", 4100000.00);

        // Menampilkan informasi smartphone
        samsungA51.displayInfo();
        System.out.println();
        oppoReno5.displayInfo();
        System.out.println();
        xiaomiA1.displayInfo();
    }
}


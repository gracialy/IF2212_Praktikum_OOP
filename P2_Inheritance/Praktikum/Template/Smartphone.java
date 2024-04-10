public class Smartphone extends StoreItem {
    private int storageCapacity;
    private int batteryLife;

    /**
     * Smartphone constructor
     * @param brand
     * @param model
     * @param storageCapacity
     * @param batteryLife
     */
    public Smartphone(String brand, String model, int storageCapacity, int batteryLife) {

    }
    
    /**
     * Mencetak tambahan detail sebuah barang dengan format seperti berikut (tanpa [])
     * Cetak brand dan model dengan metode displayDetails dari class StoreItem
     * Storage capacity: [Jumlah storage dengan satuan GB]
     * Battery life: [Lama battery life dengan satuan hours]
     */
    @Override
    public void displayDetails() {

    }

    /**
     * Menghitung harga dari smartphone
     * Apabila nama brand "Legowo", maka rumus: 200 + (Jumlah storage * 5) + (Lama battery life * 2)
     * Selain nama brand "Legowo", rumus: 200 + (Jumlah storage * 10) + (Lama battery life * 5)
     */
    @Override
    public int calculatePrice() {

    }
    
}
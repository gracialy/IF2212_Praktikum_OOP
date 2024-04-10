public abstract class StoreItem {
    private String brand;
    private String model;

    /**
     * StoreItem constructor
     * @param brand
     * @param model
     */
    public StoreItem(String brand, String model) {

    }

    /**
     * Mengembalikan atribut brand
     * @return brand
     */
    public String getBrand() {

    }

    /**
     * Mencetak detail sebuah barang dengan format seperti berikut (tanpa [])
     * Brand: [Nama brand]
     * Model: [Nama model]
     */
    public void displayDetails() {
        
    }

    public abstract int calculatePrice();
}
import java.util.ArrayList;
import java.util.List;

/**
 * Jangan lupa tambahkan kata kunci yang dibutuhkan
 */ 

public class Cart {
    /**
     * Tambahkan atribut kelas disini
     */ 
    private Account account;
    private List<Item> cart;

    /**
     * Konstruktor
     * Inisialisasi atribut kelas
     */
    public Cart(Account account) {
        this.account = account;
        this.cart = new ArrayList<Item>();
    }
    
    /**
     * Implementasi
     * return account
     */
    public Account getAccount() {
        return this.account;
    }

    /**
     * Implementasi
     * return list item
     */
    public List<Item> getItems() {
        return this.cart;
    }

    /**
     * Implementasi
     * menambahkan item ke dalam list item
     */
    public void addItem(Item item) {
        this.cart.add(item);
    }

    /**
     * Implementasi
     * menghapus semua item yang memiliki nama sesuai dengan parameter name
     * 
     * Apabila keranjang kosong, lempar exception "Tidak ada barang di dalam keranjang"
     * Apabila barang tidak ditemukan, lempar exception "Barang tidak ditemukan di dalam keranjang"
     */
    public void removeItem(String name) throws Exception {
        if (cart.isEmpty()) throw new Exception("Tidak ada barang di dalam keranjang");
        else {
            List<Item> newCart = new ArrayList<Item>();
            for (Item i: cart) {
                if (i.getName() != name) newCart.add(i);
            }
            if (newCart.size() == cart.size()) throw new Exception("Barang tidak ditemukan di dalam keranjang");
            else cart = newCart;
        }
    }

    /**
     * Implementasi
     * mengembalikan total harga semua barang di dalam keranjang
     */
    public int getTotalPrice() {
        int total = 0;
        for (Item i: cart) {
            total += i.getTotalPrice();
        }
        return total;
    }

    /**
     * Implementasi
     * mengurangi saldo sejumlah total harga semua barang
     * mengosongkan keranjang
     * 
     * Apabila keranjang kosong, lempar exception "Keranjang kosong"
     * Apabila saldo tidak mencukupi, lempar exception "Saldo tidak mencukupi untuk melakukan pembayaran"
     */
    public void checkout() throws Exception {
        if (cart.isEmpty()) throw new Exception("Keranjang kosong");
        if (getTotalPrice() > account.getSaldo()) throw new Exception("Saldo tidak mencukupi untuk melakukan pembayaran");
        
        account.reduceSaldo(getTotalPrice());
        cart.clear(); //
    }
}
import java.util.List;
import java.util.Stack;

public class Box<T> {
    private Stack<T> items;

    public Box() {
        // Menginisialisasi items
        items = new Stack<T>(); 
    }
    
    public void addItem(T item) {
        // Menambahkan item ke dalam items
        items.push(item);
    }

    public void removeItem() {
        // Menghapus item dari items
        items.pop();
    }

    public Stack<T> getItems() {
        // Mengembalikan list of items
        return items;
    }

    public boolean isEmpty() {
        // Mengembalikan true jika items kosong
        return items.empty();
    }

    // public static void main(String[] args) {
        // Box b = new Box();

        // Shirt s = new Shirt("red");
        // Pants p = new Pants("green");
        // Jacket j = new Jacket("blue");

    // }
}
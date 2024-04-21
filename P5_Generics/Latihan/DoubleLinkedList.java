import org.w3c.dom.Node;

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat Double linked list dengan size = 0 dan head = tail = null
     */
    public DoubleLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
	}

    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        Node<T> p = head;
        int pos = 0;

        if (pos > this.size || p < 0) return null;

        while (pos < position && p != null) {
            p = p.getNext();
            pos ++;
        }
        return p;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node<T> p = new Node<>();
        if (head == null && tail == null) {
            this.head = item;
        }
        else {
            // double linked list must set prev and set next
            p.setPrev(p);
            this.tail.setNext(p);
        } 

        this.tail = item;
        size ++;
	}

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
		Node<T> p = this.getNode(position);

        if (p == null) return null;
        else return p.getValue();
	}

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
		Node<T> p = this.getNode(position);

        if (p == null) return;
        else p.setValue(item);
	}

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
		Node<T> p = this.getNode(position);

        if (p == null) return;
        else {
            // head dan tail
            if (p.getPrev() == null && p.getNext() == null) {
                this.head = null;
                this.tail = null;
            }
            else if (p.getPrev() == null) {
                this.head = p.nextNode();
                p.nextNode().setPrev(null);
            }
            else if (p.getNext() == null) {
                this.tail = p.getPrev();
                p.nextNode().setNext(null);
            }
            else {
                p.getPrev().setNext(p.getNext());
                p.getNext().setPrev(p.getPrev());
            }
            this.size --;
        }
	}

    /**
     * Hapus semua elemen dari Double Linked List
     */
    public void clear() {
		this.head = null;
        this.tail = null;
        this.size = 0;
	}

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
		return this.size;
	}

    /**
     * Menampilkan keseluruhan isi Double Linked List
     * Format yang dikeluarkan adalah sebagai berikut, misal isi list adalah [1,2,3,4]
     * Maka output yang dihasilkan adalah (dengan enter) :
     * 1 2 3 4
     */
    public void display() {
        Node<T> p = this.head;

        while (p != null){
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
        System.out.print("\n");
	}

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
		Node<T> p = this.head;
        Integer pos = new Integer(0);

        while (p != null) {
            if (p.getValue() == item) return pos;

            p.getNext();
            pos ++;
        }

        return -1;
	}
}
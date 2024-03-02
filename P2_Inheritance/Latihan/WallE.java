/**
 * WallE.java
 * Implementasi WallE.java
 * @author 
 */

 public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
        // Konstruktor
        super(10, isActive);
        
        this.mileage = mileage;
    }

    public long getMileage(){
        // Mengembalikan mileage
        return mileage;
    }

    public void addMileage(long increment){
        // Menambahkan mileage dengan increment
        mileage += increment;
    }

    @Override
    public long getPrice() {
        // Apabila sedang aktif, maka harga total adalah mileage * 1000, 
        // Apabila tidak aktif maka ada tambahan biaya 500
        if (getIsActive()) return mileage * 1000; 
        else return mileage * 1000 + 500;
    }
}
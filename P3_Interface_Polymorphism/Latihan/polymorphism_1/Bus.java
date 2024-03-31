/**
 * Bus.java
 * Merupakan subclass dari Car
 * @author 
 */
public class Bus extends Car {//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int passengerCapacity;
    private boolean isUsedForLongTrip;

    public Bus(int numberOfWheels, int engineCapacity, int passengerCapacity, boolean isUsedForLongTrip) {
        // extends, super: inherit
        super(numberOfWheels, engineCapacity);
        this.passengerCapacity = passengerCapacity;
        this.isUsedForLongTrip = isUsedForLongTrip;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }
    public boolean getLongTripStatus() {
        return this.isUsedForLongTrip;
    }
    public String sound() {
        return "Cesss";
    }
    public String honk() {
        return "Notnot";
    }
    public String printDescription() {
        if (isUsedForLongTrip) return String.format(
            "Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan digunakan untuk perjalanan jauh", 
            super.getNumberOfWheels(), super.getEngineCapacity(), this.passengerCapacity);
        else return String.format(
            "Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan tidak digunakan untuk perjalanan jauh",
            super.getNumberOfWheels(), super.getEngineCapacity(), this.passengerCapacity);
    }
}
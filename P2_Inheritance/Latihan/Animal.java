/**
 * Animal.java
 * Memodelkan hewan di suatu kerajaan hewan
 * @author 
 */

public abstract class Animal {
    private int numberOfLegs;
    private long children;

    public Animal(int numberOfLegs) {
        // Konstruktor, set children = 0
        this.numberOfLegs = numberOfLegs;
        children = 0;
    }

    public int getNumberOfLegs() {
        // Mengembalikan atribut numberOfLegs
        return numberOfLegs;
    }

    public long getNumberOfChildren() {
        // Mengembalikan atribut children
        return children;
    }

    public void increaseChild(long inc) {
        // Meningkatkan nilai atribut children
        children += inc;
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: "Number of Legs: {numberOfLegs}, Children: {children}"
        return String.format("Number of Legs: %d, Child: %d", numberOfLegs, children);
        
        // or
        // return "Number of Legs: " + numberOfLegs + ", Child: " + children;
    }

    public abstract long getAnimalPower();
}
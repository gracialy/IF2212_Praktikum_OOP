import java.lang.System;
import java.util.ArrayList;
import java.util.List;

public class RobotPrinter {
    // Hint 1:
    // List adalah interface Java yang merupakan subinterface dari interface
    // Collection
    // Deklarasi tipe generic `List` di Java yang sudah tersedia adalah:
    // `public interface List<E> extends Collection<E>`
    //
    // Seperti dapat dilihat, List bisa menggunakan variabel tipe (T) generic saat
    // digunakan. Contoh penggunaannya:
    // List<Integer> integerList = ...;

    // Hint 2:
    // Iterasi melalui seluruh elemen list dapat digunakan dengan loop for-each,
    // yang di Java bisa dilakukan dengan sintaks:
    // for (E element : elementList){
    // operasi pada element
    // }

    public void printListOfRobot(List<? extends Robot> robotList) {
        for (Robot r: robotList) {
            System.out.println(r.getName());
        }
    }

    public printListOfTransformer(List<? extends Transformer> transList) {
        for (Transformer t: transList) {
            System.out.println(t.getWeapons());
        }
    }

    public printClassNameOfList(List<? extends Object> objList) {
        for (Object o: objList) {
            System.out.println(o.getClass().getName()); // nama kelas
        }
    }

    public printObjectClassName(G g) {
        System.out.println(g.getClass().getName());
    }
}

class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Transformer extends Robot {
    private int weapons;

    public Transformer(String name, int weapons) {
        super(name);
        this.weapons = weapons;
    }

    public int getWeapons() {
        return this.weapons;
    }
}

class Bumblebee extends Transformer {
    public Bumblebee(String name, int weapons) {
        super(name, weapons);
    }
}

class Baymax extends Robot {
    public Baymax(String name) {
        super(name);
    }
}
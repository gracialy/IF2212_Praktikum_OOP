/**
* KebunBinatang.java
* Program kebun binatang
* @author
*/

import java.util.Scanner;

public class KebunBinatang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        long children = sc.nextInt();
        switch (type){
            case 1:
                int jumlahTelur = sc.nextInt();
                
                Elang eagle = new Elang(5);
                eagle.increaseChild(children);
                for (int i=1; i<=jumlahTelur; i++) eagle.bertelur();

                System.out.printf("Number of Legs: %d, Child: %d\n", eagle.getNumberOfLegs(), eagle.getNumberOfChildren());
                System.out.printf("Jumlah Telur: %d\n", eagle.getJumlahTelur());
                System.out.printf("Animal Power: %d\n", eagle.getAnimalPower());

                break;

            case 2:
                int jumlahGading = sc.nextInt();
                
                Gajah elephant = new Gajah(10, jumlahGading);
                elephant.increaseChild(children);

                System.out.printf("Number of Legs: %d, Child: %d\n", elephant.getNumberOfLegs(), elephant.getNumberOfChildren());
                System.out.printf("Jumlah Gading: %d\n", elephant.getJumlahGading());
                System.out.printf("Animal Power: %d\n", elephant.getAnimalPower());

                break;

            case 3:
                boolean kawanan = sc.nextBoolean();

                Serigala wolf = new Serigala(10, kawanan);
                wolf.increaseChild(children);

                System.out.printf("Number of Legs: %d, Child: %d\n", wolf.getNumberOfLegs(), wolf.getNumberOfChildren());
                if (kawanan) System.out.printf("Serigala berada di dalam kawanan\n");
                else System.out.printf("Serigala tidak berada di dalam kawanan\n");
                System.out.printf("Animal Power: %d\n", wolf.getAnimalPower());
        
                break;
        
            }

        sc.close();
    }
}
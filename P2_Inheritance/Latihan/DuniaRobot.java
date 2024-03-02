/**
 * DuniaRobot.java
 * Menghitung harga dan spesifikasi masing-masing model robot
 * @author 
 */

import java.util.Scanner;

public class DuniaRobot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        boolean isActive;

        switch (type){
            case 1:
                int numberOfParts = sc.nextInt();
                int totalTransformation = sc.nextInt();
                isActive = sc.nextBoolean();

                Bumblebee b = new Bumblebee(numberOfParts, isActive);
                for (int i=1; i<=totalTransformation; i++) b.addTransformation();
            
                System.out.println(b.toString());
                System.out.printf("Jumlah transformasi: %d\n", b.getTotalTransformation());
                System.out.printf("Harga robot: %d\n", b.getPrice());
                
                break;
            
            case 2:
                long price = sc.nextLong();
                int totalModel = sc.nextInt();
                
                Sirik s = new Sirik(price);
                for (int i=1; i<=totalModel; i++) s.addModel();

                System.out.println(s.toString());
                System.out.printf("Jumlah model: %d\n", s.getTotalModel());
                System.out.printf("Harga robot: %d\n", s.getPrice());

                break;
            
            case 3:
                long mileage = sc.nextLong();
                isActive = sc.nextBoolean();
                
                WallE w = new WallE(mileage, isActive);

                System.out.println(w.toString());
                System.out.printf("Jumlah mileage: %d\n", w.getMileage());
                System.out.printf("Harga robot: %d\n", w.getPrice());

                break;
        }

        sc.close();
    }
}
import java.lang.System;
import java.util.Scanner;

public class TokoElektronik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = Integer.parseInt(sc.nextLine());
        int totalPrice = 0;

        for (int i=0; i<amount; i++){
            int type = Integer.parseInt(sc.nextLine());
            String brand = sc.nextLine();
            String model = sc.nextLine();

            if (type == 1){
                // Smartphone
                int storageCapacity = Integer.parseInt(sc.nextLine());
                int batteryLife = Integer.parseInt(sc.nextLine());

                Smartphone s = new Smartphone(brand, model, storageCapacity, batteryLife);

                s.displayDetails();
                System.out.printf("Price: %d\n", s.calculatePrice());
                totalPrice += s.calculatePrice();
            }
            else if (type == 2){
                // Laptop
                String processorType = sc.nextLine();
                int ram = Integer.parseInt(sc.nextLine());
                int touchScreen = Integer.parseInt(sc.nextLine());
                boolean isTouchScreen;
                if (touchScreen == 1) isTouchScreen = true;
                else isTouchScreen = false;

                Laptop l = new Laptop(brand, model, processorType, ram, isTouchScreen);
                
                l.displayDetails();
                System.out.printf("Price: %d\n", l.calculatePrice());
                totalPrice += l.calculatePrice();
            }
            else{
                // Tablet
                int screenSize = Integer.parseInt(sc.nextLine());;
                int cellular = Integer.parseInt(sc.nextLine());;
                boolean hasCellular;
                if (cellular == 1) hasCellular = true;
                else hasCellular = false;

                Tablet t = new Tablet(brand, model, screenSize, hasCellular);

                t.displayDetails();
                System.out.printf("Price: %d\n", t.calculatePrice());
                totalPrice += t.calculatePrice();
            }
        }
        System.out.printf("Total price: %d\n", totalPrice);

        sc.close();
    }
}

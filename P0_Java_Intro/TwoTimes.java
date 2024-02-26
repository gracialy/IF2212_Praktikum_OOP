import java.util.Scanner;

public class TwoTimes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        // or
        // int n = Integer.parseInt(sc.nextLine());

        System.out.println(n * 2);
        
        sc.close();
    }    
}

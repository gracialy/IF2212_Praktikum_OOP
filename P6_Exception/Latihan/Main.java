import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sc.nextLine();
            String op = sc.nextLine();
            Calculator calc = new Calculator();

            try {
                System.out.println(calc.calculate(a, b, op));
            } catch (InvalidOperationException e) {
                System.out.println(e.getClass().getName() + "! " + e.getMessage());
            } catch (InvalidDivisionByZero e) {
                System.out.println(e.getClass().getName() + "! " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Unknown exception!");
        } finally {
            System.out.println("Calculated.");
        }
        
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan parameter System.in
        // ke dalam konstruktor Scanner.

        // Hint 2: Pengambilan double dari input bisa menggunakan method nextDouble() dari scanner
        // Namun perlu diperhatikan bahwa nextDouble() tidak mengkonsumsi newline karakter dari input  
        // Sehingga apabila ingin menggunakan method nextLine() untuk mengambil String
        // setelah pemanggilan method nextDouble(), harus memanggil nextLine() dahulu 
        // untuk menghabisi sisa baris input dari nextDouble().
        sc.close();
    }
    
}
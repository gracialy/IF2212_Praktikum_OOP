import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean error = false;
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Email email = new Email(input);
            sc.close();

            email.validateEmail();
        }
        catch (InvalidDomainException | InvalidEmailException e) {
            System.out.println(e.getClass().getName() + "! " + e.getMessage());
            error = true;
        }
        catch (Exception e) {
            System.out.println(e.getClass().getName());
            error = true;
        }
        finally {
            if (!error) System.out.println("true\nEmail validated.");
            else System.out.println("Email string error!");
            System.out.println("Operation finished.");
        }
    }
}

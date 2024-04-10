import java.util.Scanner;

public class SusAmong {
    public static void main(String[] args) {
        int taskCompleted = 0;
        int playersFrozen = 0;
        int emergencyMeetingCalled = 0;

        Scanner sc = new Scanner(System.in);

        // pemain
        int n = Integer.parseInt(sc.nextLine());
        // impostor
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= m; i++) {
            RedAstronaut red = new RedAstronaut("Impostor " + i);
        }

        for (int i = 1; i <= (n - m); i++) {
            BlueAstronaut blue = new BlueAstronaut("Crewmate " + i);
        }

        while (true) {
            int op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                int idx = Integer.parseInt(sc.nextLine());

                if (Player.getPlayers()[idx] instanceof BlueAstronaut) {
                    BlueAstronaut blue = (BlueAstronaut) (Player.getPlayers()[idx]);
                    blue.completeTask();
                    taskCompleted++;
                } 
            }

            else if (op == 2) {
                int idx_1 = Integer.parseInt(sc.nextLine());

                if (Player.getPlayers()[idx_1] instanceof RedAstronaut) {
                    RedAstronaut red = (RedAstronaut) (Player.getPlayers()[idx_1]);
                    int idx_2 = Integer.parseInt(sc.nextLine());
                    playersFrozen++;
                    red.freeze(Player.getPlayers()[idx_2]);
                }
            } 
            
            else if (op == 3) {
                for (int i = 0; i < n; i++) {
                    Player.getPlayers()[i].emergencyMeeting();
                }
                emergencyMeetingCalled++;
            } 
            
            else if (op == 4) {
                break;
            }

            if (Player.getPlayers()[op].gameOver()) {
                break;
            }
        }

        System.out.println("Task completed: " + taskCompleted);
        System.out.println("Players frozen: " + playersFrozen);
        System.out.println("Emergency meetings called: " + emergencyMeetingCalled);
        System.out.println("Game Over. Thanks for playing!");

        sc.close();
    }
}
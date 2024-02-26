import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int player = sc.nextInt();
        sc.nextLine();
        String seeker = sc.nextLine();

        HideNSeek game = new HideNSeek(seeker, player);

        System.out.printf("Game dimulai dengan %d pemain, seeker adalah %s\n", game.getPlayer(), game.getSeeker());

        while (game.getPlayerFound() < game.getPlayer() - 1){
            int input = sc.nextInt();
            if (input == (game.getPlayerFound() + 1)){
                game.foundPlayer();
                System.out.printf("%d Pemain ditemukan\n", game.getPlayerFound());
            }
        }

        System.out.printf("Semua pemain telah ditemukan, permainan selesai.\n");

        sc.close();
    }
}

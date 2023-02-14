import java.util.Scanner;
public class RPSGameSimulation {/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
    String userReply = "yes";
    Scanner keyboard = new Scanner(System.in);

    do {


        RPSgame aGame = new RPSgame();
        aGame.computerPlay();
        aGame.userPlay();
        int Points = aGame.determineWinner();
        System.out.println(aGame);
        System.out.println("Total Points: "+Points);

        System.out.println("Do you want to play again? ");
        userReply = keyboard.nextLine();

    } while ( userReply.equalsIgnoreCase("yes") );
}
}

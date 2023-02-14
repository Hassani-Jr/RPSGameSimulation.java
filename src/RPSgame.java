import java.util.Scanner;
import java.util.Random;
public class RPSgame {
    char userChoice, computerChoice;
    static int counter = 0;

    {
        userChoice = 'R';
        computerChoice = 'R';
    }

    public char getUserChoice()
    {
        return userChoice;
    }

    public char getComputerChoice()
    {
        return computerChoice;
    }

    public void setUserChoice(char aUserChoice)
    {
        userChoice = aUserChoice;
    }

    public void setComputerChoice(char aComputerChoice)
    {
        computerChoice = aComputerChoice;
    }

    public String toString()
    {
        return "User Choice: " + userChoice + " Computer Choice: " + computerChoice;
    }

    public void computerPlay()
    {
        Random myRan = new Random();
        int numComputerChoice = myRan.nextInt(3);
//        0 = computerChoice = 'R';
//        1 = computerChoice = 'P';
//        2 = computerChoice = 'S';
        switch(numComputerChoice)
        {
            case 0:
                computerChoice = 'R';
                break;
            case 1:
                computerChoice = 'P';
                break;
            case 2:
                computerChoice = 'S';
                break;
        }
        //-------------------------------------

        if (numComputerChoice == 0)
        {
            computerChoice = 'R';
        }
        else if (numComputerChoice == 1)
        {
            computerChoice = 'P';
        }
        else
        {
            computerChoice = 'S';
        }

    }

    public void userPlay()
    {
        Scanner keyboard = new Scanner(System.in);
        String strUserChoice;
        System.out.println("What is your choice - Rock, Paper, or Scissors ?");

        strUserChoice = keyboard.nextLine();
        strUserChoice = strUserChoice.toUpperCase();
        userChoice = strUserChoice.charAt(0);

    }

    public int determineWinner()
    {
        switch(userChoice)
        {
            case 'R':
                if (computerChoice == 'R'){
                    System.out.println("Tie");
                    }
                else if (computerChoice == 'P'){
                    System.out.println("Computer wins!");
                    counter--;
                    }
                else if (computerChoice == 'S'){
                    System.out.println("User wins!");
                    counter++;
                    ;
                break;}
            case 'P':
                if (computerChoice == 'P'){
                    System.out.println("Tie");
                    }
                else if (computerChoice == 'S'){
                    System.out.println("Computer wins!");
                    counter--;
                    }
                else if (computerChoice == 'R'){
                    System.out.println("User wins!");
                    counter++;
                break;}
            case 'S':
                if (computerChoice == 'S'){
                    System.out.println("Tie");
                    }
                else if (computerChoice == 'R'){
                    System.out.println("Computer wins!");
                    counter--;
                }
                else if (computerChoice == 'P'){
                    System.out.println("User wins!");
                    counter++;
                    }
                break;

            default:
                System.out.println("Invalid User Choice - Cannot determine winner.");
        }
        return counter;
    }
}
package DiceGame;
import java.util.Random;
import java.util.Scanner;
public class DiceWithRounds
{
    String [][] graphics =
    {
        {
           "___________",
           "|         |",
           "|         |",
           "|    *    |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "|         |",
           "|         |",
           "| *     * |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "|         |",
           "|         |",
           "| *  *  * |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "|         |",
           "|         |",
           "|_*_____*_|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "|    *    |",
           "|         |",
           "|_*_____*_|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "| *     * |",
           "|         |",
           "|_*_____*_|"
        }
    };

    void printSideBySide(int userRoll,int computerRoll)
    {
      System.out.printf("%-15s %13s\n","You","Computer");
        for(int i=0;i<6;i++)
        {
            System.out.printf("%-15s %15s\n",graphics[userRoll-1][i],graphics[computerRoll-1][i]);
        }       
    }

    void Rounds(Scanner sc,Random random)
    {
      int a=0,b=0;
         System.out.print("Enter the number of rounds : ");
         int r=sc.nextInt();
         if (r <= 0) {
            System.out.println("Invalid number of rounds. Please enter a positive integer.");
            return;
        }        
         for(int i=0;i<r;i++)
         {
            int userRoll=random.nextInt(6)+1;
            int computerRoll=random.nextInt(6)+1;
            printSideBySide(userRoll, computerRoll);

            if(userRoll<computerRoll)
            {
               b++;
               System.out.println("Computer Won!");
            }
            else if(userRoll>computerRoll)
            {
               a++;
               System.out.println("You Won!");
            }
            else
            System.out.println("It's a Tie!");
            ScoreBoard(a, b);
         }
         
         if(a<b)
         System.out.println("Winner : Computer");
         else if(a>b)
         System.out.println("Winner : You");
         else
         System.out.println("Result : Tie!");
    }

    void ScoreBoard(int a,int b)
    {
      System.out.println("\nScores \nYou : "+a+"\nComputer : "+b+"\n");
    }

    public static void main(String[] args)
    {
      DiceWithRounds d=new DiceWithRounds();
      Random random=new Random();
      Scanner sc=new Scanner(System.in);

      d.Rounds(sc,random);
    }
}
package DiceGame;
import java.util.Random;
public class DiceSideBySide
{
    String [][] graphics =
    {
        // Storing Graphics in the form of 6 lines abd will later print these 6 lines using a loop
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
    public static void main(String[] args)
    {
        DiceSideBySide d=new DiceSideBySide();
        Random random=new Random();

        int userRoll=random.nextInt(6)+1;
        int computerRoll=random.nextInt(6)+1;

        d.printSideBySide(userRoll, computerRoll);

        if(userRoll>computerRoll)
        System.out.println("You Won!");
        else if(userRoll<computerRoll)
        System.out.println("Computer Won!");
        else
        System.out.println("It's a Tie!");

    }
}

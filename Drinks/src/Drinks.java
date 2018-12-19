import java.util.Scanner;
/**
 * Write a description of class Drinks here.
 *
 * @author C.G.Stewart
 * @version 21/09/18
 */
public class Drinks
{
    // instance variables - replace the example below with your own
    private String drink;
    private boolean isDrunk;
    private String s;
    private String t;

    /**
     * Constructor for objects of class Drinks
     */
    public Drinks(String drink)
    {
        // initialise instance variables
        this.drink = drink;
        this.s = s;
        this.t = t;
        this.isDrunk = isDrunk;
    }

    /**
     * This method enquires as to whether the customer has finished their drink and then
     * calls the drink() method to continue the program.
     */
    public void firstQuestion()
    {
        System.out.println("Have you finished your " + drink + "?");
        Scanner answer = new Scanner(System.in);
        s = answer.nextLine();

        if(s.equals("Yes"))
        {
            drink();
            secondQuestion();
        }
        else if(s.equals("No"))
        {
            System.out.println("That's fine. Come again soon.");
        }
    }

    public void secondQuestion()
    {
        System.out.println("Would you like a refill?");
        Scanner secondAnswer = new Scanner(System.in);
        t = secondAnswer.nextLine();

        if(t.equals("Yes"))
        {
            System.out.println("Here is your refill");
        }
        else if(t.equals("No"))
        {
            System.out.println("I'll come back later");
        }
    }

    /**
     * This method enquires as to whether the input to the Scanner was "yes" or "no".
     * If yes, it asks whether a refill is required. Else, it says goodbye to the
     * customer.
     */
    public void drink()
    {
        if(s.equals("Yes"))
        {
            System.out.println("The " + drink + " has been drunk.");
        }
    }
}
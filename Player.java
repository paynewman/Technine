import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
     ArrayList<Card> hand = new ArrayList<Card>();
     Random rand = new Random();
    
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
       
    }

    //adding card to hand
    public void addCard(Card c) {
        hand.add(c);
    }
    
    public int getTotal() {
        //loop through hand, get values from each card and add to a total.  Return the total
        int total = 0;
        
        for(Card c: hand) {
            
            
            total += c.getValue();
            
        }
        //System.out.println("Your total was "+total);
        return total;
    }
    
    public String toString() {
        String temp = "";
        int total = 0;
        
        for(Card c: hand) {
            temp += "Card: " + c.getRank() + " of " + c.getSuit() + "\n";
            
            total += c.getValue();
        }
        
        if (total < 22) { 
        temp += "\n The total is " + total;
        
        return temp;
       }
       else {
           temp += "\n The total is " + total + " so...YOU BUSTED! Pass to end game";
           return temp;
        }
    }
    
    //hit or pass
    public void hitorpass() {
      System.out.println("\n Would you like to hit or pass?");
      Scanner sc = new Scanner(System.in);
      String answer = sc.nextLine();
      if (answer.equals("hit")) {
           Card c = new Card((rand.nextInt(3)), (rand.nextInt(13)));
           addCard(c);
           System.out.println(toString());
           hitorpass();
    }
    
        else if (answer.equals("pass")){
          System.out.println("You passed");
    }
    
   else {
       System.out.println("Did you say hit or pass?");
    }
      
    }
}

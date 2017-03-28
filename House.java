import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
     ArrayList<Card> hand = new ArrayList<Card>();
     Random rand = new Random();
     public int total = 0;
    /**
     * Constructor for objects of class Player
     */
    public House()
    {
       
    }

    //add card to hand of dealer
    public void addCard(Card c) {
        hand.add(c);
        total = 0;
        updateTotal();
    }
    
    public int getTotal() {
        //loop through hand, get values from each card and add to a total.  Return the total
        int total = 0;
        
        for(Card c: hand) {
            total += c.getValue();
            
        }
        //System.out.println("The dealer had "+total);
        return total;
    }
    
    public void updateTotal() {
          for(Card c: hand) {
            //temp += "Card: " + c.getRank() + " of " + c.getSuit() + "\n";
            
            total += c.getValue();
        }
    }
    
    //to String method
    public String toString() {
        String temp = "";
        
        
      
        
        if (total < 22) { 
        temp += "\n The dealers total is " + total;
        
        return temp;
       }
       else {
           temp += "\n The dealers total is " + total + " so...THE DEALER BUSTED!";
           return temp;
        }
    }
    
    //hit or pass
    public void hitorpass() {
      if (total < 17) {
           Card c = new Card((rand.nextInt(3)), (rand.nextInt(13)));
           addCard(c);
           hitorpass();
    }
    
        else {
          System.out.println(toString());
         
    }
      
    }
}


import java.util.Random;
import java.util.Scanner;

public class BlackjackDriver
{  
    public static void main(String[] args) {
       //introduction
        System.out.println("Hello Player, here are your first two cards");
       
       
       System.out.println("");
       
       //random generator
       Random rand = new Random();
       //creates player
       Player p1 = new Player();
       //randomly selects first card
       Card Card1 = new Card((rand.nextInt(3)), (rand.nextInt(13)));
       
       System.out.println("");
       //randomly selects second card
       Card Card2 = new Card((rand.nextInt(3)), (rand.nextInt(13)));
       
       System.out.println("");
       //adding cards to array list
       p1.addCard(Card1);
       p1.addCard(Card2);
       System.out.println(p1); //toString in player
       //prints total so far
       System.out.println("");
       p1.hitorpass();
      //if player did not bust, the dealer contniues his/her hand
       if (p1.getTotal() < 22) {
       
       
       //dealer get his/her first two cards
       House h1 = new House();
       Card Card3 = new Card((rand.nextInt(3)), (rand.nextInt(13)));
       Card Card4 = new Card((rand.nextInt(3)), (rand.nextInt(13)));
       h1.hitorpass();
       
       //determines who wins by comparing totals
       if (p1.getTotal() > h1.getTotal()) {
          if ( p1.getTotal()<22){
          System.out.println("");
          System.out.println("YOU WIN!");
        }
        else{
            System.out.println("YOU LOSE!");
        }
        }
        
       else if (h1.getTotal() > p1.getTotal()) {
          if ( h1.getTotal()<22){
          System.out.println("");
          System.out.println("YOU LOSE!");
        }
        else{
            System.out.println("YOU WIN!");
        }
        }
       else {
          System.out.println("");
          System.out.println("YOU LOSE!");
          
        }
    }
}
    
      
  }
  /**
  public void whowins() {
      if (p1.total > h1.total) {
          System.out.println("");
          System.out.println("YOU WIN!");
        }
        
       else if (h1.total > p1.total) {
          System.out.println("");
          System.out.println("YOU LOSE!");
        }
      else {
          System.out.println("");
          System.out.println("You tied so YOU LOSE!");
          
        }
    }
  
  */
  


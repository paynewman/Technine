
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card 
{
    //sets values to zero and creates arrays of deck of cards
    int suitIndex = 0;
    int rankIndex = 0;
    int cardValue = 0;
    String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    int totalValue = 0;
    public Card(int suit, int rank)
    {
        this.suitIndex = suit;
        this.rankIndex = rank;
    }
    
    //getters
    public String getSuit() {
        return suits[suitIndex];
    }
    
    public String getRank() {
        return ranks[rankIndex];
    }
    
    public int getValue() {
        if(rankIndex > 9) {
           cardValue = 10;
        }
        else if(rankIndex == 0) {
           cardValue = 11;
        }
        else {
           cardValue = rankIndex + 1;
        }
        totalValue += cardValue;
        return cardValue;
    }
    
 
}

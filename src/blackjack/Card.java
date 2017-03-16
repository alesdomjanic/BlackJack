
package blackjack;
import java.util.Random;

public class Card {
    
    private Barva barva;
    private Rank rank;
    private int Value;
    
    public Card(Barva barva,Rank rank){
        this.barva = barva;
        this.rank = rank;
        
    }
    
    public int Value(){
        
        Random rand = new Random();
        int PlayerCard = rand.nextInt(13) + 1;
        
        switch(PlayerCard){
            case 2:
                rank = "TWO";
                Value = 2;
                break;
            case 3:
                rank = "THREE";
                Value = 3;
                break;
            case 4:
                rank = "FOUR";
                Value = 4;
                break;
            case 5:
                rank = "FIVE";
                Value = 5;
                break;
            case 6:
                rank = "SIX";
                Value = 6;
                break;
            case 7:
                rank = "SEVEN";
                Value = 7;
                break;
            case 8:
                rank = "EIGHT";
                Value = 8;
                break;
            case 9:
                rank = "NINE";
                Value = 9;
                break;
            case 10:
                rank= "TEN"
                Value = 10;
                break;
            case 11:
                rank= "JACK"
                Value = 10;
                break;
            case 12:
                rank= "QUEEN"
                Value = 10;
                break;   
            case 13:
                rank= "KING"
                Value = 10;
                break;
            case 14:
                rank= "AS"
                Value = 11;
                break;  
        }
        
        return PlayerCard;
        
    }
    
    
}

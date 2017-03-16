
package blackjack;

public class Card {
    
    private Barva barva;
    private Rank rank;
    private int Value;
    private String Rank;
    
    public Card(Barva barva,Rank rank){
        this.barva = barva;
        this.rank = rank;
        
    }
    
    public int Value(){
        
        int PlayerCard = 0;
        
        switch(PlayerCard){
            case 2:
                Rank = "TWO";
                Value = 2;
                break;
            case 3:
                Rank = "THREE";
                Value = 3;
                break;
            case 4:
                Rank = "FOUR";
                Value = 4;
                break;
            case 5:
                Rank = "FIVE";
                Value = 5;
                break;
            case 6:
                Rank = "SIX";
                Value = 6;
                break;
            case 7:
                Rank = "SEVEN";
                Value = 7;
                break;
            case 8:
                Rank = "EIGHT";
                Value = 8;
                break;
            case 9:
                Rank = "NINE";
                Value = 9;
                break;
            case 10:
                Rank= "TEN";
                Value = 10;
                break;
            case 11:
                Rank= "JACK";
                Value = 10;
                break;
            case 12:
                Rank= "QUEEN";
                Value = 10;
                break;   
            case 13:
                Rank= "KING";
                Value = 10;
                break;
            case 14:
                Rank= "AS";
                Value = 11;
                break;  
        }
        
        return PlayerCard;
        
    }
    
    
}

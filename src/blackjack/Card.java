
package blackjack;

public class Card {

    private Barva barva;
    private Rank rank;
    
    public Card(Barva barva,Rank rank){
        this.barva = barva;
        this.rank = rank;
        
    }
    
    public int getValue(){
        
        switch(rank){
        case TWO: return 2;
        case THREE: return 3;
        case FOUR: return 4;
        case FIVE: return 5;
        case SIX: return 6;
        case SEVEN: return 7;
        case EIGHT: return 8;
        case NINE: return 9;
        case TEN: return 10;
        case JACK: return 10;
        case QUEEN: return 10;
        case KING: return 10;
        case AS: return 11;
        default:return 0;
        }
        
    }
    
    public void izpis(){
        System.out.println(rank+" of "+barva);
        
    }
    
    public String getCardToString(){
        return rank+" of "+barva;
        
    }
        
    }
    
    
    
    


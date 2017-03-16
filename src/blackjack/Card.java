
package blackjack;

public class Card {
    
    private Barva barva;
    private Rank rank;
    
    public Card(Barva barva,Rank rank){
        this.barva = barva;
        this.rank = rank;
        
    }
    
    public void getValue(){
        
        switch(rank){
        case TWO: System.out.println(2);
        case THREE: System.out.println(3);
        case FOUR: System.out.println(4);
        case FIVE: System.out.println(5);
        case SIX: System.out.println(6);
        case SEVEN: System.out.println(7);
        case EIGHT: System.out.println(8);
        case NINE: System.out.println(9);
        case TEN: System.out.println(10);
        case JACK: System.out.println(10);
        case QUEEN: System.out.println(10);
        case KING: System.out.println(10);
        case AS: System.out.println(11);
        }
        
    }
        
    }
    
    
    
    


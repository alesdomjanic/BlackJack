
package blackjack;

import java.util.ArrayList;


public class Deck6 {
    private ArrayList<Card> deck6;
    private Card rand;
   
    public Deck6() {

        deck6 = new ArrayList<Card>();
        barva6(Barva.CLUBS);
        barva6(Barva.DIAMONDS);
        barva6(Barva.HEARTS);
        barva6(Barva.SPADES);
        
    }
    
    private void barva6(Barva b) {
       for(int i=0;i<6;i++){
        deck6.add(new Card(b, Rank.TWO));
        deck6.add(new Card(b, Rank.THREE));
        deck6.add(new Card(b, Rank.FOUR));
        deck6.add(new Card(b, Rank.FIVE));
        deck6.add(new Card(b, Rank.SIX));
        deck6.add(new Card(b, Rank.SEVEN));
        deck6.add(new Card(b, Rank.EIGHT));
        deck6.add(new Card(b, Rank.NINE));
        deck6.add(new Card(b, Rank.TEN));
        deck6.add(new Card(b, Rank.JACK));
        deck6.add(new Card(b, Rank.QUEEN));
        deck6.add(new Card(b, Rank.KING));
        deck6.add(new Card(b, Rank.AS));
       }
    }
    
    public void izpis(){
        for(int i=0;i<deck6.size();i++){
            deck6.get(i).izpis();
        }
    }
    
    public Card getRandomCard6(){

        Card c6;
        int rand6 = (int) (Math.random() * deck6.size());
        c6 = deck6.get(rand6);
        deck6.remove(rand6);
        return c6;
    }
    
    
    
    
}



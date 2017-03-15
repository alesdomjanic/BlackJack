
package blackjack;

import java.util.Random;


public class BlackJack {

    
    public static void main(String[] args) {
        
        
    }
    
    
    public class Card{
        private int rand;
        private int value;
        private int suit;
        
        public Card(){
            
            Random random=new Random();
            int number=random.nextInt(52);
            this.rand=number;
            
            if(this.rand >=0 && this.rand <3){
                this.value=2;
            }
            
        }
        
    }
    
}

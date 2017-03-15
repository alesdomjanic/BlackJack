
package blackjack;

import java.util.Random;


public class BlackJack {

    
    public static void main(String[] args) {
        
        
    }
    
    
    public class Card{
        private int rand;
        private int value;
        
        
        public Card(){
            
            Random random=new Random();
            int number=random.nextInt(52);
            this.rand=number;
            
            if(this.rand ==0){
                this.value=1;
            }
            if(this.rand >=10){
                this.value=10;
        }
            
            
        }
        
    }
    
    public class Deck{

        
        public Deck(){
            
            
            
        }
    }
    
}


package lombrino_rpg;


public class Paladin extends Swordsman {
      private boolean hasResurrected;
    
    
    public Paladin(int health, int damage, int shield){
       super(health, damage, shield);
      
       
        hasResurrected = false;
    }

    
        public void receiveDamage(int damage){
            
            if (damage %2 == 0){
               damage = damage / 2 ;
               
            }
        }
        
        public void resurrect (){
            if (hasResurrected = false){
                hasResurrected = true;
                int health = 100;
            } else {
                System.out.println("Paladin has died.");
            }
        }
}

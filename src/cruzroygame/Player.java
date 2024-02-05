
package cruzroygame;

import java.util.Random;

public class Player {
    
    private boolean is_Alive = true;
    
    private String name;
    private int health;
    private int attackPower;
    
    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    //getter and setter
     public boolean getIs_Alive() {
        return is_Alive;
    }

    public void setIs_Alive(boolean is_Alive) {
        this.is_Alive = is_Alive;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public void attack(Player opponent){
        Random random = new Random();
        
        System.out.printf("%s is being attacked\n",name);
        
        int randomNum = random.nextInt(20) + 1;
        this.health = health - (randomNum + opponent.getAttackPower());
        
        if (this.health > 0) {
            System.out.printf("%s health : %d\n\n",name, health);
        }
        else if (this.health <= 0) {
            
            this.health = 0;
            this.is_Alive = false;
            System.out.printf("%s health : %d\n\n",name, health);
            
        }
        else{
            System.out.println("error");
        }
        
    }
    
    public boolean isAlive(){
        
        this.is_Alive = true;
        if (this.health > 0) {
            System.out.printf("Player %s is still alive", name);
        }
        else if(this.health <= 0){
            System.out.printf("Player %s is dead", name);
        }
        else{
            this.health = 0;
            System.out.printf("Player %s is dead", name);
        }
        
        return this.is_Alive;
    }
    
    
}


package cruzroygame;

import java.util.Scanner;

public class CruzRoyGame {
    
    public static String name;
    public static int health;
    public static int attackPower;
    
    public static Player player1 = new Player(name, health, attackPower);
    public static Player player2 = new Player(name, health, attackPower);
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter a name for player 1 :");
        name = inp.nextLine();
        System.out.println("Enter a health for player 1 :");
        health = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter attack power for player 1 :");
        attackPower = inp.nextInt();
        inp.nextLine();
        System.out.println("");
        
        player1 = new Player(name, health, attackPower);
        
        System.out.println("Enter a name for player 2 :");
        name = inp.nextLine();
        System.out.println("Enter a health for player 2 :");
        health = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter attack power for player 2 :");
        attackPower = inp.nextInt();
        inp.nextLine();
        System.out.println("");

        player2 = new Player(name, health, attackPower);
        
        
        Exit:
        do {
            System.out.println("[1] attack\n[2] is alive\n[3] end");
            
            int choice = inp.nextInt();
            inp.nextLine();
            
            switch (choice){
            
                case 1:
                    player1.attack(player2);
        
                    System.out.printf("Player 1 \nname :%s\nhealth :%d\nattack power :%d\n",player1.getName(),player1.getHealth(),player1.getAttackPower());
                    System.out.println("");

                    player2.attack(player1);

                    System.out.printf("Player 2 \nname :%s\nhealth :%d\nattack power :%d\n",player2.getName(),player2.getHealth(),player2.getAttackPower());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("PLAYER NUMBER: ");
                    int pNum = inp.nextInt();
                    if (pNum == 1) {
                        player1.isAlive();
                    }else if (pNum ==  2) {
                        player2.isAlive();
                    }else{
                        System.out.println("Invalid player number");
                    }
                    
                    break;
                case 3:
                    System.out.println("Ending the game\n");
                    break Exit;
                
            }
            
        } while (player1.getIs_Alive() && player2.getIs_Alive());
        
        if (player1.getHealth() > player2.getHealth()) {
            System.out.print("Player 1 is the WINNER");
        }
        else if (player1.getHealth() < player2.getHealth()) {
            System.out.println("Player 2 is the WINNER");
        }else{
            System.out.println("DRAW");
        }
        
    }
    
}

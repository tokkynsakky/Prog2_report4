import jp.ac.uryukyu.ie.e215711.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        
        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());//hero.name -> hero.getHeroName() , enemy.name -> enemy.getEnemyname()

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead()== false ){//hero.dead -> hero.isHeroDead() , enemy.dead -> enemy.isEnemyDead()
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}
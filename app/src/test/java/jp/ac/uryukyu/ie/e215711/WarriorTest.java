package jp.ac.uryukyu.ie.e215711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    
    @Test
    void attackTest() {
        Warrior warrior = new Warrior("戦士", 10000,7);
        Enemy enemy = new Enemy("スライム", 10000, 3);

        for(int turn = 0; turn < 3; turn++){
            int Hp = enemy.hitPoint;
            warrior.attackWithWeponSkill(enemy);
            int woundedHp = enemy.hitPoint;
            int attack = warrior.getAttack() * warrior.getRandom();
            //attackの1.5倍になっているかのテストをするが、attackにはrandom()の影響を受けているはずなので、予めattackはrandom()の影響を受けたものとする。
            assertEquals((int)(attack * 1.5) ,Hp - woundedHp);
            /*
            純粋に1.5倍はHp - woundedHpがint型しか受け付けないwoundedメソッドを用いているので、attack * 1.5　もHpの計算と同様に
            小数点以下の切り捨てをする。小数点以下の誤差しかないので、しっかり1.5倍になっているとみて問題ないと考えられる。
            */
            }
        }
    }
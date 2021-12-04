package jp.ac.uryukyu.ie.e215711;

public class Warrior extends LivingThing{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }
    int random = 0;
    int damage = 0;
    
    public void attackWithWeponSkill(LivingThing opponent){
        if(hitPoint>0){
        this.random = (int)Math.floor(Math.random() * 10);//これに*10だと1.5の小数点の問題は解決か？  0~1 の範囲から　0~10　の範囲にスケールを拡大
        double scale = 1.5;
        int damage = (int)(random * attack * scale);// random -> Math.random()
        this.damage = damage;
        System.out.printf("戦士%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded((int)damage);
        }
        
    }

    public int getRandom(){
        return random;
    }

    public int getDamage(){
        return damage;
    }

    public int getAttack(){
        return attack;
    }   
}

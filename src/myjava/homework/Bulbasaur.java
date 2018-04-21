package myjava.homework;

public class Bulbasaur extends pokemon{
    public Bulbasaur(){
        super(20,40,0);
    }
    public int action(){

    }
    public int attack_skill(){
        return getATK()*4+(int)(Math.random()*11);
    }
    public int defense_skill(){
        return getATK()*4+(int)(Math.random()*11);
    }
    public int buff_skill(){
        int newHp = getHP() + getATK()*2+(int)(Math.random()*11);
        if(newHp > 40)newHp = 40;
        return newHp;
    }
}

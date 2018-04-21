package myjava.homework;

public class Charizard extends pokemon{
    public Charizard(){
        super(60,200,30);
    }
    public int action(){

    }
    public int attack_skill(){
        int CRI_result = (int)(Math.random()*100+1);
        if(getUnique()>=CRI_result){
            return (getATK()+(int)(Math.random()*11))*2;
        }
        else{
            return getATK()+(int)(Math.random()*11);
        }
    }
    public int defense_skill(){
        return 1;
    }
    public int buff_skill(){
        int newCRI = getUnique()*5/4;
        if(newCRI >100)newCRI = 100;
        return newCRI;
    }
}

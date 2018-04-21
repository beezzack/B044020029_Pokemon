package myjava.homework;

public class Pikachu extends pokemon{
    public Pikachu(){
        super(40,80,20);
    }
    public int action(){
        Keypad  keypad = new Keypad();
        System.out.println("(1) Thunder Shock  (2)Double Team (3)Thunder (4)Catch");
        int option = keypad.getInput();
        if(option == 1){
            return attack_skill();
        }
        else if(option == 2){
            setUnique(defense_skill());
            return 0;
        }
        else if(option == 3){
            return buff_skill();
        }
        else if(option == 4){

        }
        else{

        }
    }
    public int attack_skill(){

        return getATK()+(int)(Math.random()*11);
    }
    public int defense_skill(){
        int defensePoint = getUnique()*2;
        if(defensePoint >100)defensePoint=100;
        return defensePoint;
    }
    public int buff_skill(){
        return getATK()*2;
    }
}

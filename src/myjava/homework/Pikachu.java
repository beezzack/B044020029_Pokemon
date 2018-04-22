package myjava.homework;

public class Pikachu extends pokemon{
    public Pikachu(){
        super(40,80,20);
    }
    public int action(int WildpokemonATK){
        Keypad  keypad = new Keypad();
        int return_point = 0;
        System.out.println("(1) Thunder Shock  (2)Double Team (3)Thunder (4)Catch");
        System.out.println("Action :(By default(1))");
        int option = keypad.getInput();
        if(option == 1){
            return_point = attack_skill();
        }
        else if(option == 2){
            setUnique(defense_skill());
        }
        else if(option == 3){
            return_point = buff_skill();
        }
        else if(option == 4){
            return -1;/*catch*/
        }
        else{
            return_point = attack_skill();
        }
        return return_point;
    }
    public int attack_skill(){
        int attack_point = getATK()+(int)(Math.random()*11);
        System.out.println("[Thunder Shock]: " + attack_point+ " points");
        return attack_point;
    }
    public int defense_skill(){
        System.out.println("[Double Team] : EVA +"+getUnique()+" points" );
        int defensePoint = getUnique()*2;
        if(defensePoint >100)defensePoint=100;
        return defensePoint;
    }
    public int buff_skill(){
        System.out.println("[Thunder] : ATK +"+getATK()+" points" );
        return getATK()*2;
    }
}

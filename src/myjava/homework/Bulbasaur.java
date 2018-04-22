package myjava.homework;

public class Bulbasaur extends pokemon{
    public Bulbasaur(){
        super(20,40,0);
    }
    public int action(int WildpokemonATK){
        Keypad  keypad = new Keypad();
        int return_point = 0;
        System.out.println("(1) Razor Leaf  (2)Light Screen (3)Synthesis (4)Catch");
        int option = keypad.getInput();
        if(option == 1){
            return_point = attack_skill();
            System.out.println("[Razor Leaf]: " + return_point+ " points");
        }
        else if(option == 2){
            int screenPoint = defense_skill();
            if(screenPoint >= 0){
                System.out.println("[Light Screen]: EVA+" + (defense_skill()+getATK()*4)+ " points");
                setUnique(defense_skill()+getATK()*4);
            }

        }
        else if(option == 3){
            int addHP = buff_skill();
            System.out.println("[Synthesis]: HP+" + addHP+ " points");
            if((getHP() + addHP)>40)setHp(40);
            else{
                setHp(getHP() + addHP);
            }

        }
        else if(option == 4){
            return -1;/*catch*/
        }
        else{
            return_point = attack_skill();
            System.out.println("[Razor Leaf]: " + return_point+ " points");
        }
        return return_point;
    }
    public int attack_skill(){
        return getATK()*4+(int)(Math.random()*11);
    }
    public int defense_skill(){
        if(getUnique() > 0){
            System.out.println("No effect!");
            return -1;
        }
        else{
            return (int)(Math.random()*11);
        }
    }
    public int buff_skill(){
        return getATK()*2+(int)(Math.random()*11);
    }
}

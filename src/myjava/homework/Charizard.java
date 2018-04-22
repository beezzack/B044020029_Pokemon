package myjava.homework;

public class Charizard extends pokemon{
    public Charizard(){
        super(60,200,30);
    }
    public int action(int WildpokemonATK){
        Keypad  keypad = new Keypad();
        int return_point = 0;
        System.out.println("(1) Flamethrower  (2)Parry (3)Work Up (4)Catch");
        int option = keypad.getInput();
        if(option == 1){
            return_point = attack_skill();
        }
        else if(option == 2){
            if(defense_skill() == 1){

                return_point = WildpokemonATK;
            }
        }
        else if(option == 3){
            setUnique(buff_skill());
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
        int CRI_result = (int)(Math.random()*100+1);
        int attack_point;
        if(getUnique()>=CRI_result){/*20% 只有CRI_result = 1~20成功*/
            attack_point = (getATK()+(int)(Math.random()*11))*2;
            System.out.println("[Flamethrower]: "+attack_point+" damage");
            return attack_point;
        }
        else{
            attack_point = getATK()+(int)(Math.random());
            System.out.println("[Flamethrower]: "+attack_point+" damage");
            return attack_point;
        }
    }
    public int defense_skill(){
        System.out.println("[Parry]: return next damage");
        return 1;
    }
    public int buff_skill(){
        int newCRI = getUnique()*5/4;
        if(newCRI >100)newCRI = 100;
        System.out.println("[Work up]: CRI" + newCRI+"%");
        return newCRI;
    }
}

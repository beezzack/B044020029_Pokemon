package myjava.homework;


public class HW6_main {
    public static void main(String[] args){
        int WildpokemonHP,WildpokemonATK, Wildpokemonfull_HP;
        int Wild_lost_hp;
        String pokename;
        Keypad keypad = new Keypad();
        System.out.println("(1) Pikachu (2) Bulbasaur (3) Charizard");
        System.out.println("Choose your pokemon(By default(1)) :");
        int option = keypad.getInput();
        pokemon newPokemon;
        if(option == 1){
            newPokemon = new Pikachu();
            System.out.println("Pikachu");
            pokename = "Pikachu";
        }
        else if(option == 2){
            newPokemon = new Bulbasaur();
            System.out.println("Bulbasaur");
            pokename = "Bulbasaur";
        }
        else if(option == 3){
            newPokemon = new Charizard();
            System.out.println("Charizard");
            pokename = "Charizard";
        }
        else{
            option = 1;
            newPokemon = new Pikachu();
            System.out.println("Pikachu(de)");
            pokename = "Pikachu";
        }
        System.out.println("[Wild pokemon appeared!]");
        WildpokemonATK = (int)(Math.random()*6+30);
        WildpokemonHP = (int)(Math.random()*151+150);
        Wildpokemonfull_HP = WildpokemonHP;
        do{
            System.out.println("-----Pokemon-----      -----Wild Pokemon-----");
            System.out.println("-----HP:"+newPokemon.getHP()+"            HP:"+WildpokemonHP+"-----");
            System.out.println("----ATK:"+newPokemon.getATK()+"           ATK:"+WildpokemonATK+"-----");
            System.out.println("----EVA:"+newPokemon.getUnique());
            System.out.println("---------------------------------------------");
            int WildpokemonAttack_point = WildpokemonATK + (int)(Math.random()*11);
            /*-------------------------------------------------------------------------*/
            Wild_lost_hp = newPokemon.action(WildpokemonAttack_point);
            /*-----------------------------------------------------------------------------*/
            if(Wild_lost_hp == -1){/*先判定是否catch*/
                System.out.println("[catch]: Throw the Poke ball");
                /*System.out.println("Wildpokemonfull_HP"+ Wildpokemonfull_HP);
                System.out.println("WildpokemonHP"+ WildpokemonHP);
                System.out.println("catchChance"+ (Wildpokemonfull_HP - WildpokemonHP));*/
                float catchChance = ((float) (Wildpokemonfull_HP-WildpokemonHP)/Wildpokemonfull_HP)*100;
                int catchResult = (int)(Math.random()*100+1);
                System.out.println(catchChance + "vs" + catchResult);
                if(catchChance>=catchResult){
                    System.out.println("gotcha!!!");
                    WildpokemonHP = 0;
                }
                else{
                    System.out.println("you did not catch that pokemon");
                    System.out.println("[Wild Pokemon]:"+WildpokemonAttack_point+"damage.");/*Wildpokemon attack*/
                    if(option == 1){
                        int attack_success_chance = (int)(Math.random()*100+1);
                        if(newPokemon.getUnique()>=attack_success_chance){
                            System.out.println("Evasion Success");
                        }
                        else{
                            System.out.println("["+pokename+"]: HP-"+WildpokemonAttack_point+"points.");
                            newPokemon.setHp(newPokemon.getHP()-WildpokemonAttack_point);
                        }
                    }
                    else if(option == 2){
                        if(WildpokemonAttack_point >= newPokemon.getUnique()){
                            System.out.println("[Light Shield]: Shield-"+newPokemon.getUnique()+"points.");
                            System.out.println("["+pokename+"]: HP-"+(WildpokemonAttack_point-newPokemon.getUnique()) +"points.");
                            newPokemon.setHp(newPokemon.getHP()-(WildpokemonAttack_point-newPokemon.getUnique()));
                            newPokemon.setUnique(0);
                        }
                        else{
                            System.out.println("[Light Shield]: Shield-"+WildpokemonAttack_point+"points.");
                            newPokemon.setUnique(newPokemon.getUnique() - WildpokemonAttack_point);
                        }
                    }
                    else{
                        System.out.println("["+pokename+"]: HP-"+WildpokemonAttack_point+"points.");
                        newPokemon.setHp(newPokemon.getHP() - WildpokemonAttack_point);
                    }
                }
            }
            else if(Wild_lost_hp>=0){
                System.out.println("[Wild Pokemon]:"+WildpokemonAttack_point+"damage.");/*Wildpokemon attack*/
                WildpokemonHP -= Wild_lost_hp;
                if(WildpokemonHP>0){
                    if(option == 1){
                        int attack_success_chance = (int)(Math.random()*100+1);
                        if(newPokemon.getUnique()>=attack_success_chance){
                            System.out.println("Evasion Success");
                        }
                        else{
                            System.out.println("["+pokename+"]: HP-"+WildpokemonAttack_point+"points.");
                            newPokemon.setHp(newPokemon.getHP()-WildpokemonAttack_point);
                        }
                    }
                    else if(option == 2){
                        if(WildpokemonAttack_point >= newPokemon.getUnique()){
                            System.out.println("[Light Shield]: Shield-"+newPokemon.getUnique()+"points.");
                            System.out.println("["+pokename+"]: HP-"+(WildpokemonAttack_point-newPokemon.getUnique()) +"points.");
                            newPokemon.setHp(newPokemon.getHP()-(WildpokemonAttack_point-newPokemon.getUnique()));
                            newPokemon.setUnique(0);
                        }
                        else{
                            System.out.println("[Light Shield]: Shield-"+WildpokemonAttack_point+"points.");
                            newPokemon.setUnique(newPokemon.getUnique() - WildpokemonAttack_point);
                        }
                    }
                    else{
                        System.out.println("["+pokename+"]: HP-"+WildpokemonAttack_point+"points.");
                        newPokemon.setHp(newPokemon.getHP() - WildpokemonAttack_point);
                    }
                }
            }

        }while(newPokemon.getHP()>0 && WildpokemonHP>0);

        if(newPokemon.getHP() <= 0)newPokemon.setHp(0);
        if(WildpokemonHP <= 0)WildpokemonHP = 0;
        System.out.println("-----Pokemon-----      -----Wild Pokemon-----");
        System.out.println("-----HP:"+newPokemon.getHP()+"            HP:"+WildpokemonHP+"-----");
        System.out.println("----ATK:"+newPokemon.getATK()+"           ATK:"+WildpokemonATK+"-----");
        System.out.println("----EVA:"+newPokemon.getUnique());
        System.out.println("---------------------------------------------");
        if(newPokemon.getHP() <= 0){
            System.out.println("you lose");
        }
        else if(WildpokemonHP <= 0){
            System.out.println("you win");
        }
    }
}

package myjava.homework;


public class HW6_main {
    public static void main(String[] args){
        int WildpokemonHP,WildpokemonATK;
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
            newPokemon = new Pikachu();
            System.out.println("Pikachu(de)");
            pokename = "Pikachu";
        }
        System.out.println("[Wild pokemon appeared!]");
        WildpokemonATK = (int)(Math.random()*6+30);
        WildpokemonHP = (int)(Math.random()*151+150);
        do{
            System.out.println("-----Pokemon-----      -----Wild Pokemon-----");
            System.out.println("-----HP:"+newPokemon.getHP()+"            HP:"+WildpokemonHP+"-----");
            System.out.println("----ATK:"+newPokemon.getATK()+"           ATK:"+WildpokemonATK+"-----");
            System.out.println("----EVA:"+newPokemon.getUnique());
            System.out.println("---------------------------------------------");
            Wild_lost_hp = newPokemon.action();
            int WildpokemonAttack_point = WildpokemonATK + (int)(Math.random()*11);
            System.out.println("[Wild Pokemon]:"+WildpokemonAttack_point+"damage.");
            System.out.println("["+pokename+"]: HP-"+WildpokemonAttack_point+"points.");
            WildpokemonHP -= Wild_lost_hp;
            if(WildpokemonHP>0){
                newPokemon.setHp(newPokemon.getHP()-WildpokemonAttack_point);
            }
        }while(newPokemon.getHP()>0 && WildpokemonHP>0);
        if(newPokemon.getHP() <= 0){
            System.out.println("you lose");
        }
        else if(WildpokemonHP <= 0){
            System.out.println("you win");
        }
    }
}

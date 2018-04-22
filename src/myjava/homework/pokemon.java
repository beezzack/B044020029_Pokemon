package myjava.homework;

public abstract class pokemon implements skill{
    private int hp;
    private int atk;
    private int unique;

    public pokemon(int theATK,int theHP, int theUnique){
        hp = theHP;
        atk = theATK;
        unique = theUnique;
    }

    public int getHP(){
        return hp;
    }
    public int getATK(){
        return atk;
    }
    public int getUnique(){
        return unique;
    }
    public void setHp(int theHp){
        hp = theHp;
    }
    public void setUnique(int theUnique){
        unique = theUnique;
    }
    public abstract int action(int WildpokemonATK);
}

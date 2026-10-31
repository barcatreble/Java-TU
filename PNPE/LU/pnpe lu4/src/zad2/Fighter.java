package zad2;

public class Fighter extends Starship{
    public Fighter(String name, int hull, int baseDamage){
        super(name, hull, baseDamage);
    }

    @Override
    public  int attackDamage(){
        return getBaseDamage() * 2;
    }
}
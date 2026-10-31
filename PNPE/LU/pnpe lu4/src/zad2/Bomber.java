package zad2;

public class Bomber extends Starship{
    private int torpedoDamage;
    public Bomber(String name, int hull, int baseDamage, int torpedoDamage){
        super(name, hull, baseDamage);
        this.torpedoDamage = torpedoDamage;
    }

    public int getTorpedoDamage() { return torpedoDamage; }

    @Override
    public int attackDamage(){
        return getBaseDamage() + torpedoDamage;
    }
}

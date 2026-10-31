package zad2;

public class Cruiser extends Starship{
    private int laserPower;
    public Cruiser(String name, int hull, int baseDamage, int laserPower){
        super(name, hull, baseDamage);
        this.laserPower = laserPower;
    }

    public int getLaserPower() { return laserPower; }

    @Override
    public int attackDamage(){
        return getBaseDamage() + laserPower;
    }
}
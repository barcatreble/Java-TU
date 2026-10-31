package zad2;

public abstract class Starship {
    private String name;
    private int hull;
    private int baseDamage;

    public Starship(String name, int hull, int baseDamage){
        if (hull <= 0) throw new IllegalArgumentException("Hull must be positive!");
        if (baseDamage < 0) throw new IllegalArgumentException("Base damage must not be negative!");

        this.name = name;
        this.hull = hull;
        this.baseDamage = baseDamage;
    }

    public String getName() { return name; }

    public int getHull() { return hull; }

    public int getBaseDamage() { return baseDamage; }

    public abstract int attackDamage();

    public void takeDamage(int damage){
        if (damage == 0) throw new IllegalArgumentException("Damage cannot be 0!");
        hull -= damage;
        if (hull < 0) hull = 0;
    }

    public boolean attack(Starship target){
        if (this == target) throw new IllegalArgumentException("Starship cannot attack itself.");
        if (this.isDefeated() || target.isDefeated()) {
            System.out.println("Unable to attack! Attacker or target is defeated!");
            return false;
        }

        int damageDealt = baseDamage;
        target.takeDamage(damageDealt);

        System.out.println("Targeted starship was successfully attacked!");
        return true;
    }

    public boolean isDefeated() { return hull == 0; }

    public void printStatus(){
        System.out.println("Name: " + name + "\nBase Damage: " + baseDamage + "\nHull: " + hull);
    }
}

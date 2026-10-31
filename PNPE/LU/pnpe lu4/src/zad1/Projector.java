package zad1;

public class Projector extends OfficeDevice{
    private final double projectorPower = 5.0;

    public Projector(String name, double powerWatts){
        super(name, powerWatts);
    }

    @Override
    public double calculateEnergy(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours must be positive!");

        if(isPoweredOn()) return (getPowerWatts() * hours) / 1000.0;
        else return (projectorPower * hours) / 1000.0;
    }
}

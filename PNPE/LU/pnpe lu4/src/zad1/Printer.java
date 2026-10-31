package zad1;

public class Printer extends OfficeDevice {
    public Printer(String name, double powerWatts) {
        super(name, powerWatts);
    }

    @Override
    public double calculateEnergy(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours must be positive!");
        if (!isPoweredOn()) { return 0; }

        double usedHours = hours * 0.3;

        return (getPowerWatts() * usedHours) / 1000;
    }
}

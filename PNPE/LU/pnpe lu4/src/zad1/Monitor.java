package zad1;

public class Monitor extends OfficeDevice{
    private int brightness;
    public Monitor(String name, double powerWatts, int brightness) {
        if (brightness < 0 || brightness > 100) throw new IllegalArgumentException("Brightness out of limit!");

        super(name, powerWatts);
        this.brightness = brightness;
    }

    public int getBrightness() { return brightness; }

    @Override
    public double calculateEnergy(int hours){
        if (hours < 0) throw new IllegalArgumentException("Hours must be positive!");
        if (!isPoweredOn()) { return 0; }

        double usedPower = getPowerWatts() * (brightness / 100.0);

        return (usedPower * hours) / 1000.0;
    }
}

package zad1;

public abstract class OfficeDevice implements PowerControl{
    private String name;
    private double powerWatts;
    private boolean poweredOn;

    public OfficeDevice(String name, double powerWatts){
        if (powerWatts <= 0) throw new IllegalArgumentException("No power!");

        this.name = name;
        this.powerWatts = powerWatts;
        this.poweredOn = false;
    }

    public String getName(){ return name; }

    public double getPowerWatts() { return powerWatts; }

    public abstract double calculateEnergy(int hours);

    public void printInfo(){
        System.out.println("Ime: " + name + "\nMoshtnost: " + powerWatts + "W " + "\nVklucheno: " + poweredOn);
        System.out.println();
    }

    @Override
    public void powerOn(){
        this.poweredOn = true;
    }

    @Override
    public void powerOff(){
        this.poweredOn = false;
    }

    @Override
    public boolean isPoweredOn(){ return this.poweredOn; }
}

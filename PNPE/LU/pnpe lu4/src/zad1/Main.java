package zad1;
import java.util.Locale;

public class Main{
    static void main() {
        OfficeDevice[] devices = new OfficeDevice[5];
        devices[0] = new Monitor("Dell-1", 30.0, 70);
        devices[1] = new Monitor("Dell-2", 30.0, 40);
        devices[2] = new Printer("HP-Laser", 600.0);
        devices[3] = new Projector("Epson", 250.0);
        devices[4] = new Projector("BenQ", 220.0);

        for (OfficeDevice device : devices) {
            PowerControl pc = device;
            pc.powerOn();
        }

        devices[1].powerOff();
        devices[4].powerOff();

        for (OfficeDevice device : devices) {
            device.printInfo();
        }

        for (OfficeDevice device : devices) {
            System.out.printf("%s: %.3fkWh\n", device.getName(), device.calculateEnergy(8));
        }
        System.out.println();

        double max = devices[0].calculateEnergy(8);
        OfficeDevice maxDevice = devices[0];
        for (OfficeDevice device : devices) {
            double currentEnergy = device.calculateEnergy(8);
            if (currentEnergy > max) {
                max = currentEnergy;
                maxDevice = device;
            }
        }
        System.out.printf("Device with max energy used - %s, %.3fkWh", maxDevice.getName(), max);
    }
}

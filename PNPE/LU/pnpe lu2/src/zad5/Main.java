package zad5;

public class Main {
    public static void main(String[] args) {
        Event myEvent = new Event("Java Workshop", 3);
        System.out.println("--- Nachalna informaciq ---");
        myEvent.printInfo();
        System.out.println();

        System.out.println("--- Registraciq na uchastnici ---");
        myEvent.registerParticipant(); // 1-ви участник
        myEvent.registerParticipant(); // 2-ри участник

        System.out.println();

        System.out.println("--- Informaciq sled 2 registracii ---");
        myEvent.printInfo();
        System.out.println();

        System.out.println("hasFreePlaces() e private i ne moje da bude izvikan izvun class Event.");
        System.out.println();

        System.out.println("--- Prepulvane na kapaciteta ---");
        myEvent.registerParticipant();
        myEvent.registerParticipant();

        System.out.println();
        System.out.println("--- Finalna informaciq ---");
        myEvent.printInfo();
    }
}

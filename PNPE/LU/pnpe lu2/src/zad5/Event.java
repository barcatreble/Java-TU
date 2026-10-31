package zad5;

public class Event {
    private String name;
    private int capacity;
    private int registeredParticipants;
    Event(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.registeredParticipants = 0;
    }

    public void registerParticipant(){
        if(hasFreePlaces()){
            registeredParticipants++;
            System.out.println("Uspeshna registraciq!");
        }
        else System.out.println("Nedostatuchen kapacitet!");
    }

    private boolean hasFreePlaces(){
        return registeredParticipants < capacity;
    }

    public void printInfo(){
        System.out.println("Ime na subitieto: " + name);
        System.out.println("Maksimalen broi uchastnici: " + capacity);
        System.out.println("Broi uchastnici: " + registeredParticipants);
    }
}

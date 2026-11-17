package zad4;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Boris", "Daniel"};
        int[] ages = {15, 20, 22};
        for(int i = 0; i < names.length; i++){
            try{
                registerParticipant(names[i], ages[i]);
            }
            catch(AgeRestrictionException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void registerParticipant(String name, int age) throws AgeRestrictionException {
        if(age < 18){
            throw new AgeRestrictionException("Ne se dopuskat lica pod 18 godini!");
        }

        System.out.println("Uspeshno registriran: " + name);
    }
}

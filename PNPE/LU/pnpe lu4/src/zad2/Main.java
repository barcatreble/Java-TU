package zad2;

public class Main {
    static void main() {
        Starship[] starships = new Starship[5];
        starships[0] = new Fighter("Falcon", 100, 15);
        starships[1] = new Cruiser("Titan", 140, 10 ,12);
        starships[2] = new Bomber("Hammer", 90, 8, 20);
        starships[3] = new Fighter("Viper", 80, 12);
        starships[4] = new Cruiser("Aurora", 120, 9 , 10);

        for(Starship st : starships){
            st.printStatus();
            System.out.println("Attack Damage: " + st.attackDamage());
            System.out.println();
        }

        double maxDamage = starships[0].attackDamage();
        Starship maxStarship = starships[0];
        for(Starship st : starships){
            if(st.attackDamage() > maxDamage) {
                maxDamage = st.attackDamage();
                maxStarship = st;
            }
        }
        System.out.printf("Max damage ship: %s, %.2f\n", maxStarship.getName(), maxDamage);
        System.out.println();

        System.out.println("Duel 1: Falcon vs Titan");
        Starship falcon = starships[0];
        Starship titan = starships[1];
        while(!falcon.isDefeated() && !titan.isDefeated()){
            falcon.attack(titan);
            System.out.println("Ataka na Falcon: " + falcon.getName() + " Hull: " + falcon.getHull() + " ---> " + titan.getName() + " Hull: " + titan.getHull());
            if(titan.isDefeated()) break;

            titan.attack(falcon);
            System.out.println("Ataka na Titan: " + falcon.getName() + " Hull: " + falcon.getHull() + " <--- " + titan.getName() + " Hull: " + titan.getHull());
        }
        System.out.println();

        Starship winnerDuel1; Starship defeatedDuel1;
        if(falcon.isDefeated()) {
            winnerDuel1 = titan;
            defeatedDuel1 = falcon;
        }
        else {
            winnerDuel1 = falcon;
            defeatedDuel1 = titan;
        }

        boolean defeatedAttack = defeatedDuel1.attack(winnerDuel1);
        System.out.println("Pobedeniqt probva da atakuva: " + defeatedAttack);
        boolean winnerAttack = winnerDuel1.attack(defeatedDuel1);
        System.out.println("Pobeditelqt probva da atakuva: " + winnerAttack);
        System.out.println();

        System.out.println("Duel 2: Pobeditel ot Duel 1 vs Hammer");
        Starship hammer = starships[2];
        while(!winnerDuel1.isDefeated() && !hammer.isDefeated()){
            winnerDuel1.attack(hammer);
            System.out.println("Ataka: " + winnerDuel1.getName() + " Hull: " + winnerDuel1.getHull() + " ---> " + hammer.getName() + " Hull: " + hammer.getHull());
            if(hammer.isDefeated()) break;

            hammer.attack(winnerDuel1);
            System.out.println("Ataka: " + winnerDuel1.getName() + " Hull: " + winnerDuel1.getHull() + " <--- " + hammer.getName() + " Hull: " + hammer.getHull());
        }
        System.out.println();

        System.out.println("Kraino sustoqnie na vsichki korabi:");
        for(Starship st : starships){
            st.printStatus();
            System.out.println("Zagubil: " + st.isDefeated());
            System.out.println();
        }
    }
}
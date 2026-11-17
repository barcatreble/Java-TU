public class zad1 {
    public static void main(String[] args) {
        String[] prices = {"12.50", "7.90", "abc", "18.00", "-3.20", "5.50", "invalid"};
        int valid = 0, invalid = 0, sum = 0;

        for(int i = 0; i < prices.length; i++){
            try{
                double price = Double.parseDouble(prices[i]);
                if(price <= 0){
                    throw new IllegalArgumentException("Cenata trqbva da e polojitelno chislo!");
                }
                System.out.println("Uspeshno obraboteno chislo: " + price);
                valid++;
                sum += price;
            }
            catch(NumberFormatException e){
                System.out.println("Exception: " + e.getMessage());
                invalid++;
            }
            catch(IllegalArgumentException e){
                System.out.println("Exception: " + e.getMessage());
                invalid++;
            }
        }

        double avg = (double)sum/valid;
        System.out.println();
        System.out.println("Uspeshno obraboteni ceni: " + valid + "\nNevalidni stoinosti: " + invalid + "\nSredna cena na validnite stoinosti: " + avg);
    }
}
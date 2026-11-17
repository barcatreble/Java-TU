public class Age {
    public static void main(String[] args) {
        try {
            setAge(20);
            setAge(-5);
            setAge(30);
        }
        catch(IllegalArgumentException e){
            System.out.println("Greshka: " + e.getMessage());
        }
    }

    static void setAge(int age){
        if(age < 0 || age > 150){
            throw new IllegalArgumentException("Invaild age: " + age);
        }
        System.out.println("Age set to " + age);
    }
}

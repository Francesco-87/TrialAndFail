package dog;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Properties Mira = new Properties("BorderCollie", "Mira", "Black/White");
        Properties Nero = new Properties("Rottweiler", "Nero", "Black");



        System.out.println("Mira has a " + Mira.getFurLength() + " fur!" + "\n"
                        +   "Nero has a " + Nero.getFurLength() + " fur!");


    }
}

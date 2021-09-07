package dog;

public class Properties extends Dog{

    private int stubbornness;
    private int energy;
    private int intelligence;
    private int size;
    private String furLength;

    //constructor calling setProperties
    public Properties(String Breed, String Name, String Colour) {
        super(Breed, Name, Colour);
        setProperties(Breed);
    }


    // set properties via switch
    public void setProperties(String Breed) {

        switch (Breed) {
            case "BorderCollie":
                this.stubbornness = 7;
                this.energy = 10;
                this.intelligence = 10;
                this.size = 20;
                this.furLength = "Medium";
                break;
            case "Rottweiler":
                this.stubbornness = 7;
                this.energy = 6;
                this.intelligence = 6;
                this.size = 40;
                this.furLength = "Short";
                break;


        }
    }
//getter methods
    public int getStubbornness() {
        return stubbornness;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSize() {
        return size;
    }

    public String getFurLength() {
       return this.furLength;

    }
}
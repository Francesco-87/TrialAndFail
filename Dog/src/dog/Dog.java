package dog;

public class Dog {

    private String Breed;
    private String Name;
    private String Colour;


//setting by constructor
    public Dog(String Breed, String Name, String Colour){
        this.Breed = Breed;
        this.Name = Name;
        this.Colour = Colour;
           }

    public String getName(){
        return this.Name;
    }
    public String getBreed(){
        return this.Breed;
    }

    public String getColour() {
        return Colour;
    }

}

package crazy8;

public class Hand extends CardCollection {

    public Hand(String label) {
        super(label);
    }

    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i).getRank() + " of " + getCard(i).getSuitName());
        }
        System.out.println();
    }
}
package crazy8;

public class Deck extends CardCollection {

    public Deck(String label) {
        super(label);
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                addCard(new Card(rank, suit));
            }
        }
    }
}
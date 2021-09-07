package crazy8;

public class Card {
        private int rank;
        private int suit;

        public Card(int rank, int suit) {
            this.rank = rank;
            this.suit = suit;
        }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitName(){
         int n = getSuit();

         switch (n) {
             case 1:
                  return "Clubs";

             case 2:
                 return "Diamond";

             case 3:
                  return "Spade";

             case 4:
                 return "Heart";

         }
         return null;
    }
}

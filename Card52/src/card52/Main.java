package card52;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Deck deck = new Deck();
        deck.shuffle();

        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));

        Pile p2 = new Pile();
        p2.addDeck((deck.subdeck(26, 51)));

        while (!p1.isEmpty() && !p2.isEmpty()) {
            //pop a card from each pile
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();

            //compare the cards
            int diff = c1.getRank() - c2.getRank();

            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            }
            else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            }
            //it´s a tie
            else {
               isTie(p1, p2,c1,c2);
            }
        }
            if (p2.isEmpty()) {
                System.out.println("Player 1 wins!");

            }
            else if (p1.isEmpty()){
                System.out.println("Player 2 wins!");

            }

    }

    private static void isTie(Pile p1, Pile p2, Card c1, Card c2) {

        if(p1.pileSize() < 4 || p2.pileSize() < 4) {
            int diff = c1.getSuit() - c2.getSuit();

            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            }
            else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            }
        }



       else if (p1.pileSize() >= 4 && p2.pileSize() >= 4) {
           Card c3 = p1.popCard();
           Card c4 = p1.popCard();
           Card c5 = p1.popCard();
           Card c6 = p1.popCard();

           Card c7 = p2.popCard();
           Card c8 = p2.popCard();
           Card c9 = p2.popCard();
           Card c10 = p2.popCard();


           //compare the cards
           int diff = c6.getRank() - c10.getRank();
           if (diff > 0) {
               p1.addCard(c1);
               p1.addCard(c2);
               p1.addCard(c3);
               p1.addCard(c4);
               p1.addCard(c5);
               p1.addCard(c6);
               p1.addCard(c7);
               p1.addCard(c8);
               p1.addCard(c9);
               p1.addCard(c10);

           } else if (diff < 0) {

               p2.addCard(c1);
               p2.addCard(c2);
               p2.addCard(c3);
               p2.addCard(c4);
               p2.addCard(c5);
               p2.addCard(c6);
               p2.addCard(c7);
               p2.addCard(c8);
               p2.addCard(c9);
               p2.addCard(c10);

           }
       }
//        else{
//            isTie2(p1, p2, c1, c2, c3, c4);
//        }
    }
    private static void isTie2(Pile p1, Pile p2, Card c1, Card c2, Card c3, Card c4) {
        Card c5 = p1.popCard();
        Card c6 = p2.popCard();


        //compare the cards
        int diff = c5.getRank() - c6.getRank();
        if (diff > 0) {
            p1.addCard(c1);
            p1.addCard(c2);
            p1.addCard(c3);
            p1.addCard(c4);
            p1.addCard(c5);
            p1.addCard(c6);
        } else if (diff < 0) {
            p2.addCard(c1);
            p2.addCard(c2);
            p2.addCard(c3);
            p2.addCard(c4);
            p2.addCard(c5);
            p2.addCard(c6);

        }
    }

}
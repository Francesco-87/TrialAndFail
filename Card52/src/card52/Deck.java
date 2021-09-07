package card52;

import java.util.Random;

public class Deck {

    private Card[] cards;

    //Deckconstruct 52 Cards
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    //subdeck constructor
    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Card[] getCards() {
        return this.cards;
    }

    //printing the deck
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card.getRank() + "," + card.getSuit());
        }
    }

    //shuffling
    public void shuffle() {
        for (Card card : this.cards) {
            swapCards(randomInt(cards.length), randomInt(cards.length));
        }
    }

    private static int randomInt(int z) {

        Random random = new Random();
        int j = random.nextInt(z);
        return j;
    }

    private void swapCards(int i, int j) {
        Card s = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = s;
    }

    //selection sort
    public void selectionSort() {
        sortSuit();

        sortNumbers(0, 12);
        sortNumbers(13, 25);
        sortNumbers(26, 38);
        sortNumbers(39, 51);
    }

    private void sortSuit() {
        for (int i = 0; i < this.cards.length; i++) {
            for (int j = 0; j < this.cards.length; j++) {
                if (this.cards[i].getSuit() < this.cards[j].getSuit()) {
                    swapCards(i, j);
                }
            }
        }
    }

    private void sortNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                if (this.cards[i].getRank() < this.cards[j].getRank()) {
                    swapCards(i, j);
                }
            }
        }
    }

//Merge Sort
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);

        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    private static Deck merge(Deck d1, Deck d2) {
        Deck d3 = new Deck(d1.cards.length + d2.cards.length);
        int i = 0;
        int j = 0;
        for (int k = 0; k < d3.cards.length; k++) {

            //check for NULL / empty
             if (i == d1.cards.length && j < d2.cards.length) {
                d3.cards[k] = d2.cards[j];
                j++;
            }
            else if (j == d2.cards.length && i < d1.cards.length) {
                d3.cards[k] = d1.cards[i];
                i++;
            }

            //sort by rank
           else if(i < d1.cards.length && j < d2.cards.length) {

                if (d1.cards[i].getRank() < d2.cards[j].getRank()) {
                    d3.cards[k] = d1.cards[i];
                    i++;
                }
                else if (d1.cards[i].getRank() > d2.cards[j].getRank()) {
                    d3.cards[k] = d2.cards[j];
                    j++;
                }

                //if rank same, use suit
                else if (d1.cards[i].getRank() == d2.cards[j].getRank()) {
                    if (d1.cards[i].getSuit() < d2.cards[j].getSuit()) {
                        d3.cards[k] = d1.cards[i];
                        i++;
                    }
                    else if (d1.cards[i].getSuit() > d2.cards[j].getSuit()) {
                        d3.cards[k] = d2.cards[j];
                        j++;
                    }
                }
            }
        }
        return d3;
    }
    private  Deck sortNumbers2(Deck sub) {

        for (int i = 0; i <= sub.cards.length-1; i++) {
            for (int j = 0; j <= sub.cards.length-1; j++) {
                if (sub.cards[i].getRank() < sub.cards[j].getRank()) {
                    Card s = sub.cards[i];
                    sub.cards[i] = sub.cards[j];
                    sub.cards[j] = s;

                }
            }
        }
        return sub;
    }

    public  Deck selectionSort2( Deck sub) {
       sortNumbers2(sub);

       return sub;
    }

    public Deck almostMergeSort () {


           return merge(selectionSort2(subdeck(0, 25)),(selectionSort2(subdeck(26,51))));

    }
    public void print(Deck d3) {
        for (Card card : d3.cards) {
            System.out.println(card.getRank() + "," + card.getSuit());
        }
    }
    //recursive method
//    public Deck mergeSort(){
//
//    }

    }


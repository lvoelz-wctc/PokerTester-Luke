package edu.wctc.pocker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<Card>();
    public Deck() {
        //hearts
        deck.add(new Card("Two","Heart",2));
        deck.add(new Card("Three","Heart",3));
        deck.add(new Card("Four","Heart",4));
        deck.add(new Card("Five","Heart",5));
        deck.add(new Card("Six","Heart",6));
        deck.add(new Card("Seven","Heart",7));
        deck.add(new Card("Eight","Heart",8));
        deck.add(new Card("Nine","Heart",9));
        deck.add(new Card("Ten","Heart",10));
        deck.add(new Card("Jack","Heart",11));
        deck.add(new Card("Queen","Heart",12));
        deck.add(new Card("King","Heart",13));
        deck.add(new Card("Ace","Heart",14));

        //diamonds
        deck.add(new Card("Two","Diamond",2));
        deck.add(new Card("Three","Diamond",3));
        deck.add(new Card("Four","Diamond",4));
        deck.add(new Card("Five","Diamond",5));
        deck.add(new Card("Six","Diamond",6));
        deck.add(new Card("Seven","Diamond",7));
        deck.add(new Card("Eight","Diamond",8));
        deck.add(new Card("Nine","Diamond",9));
        deck.add(new Card("Ten","Diamond",10));
        deck.add(new Card("Jack","Diamond",11));
        deck.add(new Card("Queen","Diamond",12));
        deck.add(new Card("King","Diamond",13));
        deck.add(new Card("Ace","Diamond",14));

        //Clubs
        deck.add(new Card("Two","Clubs",2));
        deck.add(new Card("Three","Clubs",3));
        deck.add(new Card("Four","Clubs",4));
        deck.add(new Card("Five","Clubs",5));
        deck.add(new Card("Six","Clubs",6));
        deck.add(new Card("Seven","Clubs",7));
        deck.add(new Card("Eight","Clubs",8));
        deck.add(new Card("Nine","Clubs",9));
        deck.add(new Card("Ten","Clubs",10));
        deck.add(new Card("Jack","Clubs",11));
        deck.add(new Card("Queen","Clubs",12));
        deck.add(new Card("King","Clubs",13));
        deck.add(new Card("Ace","Clubs",14));

        //Spades
        deck.add(new Card("Two","Spades",2));
        deck.add(new Card("Three","Spades",3));
        deck.add(new Card("Four","Spades",4));
        deck.add(new Card("Five","Spades",5));
        deck.add(new Card("Six","Spades",6));
        deck.add(new Card("Seven","Spades",7));
        deck.add(new Card("Eight","Spades",8));
        deck.add(new Card("Nine","Spades",9));
        deck.add(new Card("Ten","Spades",10));
        deck.add(new Card("Jack","Spades",11));
        deck.add(new Card("Queen","Spades",12));
        deck.add(new Card("King","Spades",13));
        deck.add(new Card("Ace","Spades",14));
    }

    public Card getCard(int i) {
        return deck.get(i);
    }

}

package edu.wctc.pocker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
        List<Card> hand = new ArrayList<Card>();
        Poker poker = new Poker();
        hand.add(deck.getCard(8));
        hand.add(deck.getCard(9));
        hand.add(deck.getCard(10));
        hand.add(deck.getCard(11));
        hand.add(deck.getCard(12));
        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println("Straight: " + poker.isStraight(hand));
        System.out.println("Straight Flush: " + poker.isStraightFlush(hand));

        //test rf: 8,9,10,11,12
        System.out.println("Royal Flush: " + poker.isRoyalFlush(hand));
        System.out.println("Flush: " + poker.isFlush(hand));
        System.out.println("One Pair: " + poker.isOnePair(hand));
    }
}

package edu.wctc.pocker;

import java.util.List;

public class Poker {

    public boolean isStraight(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            if ((score != prevScore+1) && (i != 0)) isTheHand = false;
            prevScore = score;
        }
        return isTheHand;
    }
    public boolean isStraightFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        int score = 0;
        String suit = "";
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if (((score != prevScore+1) && (i != 0)) || ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0))) isTheHand = false;
            prevScore = score;
            prevSuit = suit;
        }
        return isTheHand;
    }

    //royal flush
    public boolean isRoyalFlush(List<Card> hand) {
        boolean isTheHand = true;
        String prevSuit = "";
        int score = 0;
        int rfCount = 10;
        String suit = "";

        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if ((score != rfCount) || ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0))) isTheHand = false;
            prevSuit = suit;
            rfCount++;
        }
        return isTheHand;
    }

    //flush
    public boolean isFlush(List<Card> hand) {
        boolean isTheHand = true;
        String prevSuit = "";
        String suit = "";

        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            suit = card.getSuit();
            if ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0)) isTheHand = false;
            prevSuit = suit;
        }
        return isTheHand;
    }

    //OnePair
    public boolean isOnePair(List<Card> hand) {
        boolean isTheHand = true;
        int score = 0;
        int nextScore = 0;

        for (int i=0;i<4;i++) {
            Card card = hand.get(i);
            Card nextCard = hand.get(i+1);
            score = card.getScore();
            nextScore = nextCard.getScore();

            if (score == nextScore){
                break;
            }
            else {
                isTheHand = false;
            }
        }
        return isTheHand;
    }

}

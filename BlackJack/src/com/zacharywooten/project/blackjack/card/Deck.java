package com.zacharywooten.project.blackjack.card;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a deck of cards (52 or 54 - depending on if Jokers
 * are included).
 * @author Zachary Wooten
 * @version 1.0
 */
public class Deck extends Hand {
	
	private static final Suit[] VALID_SUITS = {Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES};
	
	/**
	 * Constructs a deck 
	 * @param withJokers true if the deck should include two jokers
	 */
	public Deck(boolean withJokers) {
		if (withJokers) {
			add(new Card());
			add(new Card());
		}
		for (Suit s : VALID_SUITS) {
			for (int i = 1; i <= 13; i++) {
				add(new Card(s, new Rank(i)));
			}
		}
	}
	
	/**
	 * Shuffles the deck of cards.
	 */
	public void shuffle() {
		List<Card> tempList = new ArrayList<Card>();
		while (size() > 0) {
			int rand = (int) (Math.random() * size());
			tempList.add(remove(rand));
		}
		for (Card c : tempList) {
			add(c);
		}
	}
	
	/**
	 * Prints the deck of cards -- one card per line.
	 */
	public void printDeck() {
		for (int i = 0; i < size(); i++) {
			System.out.println(get(i).toString());
		}
	}
}

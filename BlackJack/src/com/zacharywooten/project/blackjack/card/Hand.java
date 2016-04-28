package com.zacharywooten.project.blackjack.card;

import java.util.ArrayList;

/**
 * This class represents a hand of cards.
 * @author Zachary Wooten
 * @version 1.0
 */
public class Hand {
	
	/** The list that contains the cards from the hand. */
	private ArrayList<Card> cards;
	/** Whether the hand has a capacity or not. */
	private boolean isCapped;
	/** The maximum number of cards the hand can hold - if the hand is capped. */
	private int maxCap;
	
	/**
	 * Constructs an empty hand of cards with no capacity.
	 */
	public Hand() {
		cards = new ArrayList<Card>();
		isCapped = false;
		maxCap = -1;
	}
	
	/**
	 * Constructs an empty hand of cards with the given maximum capacity.
	 * @param maxCap the maximum number of cards the hand can hold
	 */
	public Hand(int maxCap) {
		cards = new ArrayList<Card>();
		isCapped = true;
		this.maxCap = maxCap;
	}
	
	
	/**
	 * Adds a card to the hand at the given position.
	 * @param pos the position in the hand to add the card
	 * @param card the Card to be added to the hand
	 * @throws IndexOutOfBoundsException if the position to add the card is
	 *     below 0 or greater than the size of the hand
	 * @return true if the card is added to the hand
	 */
	public boolean add(int pos, Card card) throws IndexOutOfBoundsException {
		if (pos < 0 || pos > cards.size()) {
			throw new IndexOutOfBoundsException();
		}
		if (!isCapped || size() < maxCap) {
			cards.add(pos, card);
			return true;
		}
		return false;
	}
	
	/**
	 * Adds a card to the end of the hand.
	 * @param card the Card to be added to the hand
	 * @return true if the card is added to the hand
	 */
	public boolean add(Card card) {
		if (!isCapped || size() < maxCap) {
			cards.add(card);
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the card at the given position.
	 * @param pos the position in the hand for the card
	 * @throws IndexOutOfBoundsException if the given position does not exist
	 */
	public Card get(int pos) {
		if (pos < 0 || pos > cards.size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return cards.get(pos);
	}
	
	/**
	 * Removes the card at the given position.
	 * @param pos the position in the hand for the card
	 * @throws IndexOutOfBoundsException if the given position does not exist
	 */
	public Card remove(int pos) {
		if (pos < 0 || pos > cards.size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return cards.remove(pos);
	}
	
	/**
	 * Determines the size of the hand.
	 * @return the number of cards in the hand
	 */
	public int size() {
		return cards.size();
	}
	
	/**
	 * Deals the top card from the hand.
	 * @return the top card from the hand
	 */
	public Card deal() {
		return get(size() - 1);
	}
	
	/**
	 * Turns every card in the hand face up.
	 */
	public void showCards() {
		for (Card c : cards) {
			c.setFaceUp(true);
		}
	}
}

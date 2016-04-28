package com.zacharywooten.project.blackjack.card;

import java.util.InputMismatchException;

/**
 * This class represents a playing card from a standard deck of cards - 
 * including Jokers.
 * @author Zachary Wooten
 * @version 1.0
 */
public class Card {
	
	/** The suit for this card. */
	private Suit suit;
	/** The rank for this card. */
	private Rank rank;
	/** Whether the card is face up or not. */
	private boolean isFaceUp;
	
	/**
	 * Constructs a playing card for a joker.
	 */
	public Card() {
		suit = Suit.JOKER;
		rank = new Rank(0);
	}
	
	/**
	 * Constructs a playing card with the given suit and rank.
	 * @param suit the suit of the created card
	 * @param rank the rank of the created card
	 * @throws InputMismatchException if the suit is for a joker and the rank is not
	 *     or the rank is for a joker and the suit is not
	 */
	public Card(Suit suit, Rank rank) throws InputMismatchException {
		if ((suit == Suit.JOKER && rank.getRankValue() != 0) || 
				(suit != Suit.JOKER && rank.getRankValue() == 0)) {
			throw new InputMismatchException();	
		}
		this.suit = suit;
		this.rank = rank;
	}
	
	/**
	 * Gets the suit for this card.
	 * @return the suit for this card
	 */
	public Suit getSuit() {
		return suit;
	}
	
	/**
	 * Sets the suit for this card.
	 * @param the new suit for this card
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	/**
	 * Gets the rank for this card.
	 * @param the rank for this card
	 */
	public Rank getRank() {
		return rank;
	}
	
	/**
	 * Sets the rank for this card.
	 * @param the new rank for this card
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	/**
	 * Determines if the card is face up.
	 * @return true if the card is face up
	 */
	public boolean isFaceUp() {
		return isFaceUp;
	}
	
	/**
	 * Sets the status of the card being face up or down.
	 * @param isFaceUp true if the card should be turned face up
	 */
	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}
	
	/**
	 * Flips a card over (if face up, to face down and vice versa).
	 */
	public void flipCard() {
		isFaceUp = !isFaceUp;
	}
	
	/**
	 * Determines if two cards are the same suit.
	 * @param other the card to be compared to this card
	 * @return true if the cards are the same suit; false otherwise
	 */
	public boolean sameSuit(Card other) {
		return suit == other.getSuit();
	}
	
	/**
	 * Determines if two cards have the same rank.
	 * @param other the card to be compared to this card
	 * @return true if the cards have the same rank; false otherwise
	 */
	public boolean sameRank(Card other) {
		return rank.compareTo(other.getRank()) == 0;
	}
	
	/**
	 * Gets a String representation of this card in the format:
	 * "[RANK] of [SUIT]"
	 */
	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}
	
}

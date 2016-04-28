package com.zacharywooten.project.blackjack.card;

import java.util.InputMismatchException;

/**
 * This class represents the rank of a card.
 * @author Zachary Wooten
 * @version 1.0
 */
public class Rank {

	/** The integer value of the rank. */
	private int rankValue;
	/** The name of the rank. */
	private String rankName;
	/** The possible names of the ranks. */
	public static final String[] RANK_NAMES = {"JOKER", "ACE", "2", "3", "4", "5",
			"6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
	
	/**
	 * Constructs a rank object with the given value.
	 * @param rankValue the value of the rank
	 */
	public Rank(int rankValue) {
		this.rankValue = rankValue;
		rankName = RANK_NAMES[rankValue];
	}
	
	/**
	 * Gets the value of the rank.
	 * @return the value of the rank
	 */
	public int getRankValue() {
		return rankValue;
	}
	
	/**
	 * Sets the value of the rank.
	 * @param the new value of the rank
	 * @throws IllegalArgumentException if the 
	 */
	public void setRankValue(int rankValue) {
		if (rankValue < 0 || rankValue > 13) {
			throw new InputMismatchException("Rank must be from 0 to 13.");
		}
		this.rankValue = rankValue;
	}
	
	/**
	 * Gets the name of the rank.
	 * @return the name of the rank
	 */
	public String getRankName() {
		return rankName;
	}
	
	/**
	 * Compares this rank to another rank.
	 * @param other the other rank to compare with this one
	 * @return a negative number if this rank is less than the other rank; zero
	 *     if this rank is equivalent to the other rank; a positive number if
	 *     this rank is higher than the other rank
	 */
	public int compareTo(Rank other) {
		return rankValue - other.getRankValue();
	}
	
	/**
	 * Gives the string representation of the rank.
	 */
	public String toString() {
		return rankName;
	}
	
}
package com.zacharywooten.project.blackjack.card;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the constructors and methods of the Card class.
 * @author Zachary Wooten
 * @version 1.0
 */
public class CardTest {

	/** A card object used during testing. */
	private Card jokerCard, otherCard;
	
	/**
	 * Sets up the cards used for testing.
	 */
	@Before
	public void setUp() {
		jokerCard = new Card();
		otherCard = new Card(Suit.CLUBS, new Rank(1));
	}
	
	/**
	 * Tests the constructor with no parameters - creating a joker.
	 */
	@Test
	public void testCardJoker() {
		assertEquals(Suit.JOKER, jokerCard.getSuit());
		assertEquals(0, jokerCard.getRank().getRankValue());
	}
	
	/**
	 * Tests the constructor that uses parameters.
	 */
	@Test
	public void testCardParameters() {
		assertEquals(Suit.CLUBS, otherCard.getSuit());
		assertEquals(1, otherCard.getRank().getRankValue());
	}
}

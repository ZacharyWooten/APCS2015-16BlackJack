package com.zacharywooten.project.blackjack.manager;

import com.zacharywooten.project.blackjack.card.Deck;
import com.zacharywooten.project.blackjack.user.Player;

/**
 * This class works as the model for the BlackJack game.  It creates
 * a deck of cards and will determine who wins a hand.
 * @author Zachary Wooten
 * @version 1.0
 */
public class BlackJackManager {

	/** The deck of cards used in the game. */
	private Deck deck;
	/** The player's hand of cards. */
	private Player user;
	/** The dealer's hand of cards. */
	private Player dealer;

	
	public BlackJackManager() {
		deck = new Deck(false);
		deck.shuffle();
		for (int i = 0; i < 2; i++) {
			user.getHand().add(deck.deal());
			dealer.getHand().add(deck.deal());
		}
	}
	

	
}

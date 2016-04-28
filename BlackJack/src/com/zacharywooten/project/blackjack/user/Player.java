package com.zacharywooten.project.blackjack.user;

import com.zacharywooten.project.blackjack.card.Hand;

/**
 * This class represents a player in the BlackJack game.
 * @author Zachary Wooten
 * @version 1.0
 */
public class Player {
	
	/** The player's hand of cards. */
	private Hand myHand;
	/** The amount of money the player currently has. */
	private int money;
	
	/** 
	 * Creates a new player with no cards in his/her hand and no money.
	 */
	public Player() {
		myHand = new Hand();
		money = 0;
	}
	
	/**
	 * Creates a new player with the given amount of money and an empty hand.
	 * @param startingMoney the amount of money the player has to begin
	 */
	public Player(int startingMoney) {
		myHand = new Hand();
		money = startingMoney;
	}
	
	/**
	 * Gets the player's current hand of cards. 
	 * @return the player's current hand of cards
	 */
	public Hand getHand() {
		return myHand;
	}
	
	/**
	 * Gets the player's current amount of money.
	 * @return the player's current amount of money
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * Adds the given amount of money to the player's money total.
	 * @param winnings the money added to the player's total
	 */
	public void addWinnings(int winnings) {
		money += winnings;
	}
	
	/**
	 * Removes the specified amount of money from the player's total.
	 * @param losses the money removed from the player's total
	 */
	public void removeLosses(int losses) {
		money -= losses;
	}
}

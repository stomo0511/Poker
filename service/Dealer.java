package service;

import exceptions.OutOfCardsException;
import models.Deck;
import models.Hand;

public interface Dealer {
    /**
	 * Shuffles a deck in random order.
	 * 
	 * @param deck
	 *            A deck of cards to shuffle
	 */
	void shuffle(Deck deck);

	/**
	 * Deals a hand of cards from a deck of cards. Returns a hand with the first
	 * 5 cards from the deck, and removes those cards from the deck.
	 * 
	 * @param deck
	 *            A deck of cards to deal from
	 * @return The dealt hand of cards
	 * @throws OutOfCardsException
	 *             if there are not enough cards in the deck to deal a full hand
	 */
	Hand deal(Deck deck) throws OutOfCardsException;
}

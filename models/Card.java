package models;

import static models.Rank.*;
import static models.Suit.*;

public enum Card {
    ACE_OF_DIAMONDS(DIAMONDS, ACE, new String(new int[] {0x1f0c1}, 0, 1)),
	TWO_OF_DIAMONDS(DIAMONDS, TWO, new String(new int[] {0x1f0c2}, 0, 1)),
	THREE_OF_DIAMONDS(DIAMONDS, THREE, new String(new int[] {0x1f0c3}, 0, 1)),
	FOUR_OF_DIAMONDS(DIAMONDS, FOUR, new String(new int[] {0x1f0c4}, 0, 1)),
	FIVE_OF_DIAMONDS(DIAMONDS, FIVE, new String(new int[] {0x1f0c5}, 0, 1)),
	SIX_OF_DIAMONDS(DIAMONDS, SIX, new String(new int[] {0x1f0c6}, 0, 1)),
	SEVEN_OF_DIAMONDS(DIAMONDS, SEVEN, new String(new int[] {0x1f0c7}, 0, 1)),
	EIGHT_OF_DIAMONDS(DIAMONDS, EIGHT, new String(new int[] {0x1f0c8}, 0, 1)),
	NINE_OF_DIAMONDS(DIAMONDS, NINE, new String(new int[] {0x1f0c9}, 0, 1)),
	TEN_OF_DIAMONDS(DIAMONDS, TEN, new String(new int[] {0x1f0ca}, 0, 1)),
	JACK_OF_DIAMONDS(DIAMONDS, JACK, new String(new int[] {0x1f0cb}, 0, 1)),
	QUEEN_OF_DIAMONDS(DIAMONDS, QUEEN, new String(new int[] {0x1f0cd}, 0, 1)),
	KING_OF_DIAMONDS(DIAMONDS, KING, new String(new int[] {0x1f0ce}, 0, 1)),
	ACE_OF_CLUBS(CLUBS, ACE, new String(new int[] {0x1f0d1}, 0, 1)),
	TWO_OF_CLUBS(CLUBS, TWO, new String(new int[] {0x1f0d2}, 0, 1)),
	THREE_OF_CLUBS(CLUBS, THREE, new String(new int[] {0x1f0d3}, 0, 1)),
	FOUR_OF_CLUBS(CLUBS, FOUR, new String(new int[] {0x1f0d4}, 0, 1)),
	FIVE_OF_CLUBS(CLUBS, FIVE, new String(new int[] {0x1f0d5}, 0, 1)),
	SIX_OF_CLUBS(CLUBS, SIX, new String(new int[] {0x1f0d6}, 0, 1)),
	SEVEN_OF_CLUBS(CLUBS, SEVEN, new String(new int[] {0x1f0d7}, 0, 1)),
	EIGHT_OF_CLUBS(CLUBS, EIGHT, new String(new int[] {0x1f0d8}, 0, 1)),
	NINE_OF_CLUBS(CLUBS, NINE, new String(new int[] {0x1f0d9}, 0, 1)),
	TEN_OF_CLUBS(CLUBS, TEN, new String(new int[] {0x1f0da}, 0, 1)),
	JACK_OF_CLUBS(CLUBS, JACK, new String(new int[] {0x1f0db}, 0, 1)),
	QUEEN_OF_CLUBS(CLUBS, QUEEN, new String(new int[] {0x1f0dd}, 0, 1)),
	KING_OF_CLUBS(CLUBS, KING, new String(new int[] {0x1f0de}, 0, 1)),
	ACE_OF_HEARTS(HEARTS, ACE, new String(new int[] {0x1f0b1}, 0, 1)),
	TWO_OF_HEARTS(HEARTS, TWO, new String(new int[] {0x1f0b2}, 0, 1)),
	THREE_OF_HEARTS(HEARTS, THREE, new String(new int[] {0x1f0b3}, 0, 1)),
	FOUR_OF_HEARTS(HEARTS, FOUR, new String(new int[] {0x1f0b4}, 0, 1)),
	FIVE_OF_HEARTS(HEARTS, FIVE, new String(new int[] {0x1f0b5}, 0, 1)),
	SIX_OF_HEARTS(HEARTS, SIX, new String(new int[] {0x1f0b6}, 0, 1)),
	SEVEN_OF_HEARTS(HEARTS, SEVEN, new String(new int[] {0x1f0b7}, 0, 1)),
	EIGHT_OF_HEARTS(HEARTS, EIGHT, new String(new int[] {0x1f0b8}, 0, 1)),
	NINE_OF_HEARTS(HEARTS, NINE, new String(new int[] {0x1f0b9}, 0, 1)),
	TEN_OF_HEARTS(HEARTS, TEN, new String(new int[] {0x1f0ba}, 0, 1)),
	JACK_OF_HEARTS(HEARTS, JACK, new String(new int[] {0x1f0bb}, 0, 1)),
	QUEEN_OF_HEARTS(HEARTS, QUEEN, new String(new int[] {0x1f0bd}, 0, 1)),
	KING_OF_HEARTS(HEARTS, KING, new String(new int[] {0x1f0be}, 0, 1)),
	ACE_OF_SPADES(SPADES, ACE, new String(new int[] {0x1f0a1}, 0, 1)),
	TWO_OF_SPADES(SPADES, TWO, new String(new int[] {0x1f0a2}, 0, 1)),
	THREE_OF_SPADES(SPADES, THREE, new String(new int[] {0x1f0a3}, 0, 1)),
	FOUR_OF_SPADES(SPADES, FOUR, new String(new int[] {0x1f0a4}, 0, 1)),
	FIVE_OF_SPADES(SPADES, FIVE, new String(new int[] {0x1f0a5}, 0, 1)),
	SIX_OF_SPADES(SPADES, SIX, new String(new int[] {0x1f0a6}, 0, 1)),
	SEVEN_OF_SPADES(SPADES, SEVEN, new String(new int[] {0x1f0a7}, 0, 1)),
	EIGHT_OF_SPADES(SPADES, EIGHT, new String(new int[] {0x1f0a8}, 0, 1)),
	NINE_OF_SPADES(SPADES, NINE, new String(new int[] {0x1f0a9}, 0, 1)),
	TEN_OF_SPADES(SPADES, TEN, new String(new int[] {0x1f0aa}, 0, 1)),
	JACK_OF_SPADES(SPADES, JACK, new String(new int[] {0x1f0ab}, 0, 1)),
	QUEEN_OF_SPADES(SPADES, QUEEN, new String(new int[] {0x1f0ad}, 0, 1)),
	KING_OF_SPADES(SPADES, KING, new String(new int[] {0x1f0ae}, 0, 1));
	
	private Suit suit;
	private Rank rank;
	private String string;

	private Card(Suit suit, Rank rank, String string) {
		this.suit = suit;
		this.rank = rank;
		this.string = string;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return string;
	}
}

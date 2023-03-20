package models;

import static java.lang.String.format;
import java.util.Set;

public class Hand {
    public static final int NUMBER_OF_CARDS = 5;

	private Set<Card> cards;

	public Hand(Set<Card> cards) {
		if (cards.size() != NUMBER_OF_CARDS) {
			String message = format("%d cards needed in one hand",
					NUMBER_OF_CARDS);

			throw new IllegalArgumentException(message);
		}

		this.cards = cards;
	}

	public Set<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		for (Card card : cards) {
			stringBuilder.append(card.toString());
		}

		return stringBuilder.toString();
	}
}

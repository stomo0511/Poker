package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Card card : Card.values())
            cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int size() {
        return cards.size();
    }

    public void swap(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }
}

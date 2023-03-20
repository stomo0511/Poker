import static java.lang.String.format;
import java.util.stream.IntStream;

import exceptions.OutOfCardsException;
import models.Deck;
import models.Hand;
import models.Result;
import service.Player;
import service.Dealer;

public class Poker {
    private static final int NUMBER_OF_HANDS = 10;

    public static void main(final String... args) {
        Dealer dealer = new Dealer();
        Player player = new Player();
        Deck deck = new Deck();

        dealer.shuffle(deck);
        IntStream.range(0, NUMBER_OF_HANDS)
				.forEach(game -> play(dealer, player, deck));
    }

    private static void play(final Dealer dealer, final Player player, final Deck deck) 
    throws OutOfCardsException {
        Hand hand = dealer.deal(deck);
        Result result = player.evaluate(hand);

        System.out.println(format("%s \u21d2 %s", hand, result));
    }
}
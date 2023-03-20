package exceptions;

public class OutOfCardsException extends RuntimeException {
    private static final long serialVersionUID = 1699303010902088883L;

    public OutOfCardsException() {
        super("No more cards in the deck");
    }
}

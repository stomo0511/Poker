package models;

public enum Result {
    STRAIGHT_FLUSH("Straight flush"),
	FOUR_OF_A_KIND("Four of a kind"),
	FULL_HOUSE("Full house"),
	FLUSH("Flush"),
	STRAIGHT("Straight"),
	THREE_OF_A_KIND("Three of a kind"),
	TWO_PAIR("Two pair"),
	ONE_PAIR("One pair"),
	HIGH_CARD("High card");

	private String string;

	private Result(final String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return string;
	}
}

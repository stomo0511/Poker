package service;

import models.Result;
import models.Hand;

public interface Player {
    /**
	 * Evaluates a hand of cards and returns the result.
	 * 
	 * @param hand A hand of cards to evaluate
	 * @return The result of the evaluation
	 */
	Result evaluate(Hand hand);
}

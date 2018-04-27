package com.cnu.blackjack;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class HandTest {
    @Test
    public void 핸드는_카드를_한_장씩_받을_수_있다() {
        Hand hand = new Hand(new Deck(1));
        Card card = hand.drawCard();
        int handSize = hand.getCurrentHandSize();
        assertTrue(card != null);
        assertTrue(handSize == 1);
    }
}

package com.cnu.blackjack;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DeckTest {
    @Test
    public void 하나의_덱은_총_52장의_카드를_가진다() {
        Deck deck = new Deck(1);
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount == 52);
    }

    @Test
    public void 세개의_덱은_총_156장의_카드를_가진다() {
        Deck deck = new Deck(3);
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount == 156);
    }

    @Test
    public void 하나의_덱에서_카드_한_장을_뽑으면_51장의_카드가_남아있어야_한다() {
        Deck deck = new Deck(1);
        deck.drawCard();
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount == 51);
    }

    @Test (expected = Exception.class)
    public void 하나의_덱에서_모든_카드를_뽑으면_에러가_발생해야_한다() {
        Deck deck = new Deck(1);
        for (int i = 0; i < 53; i++) {
            deck.drawCard();
        }
    }
}

package com.cnu.blackjack;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DealerTest {
    @Test
    public void 딜러는_17에서_25사이의_정수를_반환한다() {
        Dealer dealer = new Dealer();
        int score = dealer.getScore();  // score는 17에서 25사이어야 한다.
        assertTrue(score > 16 && score < 25);
    }
}

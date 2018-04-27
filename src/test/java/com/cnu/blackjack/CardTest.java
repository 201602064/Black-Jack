package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoRankException;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CardTest {
    @Test
    public void 스페이드_10_카드를_생성할_수_있다() {
        Card card = new Card(1, Suit.SPADE);   // 카드 초기화. 스페이드 에이스 카드를 가진다.
        int rank = card.getRank();  // 카드의 숫자를 받아서 int형의 rank 변수에 저장한다.
        Suit suit = card.getSuit();   // 카드의 무늬를 받아서 String형의 suit 변수에 저장한다.
        assertTrue(rank == 1);
        assertTrue(suit == Suit.SPADE);
    }

    @Test (expected = NoRankException.class)
    public void 카드의_랭크는_13_이하여야_한다() {
        Card card = new Card(15, Suit.SPADE);
    }
}

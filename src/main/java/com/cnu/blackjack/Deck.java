package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoMoreCardException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private int numberOfDeck;
    private List<Card> cardList = new ArrayList<Card>();

    public Deck(int numberOfDeck) { // 덱을 받아올 때 덱을 만들어 줌.
        this.numberOfDeck = numberOfDeck;
        this.cardList = new ArrayList<Card>();
        createCard(numberOfDeck);
        Collections.shuffle(cardList);
    }

    private void createCard(int numberOfDeck) {
        for (int j = 0; j < numberOfDeck; j++) {    // Deck의 수만큼
            for (int i = 1; i < 14; i++) {  // 1부터 13까지
                for (Suit suit : Suit.values()) {   // enum의 루프를 돌리는 방법. enum의 values를 하면 값을 다 넣어 줌.
                    Card card = new Card(i, suit);  // Card를 생성한다.
                    cardList.add(card); // 생성한 카드를 카드 리스트에 넣어준다.
                }
            }
        }
    }

    public int getTotalCardCount() {
        return cardList.size();
    }

    public Card drawCard() {
        if (cardList.size() == 0) {
            throw new NoMoreCardException();
        }
        return cardList.remove(0);
    }
}

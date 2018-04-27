package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NotEnoutghBalanceException;
import lombok.Data;

@Data
public class Player {
    private int balance;
    private int currentBet; // 배팅한 금액을 저장할 변수
    private Hand hand;

    public Player(int balance, Hand hand) {
        this.balance = balance;
        this.hand = hand;
    }

    public void placeBet(int bet) {
        if (bet > balance) {
            throw new NotEnoutghBalanceException();
        }
        balance -= bet;
        this.currentBet = bet;
    }

    public Card hitCard() {
        return hand.drawCard();
    }
}

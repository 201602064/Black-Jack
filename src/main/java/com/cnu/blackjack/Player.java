package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NotEnoutghBalanceException;
import lombok.Data;

@Data
public class Player {
    private int balance;
    private int currentBet; // 배팅한 금액을 저장할 변수

    public Player(int balance) {
        this.balance = balance;
    }

    public void placeBet(int bet) {
        if (bet > balance) {
            throw new NotEnoutghBalanceException();
        }
        balance =- bet;
        this.currentBet = bet;
    }
}

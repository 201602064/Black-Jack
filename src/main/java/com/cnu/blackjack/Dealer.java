package com.cnu.blackjack;

import java.util.concurrent.ThreadLocalRandom;

public class Dealer {

    public int getScore() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int score = random.nextInt(17, 25);
        System.out.println(score);
        return score;
    }
}

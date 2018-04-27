package com.cnu.blackjack;

public class Application {
    public static void main(String args[]){
        //게임시작할때 게임 이름? 같은거 프린트
        Deck deck = new Deck(1);
        Hand hand = new Hand(deck);
        Player player = new Player(10,hand);
        Dealer dealer = new Dealer();
        player.getHand().drawCard();
        //이거 카드 이쁘게 출력해야해
        System.out.println(player.getHand().getCardList().get(0).getRank());
        System.out.println(player.getHand().getCardList().get(0).getSuit());
        int score = dealer.getScore();
        if(score > 21){
            //딜러이김
        }
        else{
            System.out.println("현재까지의 점수는 "+score+"입니다.");
            System.out.println(score+player.getHand().getCardList().get(0).getRank());
            //이때가 21을 안넘을 경우 유저 이김 if
            //이때가 21을 넘으면 딜러가 이김 else
        }
    }
}

package com.cnu.blackjack;

import java.util.Scanner;

public class Application {
    static int balance = 10;
    static boolean goStop = true;
    public static void main(String args[]){
        System.out.println("◇◆ BLACKJACk 게임을 시작합니다 ◆◇");

        while(goStop) {
            Deck deck = new Deck(1);
            Hand hand = new Hand(deck);
            Player player = new Player(balance,hand);
            Dealer dealer = new Dealer();
            Scanner sc = new Scanner(System.in);

            if(balance<0)
                break;

            player.getHand().drawCard();
            System.out.print("User Card : " + player.getHand().getCardList().get(0).getRank() + " ");
            System.out.println(player.getHand().getCardList().get(0).getSuit());
            int score = dealer.getScore();
            if(score > 21){
                System.out.println("☆★ 21점을 넘겨 Dealer가 이겼습니다! ★☆");//딜러이김
                balance -= 5;
            }
            else{
                System.out.println("▷ 현재까지의 점수는 "+score+"입니다.");
                System.out.println(score+player.getHand().getCardList().get(0).getRank());
                if(score <= 21){
                    System.out.println("☆★ User가 이겼습니다! ★☆★");//이때가 21을 안넘을 경우 유저 이김
                    balance += 5;
                }
                else{
                    System.out.println("☆★ Dealer가 이겼습니다! ★☆★");//이때가 21을 넘으면 딜러가 이김
                    balance -= 5;
                }
            }
            System.out.println("계속 하시겠습니까? Yes:0 NO:1");
            int answer=sc.nextInt();
            if(answer==0)
                goStop=true;
            else
                goStop=false;

        }


    }
}

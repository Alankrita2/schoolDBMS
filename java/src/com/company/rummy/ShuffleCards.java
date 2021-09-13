package com.company.rummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleCards {
    public static void main(String args[]) {
        String suite[] = {"Hearts", "Diamond", "Spade", "Clubs"};
        String NameOfCard[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        List<Card> TotalPack = new ArrayList<>();
        for (String s : suite) {
            for (String n : NameOfCard) {
                TotalPack.add(new Card(s, n));
            }
        }
        Collections.shuffle(TotalPack);

        String player1, player2, player3;
        System.out.println("enter names of 3 players");
        player1 = Read.sc.next();
        player2 = Read.sc.next();
        player3 = Read.sc.next();

        Players p1 = new Players(player1, new ArrayList<Card>(TotalPack.subList(0, 7)));
        Players p2 = new Players(player2, new ArrayList<Card>(TotalPack.subList(7, 14)));
        Players p3 = new Players(player3, new ArrayList<Card>(TotalPack.subList(14, 21)));
        //System.out.println(p1.getCards().size());
        // System.out.println(p2.getCards().size());
        //  System.out.println(p3.getCards().size());
        for (int i = 0; i < 7; i++) {
            System.out.println(p1.getName() + " has " + p1.getCards().get(i).getNameOfCard() + " of " + p1.getCards().get(i).getSuite());
            System.out.println(p2.getName() + " has " + p2.getCards().get(i).getNameOfCard() + " of " + p2.getCards().get(i).getSuite());
            System.out.println(p3.getName() + " has " + p3.getCards().get(i).getNameOfCard() + " of " + p3.getCards().get(i).getSuite());

        }
    }
}

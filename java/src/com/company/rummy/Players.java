package com.company.rummy;

import java.util.ArrayList;

public class Players {

        String name;
        ArrayList<Card> cards;
        public Players(String name, ArrayList<Card> cards) {
            super();
            this.name = name;
            this.cards = cards;
        }
        public String getName() {
            return name;
        }
        public ArrayList<Card> getCards() {
            return cards;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setCards(ArrayList<Card> cards) {
            this.cards = cards;
        }
}



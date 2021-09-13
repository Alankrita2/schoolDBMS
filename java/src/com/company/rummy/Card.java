package com.company.rummy;

import java.sql.Array;

public class Card {
        String suite;
        String NameOfCard;
        public Card(String suite, String NameOfCard) {
            this.suite = suite;
            this.NameOfCard = NameOfCard;
        }
        public String getSuite() {
            return suite;
        }
        public String getNameOfCard() {
            return NameOfCard;
        }
        public void setSuite(String suite) {
            this.suite = suite;
        }
        public void setNameOfCard(String nameOfCard) {
            NameOfCard = nameOfCard;
        }
}

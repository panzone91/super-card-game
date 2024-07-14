package com.example.rest_service;
import java.util.ArrayList;

public class Deck {  // Più corretto chiamarlo DeckService?

    private ArrayList<Card> deck = new ArrayList<Card>(); 

    // Costruttore. Uso un deckBuilder per differenziare le carte al suo interno.

    public Deck() {
        deckBuilder();
    }

    // Metodo del deckBuilder.

    private void deckBuilder() { 
        
        String[] seeds = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // Forse è meglio dare dei valori int da 0 a 12? 

        // Per ogni seme in Semi, e per ogni valore in Valori, aggiungo una carta equivalente.
        for (String seed : seeds) {     
            for (String cardValue : cardValues) {
            this.deck.add(new Card(seed, cardValue));
            }
        }      

    }

    // Metodo per vedere tutte le carte del deck.
    public ArrayList<Card> showDeck() {

        return this.deck;
    }


    // Getter per ogni evenienza.
    // public ArrayList<Card> getDeck() { 
    // return deck;
    // }

}



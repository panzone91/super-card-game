package com.example.rest_service;
import java.util.ArrayList;

public class Deck {  // DeckService?

    private ArrayList<Card> deck = new ArrayList<Card>(); 

    // Costruttore. Uso un deckBuilder per differenziare le carte al suo interno.

    public Deck() {
        deckBuilder();
    }

    // Metodo del deckBuilder.

    private void deckBuilder() { 
        
        for (Seed seed : Seed.values()) {               //Per ogni valore del seme ENUM, per ogni valore del cardvalue ENUM, aggiungi al deck.
            for (CardValue cardValue : CardValue.values()) {
                this.deck.add(new Card(seed, cardValue)); }
        }
    }

    // Metodo per vedere tutte le carte del deck.
    public ArrayList<Card> showDeck() {

        return this.deck;
    }

}



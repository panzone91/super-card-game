package com.example.rest_service;

public final class Card {
    
private final Seed seed; 
private final CardValue cardValue;

// Costruttore.
public Card(Seed seed, CardValue cardValue) {
    this.seed = seed;
    this.cardValue = cardValue;
}

// Metodi
public String toString() {                
    String stringa = this.seed + " " + this.cardValue;
    return stringa;
}

// Getters.
public Seed getSeed() {
    return seed;
}

public CardValue getCardValue() {
    return cardValue;
}

}

package com.example.rest_service;

public class Card {
    
private String seed; 
private String cardValue; 

// Costruttore.
Card(String seed, String cardValue) {
    this.setSeed(seed);
    this.setCardValue(cardValue);
}


// Metodi

public String toString() {                // Da usare se dovrò chiamare le carte una ad una.
    String stringa = this.seed + " " + this.cardValue;
    System.out.println(stringa); 

    return stringa;
}

// Getters.
public String getSeed() {
    return seed;
}

public String getCardValue() {
    return cardValue;
}

// Setters.
public void setSeed(String seed) {
    this.seed = seed;
}

public void setCardValue(String cardValue){
    this.cardValue = cardValue;
}

}

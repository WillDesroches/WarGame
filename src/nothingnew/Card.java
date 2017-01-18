/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothingnew;

/**
 *
 * @author Will
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    
    public Card(String faceName, String suit, int value)
    {
        this.faceName = faceName;
        setSuit(suit);
        setFaceValue(value);
    }
    
    /**
     * This method will validate the suit provided is spades, clubs, hearts or diamonds
     * and set the suit accordingly
     * @param suit 
     */
    private void setSuit(String suit)
    {
        suit = suit.toLowerCase();
        if (suit.equalsIgnoreCase("spades") || suit.equalsIgnoreCase("clubs") || 
            suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds"))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Suit must be spades, clubs, hearts or diamonds");
    }
    
    
    /**
     * This method will validate if the card value is in the range of 2-14 and set 
     * it accordingly
     */
    private void setFaceValue(int value)
    {
        if (value >= 2 && value <= 14)
            faceValue = value;
        else
            throw new IllegalArgumentException("face values must be in the range of 2-14");
    }
    
    /**
     * This will return a String to represent the card
     */
    public String toString()
    {
        return faceName + " of " + suit;
    }
    
    /**
     * This method will return the face value of the card
     */
    public int getFaceValue()
    {
        return faceValue;
    }
    
}

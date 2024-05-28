/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]= c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.printIn("enter the value ofthe card");
        int Uservalue = scanner.nextInt();
        Scanner.Nextline();
        System.out.printIn("enter the suitof the card");
        String Usersuit = scanner.Nextline();
        
        
        // and search magicHand here
        boolean found = false;
        for(Card card : Magichand)
        {
            if(card.getvalue()==Usercard.getvalue()&&card.getSuit())
            {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found)
        {
            system.out.printIn("card is in the magic hand");
        }
        else
        {
            system.out.printIn("card is not in magic hand");
            
        }
        // add one luckcard hard code 2,clubs
        Card luckycard = new Card();
        luckycard.SetValue(2);
        luckycard.SetSuit("clubs");
    }
    
}

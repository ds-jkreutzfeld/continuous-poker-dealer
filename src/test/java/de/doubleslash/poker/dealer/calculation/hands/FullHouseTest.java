package de.doubleslash.poker.dealer.calculation.hands;

import static de.doubleslash.poker.dealer.data.Rank.ACE;
import static de.doubleslash.poker.dealer.data.Rank.FIVE;
import static de.doubleslash.poker.dealer.data.Rank.FOUR;
import static de.doubleslash.poker.dealer.data.Suit.CLUBS;
import static de.doubleslash.poker.dealer.data.Suit.HEARTS;
import static de.doubleslash.poker.dealer.data.Suit.SPADES;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import de.doubleslash.poker.dealer.calculation.hands.FullHouse;
import de.doubleslash.poker.dealer.data.Card;
import org.junit.jupiter.api.Test;

public class FullHouseTest {

   private final FullHouse fullHouse = new FullHouse();

   @Test
   public void testCalculateFullHouse() throws Exception {
      final List<Card> cards = Arrays.asList(new Card(ACE, SPADES), new Card(FIVE, CLUBS), new Card(FIVE, HEARTS),
            new Card(ACE, CLUBS), new Card(FOUR, CLUBS), new Card(FIVE, SPADES), new Card(ACE, HEARTS));
      Collections.shuffle(cards);

      final int[] score = fullHouse.calculateScore(cards);

      assertArrayEquals(new int[] {
            6, 42, 10
      }, score);
   }

}

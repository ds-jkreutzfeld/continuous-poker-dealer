package de.doubleslash.poker.dealer.calculation.hands;

import static de.doubleslash.poker.dealer.data.Rank.ACE;
import static de.doubleslash.poker.dealer.data.Rank.FIVE;
import static de.doubleslash.poker.dealer.data.Rank.FOUR;
import static de.doubleslash.poker.dealer.data.Rank.NINE;
import static de.doubleslash.poker.dealer.data.Rank.QUEEN;
import static de.doubleslash.poker.dealer.data.Suit.CLUBS;
import static de.doubleslash.poker.dealer.data.Suit.HEARTS;
import static de.doubleslash.poker.dealer.data.Suit.SPADES;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import de.doubleslash.poker.dealer.data.Card;
import org.junit.jupiter.api.Test;

public class FlushTest {

   private final Flush flush = new Flush();

   @Test
   public void testCalculateFlush() throws Exception {
      final List<Card> cards = Arrays.asList(new Card(ACE, SPADES), new Card(QUEEN, SPADES), new Card(FIVE, HEARTS),
            new Card(ACE, CLUBS), new Card(FOUR, SPADES), new Card(FIVE, SPADES), new Card(NINE, SPADES));
      Collections.shuffle(cards);

      final int[] score = flush.calculateScore(cards);

      assertArrayEquals(new int[] {
            5, 14, 12, 9, 5, 4
      }, score);
   }
}

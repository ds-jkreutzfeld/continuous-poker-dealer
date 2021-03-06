package de.doubleslash.poker.dealer.calculation.hands;

import static de.doubleslash.poker.dealer.data.Rank.ACE;
import static de.doubleslash.poker.dealer.data.Rank.FIVE;
import static de.doubleslash.poker.dealer.data.Suit.CLUBS;
import static de.doubleslash.poker.dealer.data.Suit.DIAMONDS;
import static de.doubleslash.poker.dealer.data.Suit.HEARTS;
import static de.doubleslash.poker.dealer.data.Suit.SPADES;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import de.doubleslash.poker.dealer.calculation.hands.FourOfAKind;
import de.doubleslash.poker.dealer.data.Card;
import org.junit.jupiter.api.Test;

public class FourOfAKindTest {

   private final FourOfAKind fourOfAKind = new FourOfAKind();

   @Test
   public void testCalculateFourOfAKind() throws Exception {
      final List<Card> cards = Arrays.asList(new Card(ACE, SPADES), new Card(FIVE, CLUBS), new Card(FIVE, HEARTS),
            new Card(ACE, CLUBS), new Card(ACE, DIAMONDS), new Card(FIVE, SPADES), new Card(ACE, HEARTS));
      Collections.shuffle(cards);

      final int[] score = fourOfAKind.calculateScore(cards);

      assertArrayEquals(new int[] {
            7, 56, 5
      }, score);
   }
}

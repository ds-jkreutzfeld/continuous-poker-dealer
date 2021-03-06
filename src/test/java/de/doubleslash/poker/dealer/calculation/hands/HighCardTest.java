package de.doubleslash.poker.dealer.calculation.hands;

import static de.doubleslash.poker.dealer.data.Rank.FIVE;
import static de.doubleslash.poker.dealer.data.Rank.FOUR;
import static de.doubleslash.poker.dealer.data.Rank.JACK;
import static de.doubleslash.poker.dealer.data.Rank.KING;
import static de.doubleslash.poker.dealer.data.Rank.NINE;
import static de.doubleslash.poker.dealer.data.Rank.TEN;
import static de.doubleslash.poker.dealer.data.Rank.TWO;
import static de.doubleslash.poker.dealer.data.Suit.CLUBS;
import static de.doubleslash.poker.dealer.data.Suit.HEARTS;
import static de.doubleslash.poker.dealer.data.Suit.SPADES;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import de.doubleslash.poker.dealer.calculation.hands.HighCard;
import de.doubleslash.poker.dealer.data.Card;
import org.junit.jupiter.api.Test;

public class HighCardTest {

   private final HighCard strategy = new HighCard();

   @Test
   public void testCalculate() throws Exception {
      final List<Card> cards = Arrays.asList(new Card(KING, SPADES), new Card(TWO, CLUBS), new Card(FIVE, SPADES),
            new Card(JACK, SPADES), new Card(TEN, SPADES), new Card(FOUR, SPADES), new Card(NINE, HEARTS));
      Collections.shuffle(cards);

      final int[] score = strategy.calculateScore(cards);

      assertArrayEquals(new int[] {
            0, 13, 11, 10, 9, 5
      }, score);
   }

}

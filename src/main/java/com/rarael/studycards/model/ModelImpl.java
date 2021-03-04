package com.rarael.studycards.model;

import com.rarael.studycards.controller.Controller;
import java.util.ArrayList;
import java.util.List;

public class ModelImpl implements Controller {
  private List<FlashCards> cards;
  private FlashCards currentCards;
  private int whichSetOfCards;
  private int whichQuestion;
  private boolean isAnswerShown;

  public ModelImpl(List<FlashCards> cards) {
    this.cards = cards;
    // Will initially not pull up any study set
    currentCards = null;
    whichSetOfCards = -1;
    whichQuestion = -1;
    isAnswerShown = false;

  }
  public int getCurrentStudySet() {
    return whichSetOfCards;
  }
  public void setCurrentStudySet(int index) {
    if (index > cards.size()) {
      throw new IndexOutOfBoundsException("Not enough study sets");
    } else {
      whichSetOfCards = index;
      currentCards = cards.get(index);
      whichQuestion = 0;
    }
  }

  public void nextQuestion() {
    if (whichQuestion == currentCards.getSize()) {
      whichQuestion = 0;
    } else {
      whichQuestion++;
    }
  }

  public void previousQuestion() {
    if (whichQuestion == 0) {
      whichQuestion = currentCards.getSize();
    } else {
      whichQuestion--;
    }
  }

  public boolean showingAnswer() {
    return isAnswerShown;
  }

  public void toggleAnswer() {
    isAnswerShown = !isAnswerShown;
  }
}

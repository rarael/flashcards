package com.rarael.studycards;

import com.rarael.studycards.model.FlashCards;
import com.rarael.studycards.model.FlashCards.classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudySets {
  private static List<FlashCards> flashCards;

  public StudySets() {
    flashCards = null;
  }

  public static List<FlashCards> create(FlashCards.classes whichClass) {
    if (flashCards == null) {
      flashCards = new ArrayList<FlashCards>();
        createBIOL101set();
        createBIOL101Lset();
        createCOMP455set();
        createCOMP311set();
    }
    return flashCards;
  }

  private static void createBIOL101set() {
    Map<String,String> questionsAndAnswers = new HashMap<String, String>();
    questionsAndAnswers.put("This is an example question", "this is an example answer");
    // add questions
    flashCards.add(new FlashCards(questionsAndAnswers));
  }
  private static void createBIOL101Lset() {
    Map<String,String> questionsAndAnswers = new HashMap<String, String>();
    questionsAndAnswers.put("This is an example question1", "this is an example answer1");
    // add questions
    flashCards.add(new FlashCards(questionsAndAnswers));
  }
  private static void createCOMP455set() {
    Map<String,String> questionsAndAnswers = new HashMap<String, String>();
    questionsAndAnswers.put("This is an example question2", "this is an example answer2");
    // add questions
    flashCards.add(new FlashCards(questionsAndAnswers));
  }
  private static void createCOMP311set() {
    Map<String,String> questionsAndAnswers = new HashMap<String, String>();
    questionsAndAnswers.put("This is an example question3", "this is an example answer3");
    // add questions
    flashCards.add(new FlashCards(questionsAndAnswers));
  }
}

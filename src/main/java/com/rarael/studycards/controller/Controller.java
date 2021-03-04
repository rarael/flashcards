package com.rarael.studycards.controller;

public interface Controller {
  void nextQuestion();
  void previousQuestion();
  boolean showingAnswer();
  void toggleAnswer();
}

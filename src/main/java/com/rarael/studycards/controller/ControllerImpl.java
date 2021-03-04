package com.rarael.studycards.controller;

import org.apache.maven.model.Model;

public class ControllerImpl implements Controller {
  private Model model;

  public ControllerImpl(Model model) {
    this.model = model;
  }

  public void nextQuestion() {

  }

  public void previousQuestion() {

  }

  public boolean showingAnswer() {
    return false;
  }

  public void toggleAnswer() {

  }
}

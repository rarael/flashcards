package com.rarael.studycards.controller;

import com.rarael.studycards.model.ModelImpl;

public class ControllerImpl implements Controller {
  private ModelImpl model;

  public ControllerImpl(ModelImpl model) {
    this.model = model;
  }

  public void nextQuestion() {
    model.nextQuestion();
  }

  public void previousQuestion() {
    model.previousQuestion();
  }

  public boolean showingAnswer() {
    return model.showingAnswer();
  }

  public void toggleAnswer() {
    model.toggleAnswer();
  }
}

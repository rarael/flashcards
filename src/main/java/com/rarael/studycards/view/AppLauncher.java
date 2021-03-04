package com.rarael.studycards.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppLauncher extends Application {

  public void start(Stage stage) throws Exception {
    stage.setTitle("STUDY SET");
    Scene scene = new Scene(new StackPane());
    stage.setScene(scene);
    stage.show();
  }
}

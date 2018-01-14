package reversiApp;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {

    try {
      
      HBox root = (HBox) FXMLLoader.load(getClass().getResource("Game.fxml"));
      Scene scene = new Scene(root, 600, 400);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setTitle("Reversi");
      primaryStage.setScene(scene);
      primaryStage.show();
      
      
//      AnchorPane start = (AnchorPane) FXMLLoader.load(getClass().getResource("Menu.fxml"));
//
//      Scene sceneStart = new Scene(start, 600, 600);
//
//      sceneStart.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//      primaryStage.setScene(sceneStart);
//      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
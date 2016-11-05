package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("secondSample.fxml"));
        primaryStage.setTitle("Second Stage");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


}

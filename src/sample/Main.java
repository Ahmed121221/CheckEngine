package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.HashMap;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Check Engine");
        Scene login = new Scene(root, 785.0, 618.0);
        // frameless
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(login);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

}

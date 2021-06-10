package cz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class window extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/example.fxml")
        );
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        room room1 = new room("místnost1", "Vsupní místnost", false);
        room room2 = new room("místnost2", "druhá místnost", false);
        room room3 = new room("místnost3", "třetí místnost", false);
        room room4 = new room("místnost4", "čtvrtá místnost", false);
        room room5 = new room("místnost5", "pátá místnost", false);
        room room6 = new room("místnost6", "šestá místnost", true);
        room1.setLower_room(room2);
        room2.setLower_room(room5);
        room2.setLeft_room(room3);
        room2.setUpper_room(room1);
        room3.setRight_room(room2);
        room3.setLower_room(room4);
        room4.setUpper_room(room3);
        room4.setRight_room(room5);
        room5.setUpper_room(room2);
        room5.setLeft_room(room4);
        room5.setLower_room(room6);
        room6.setUpper_room(room5);
        item diamond = new item("diamant", "treasure");
        room6.addItem(diamond);
        item key = new item("klíč ke dveřím ke 6. místnosti", "key");
        room3.addItem(key);
        ArrayList<room> rooms = new ArrayList<room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);


    }
}

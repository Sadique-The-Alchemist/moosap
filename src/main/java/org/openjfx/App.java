package org.openjfx;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(25, 25, 25, 25));

        FileInputStream input = new FileInputStream("src/assets/mosap_banner.png");

        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);
        hbox.setAlignment(Pos.CENTER);
        // gridPane.add(hbox, 0, 0, 2, 1);
        vBox.getChildren().add(hbox);
        Button payment = new Button("Make Payment");
        payment.setAlignment(Pos.CENTER);
        // gridPane.add(payment, 1, 1, 3, 1);
        vBox.getChildren().add(payment);
        TextField code = new TextField("Enter code here");
        code.setMinWidth(400);
        code.setPrefWidth(700);
        // gridPane.add(code, 0, 2, 2, 1);

        Button decryptButton = new Button("Decrypt");
        HBox codeBox = new HBox();
        codeBox.setPadding(new Insets(25, 25, 25, 25));
        codeBox.getChildren().add(code);
        codeBox.getChildren().add(decryptButton);
        codeBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(codeBox);
        // gridPane.add(decryptButton, 3, 2);
        Scene scene = new Scene(vBox, 500, 350);
        primaryStage.setTitle("Hello World Application");
        // primaryStage.setMaximized(true);
        primaryStage.setWidth(image.getWidth());
        primaryStage.setHeight(image.getHeight());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
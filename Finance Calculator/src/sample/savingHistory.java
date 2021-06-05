package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class savingHistory {

    public static void history2() {

            Stage savinghistry = new Stage();
            savinghistry.setTitle("Saving History");

            TextArea histry_1 = new TextArea();

            Button ok = new Button();
            ok.setLayoutX(260);
            ok.setLayoutY(410);
            ok.setText("Ok");
            ok.setPrefSize(100, 40);
            ok.setStyle("-fx-background-color:green; -fx-text-fill: white;");

            ok.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    savinghistry.close();
                }
            });


            try {
                File object_1 = new File("Saving Data.txt");
                Scanner reader_1 = new Scanner(object_1);
                while ((reader_1.hasNextLine())) {
                    String saving_data = reader_1.nextLine();
                    histry_1.appendText(saving_data);
                    histry_1.appendText(" \n ");


                }

            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }


            Pane root = new Pane();
            root.getChildren().add(histry_1);
            root.getChildren().add(ok);
            savinghistry.setScene(new Scene(root, 620, 500));
            savinghistry.show();
        }



}

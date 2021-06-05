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

public class LoanHistory {

    public static void history_3() {

        Stage loanHistry=new Stage();
        loanHistry.setTitle("Loan History");

        TextArea histry_1=new TextArea();

        Button ok=new Button();
        ok.setLayoutX(260);
        ok.setLayoutY(410);
        ok.setText("Ok");
        ok.setPrefSize(100,40);
        ok.setStyle("-fx-background-color:green; -fx-text-fill: white;");

        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loanHistry.close();
            }
        });


        try{
            File object_1=new File("Loan Data.txt");
            Scanner reader_1=new Scanner(object_1);
            while ((reader_1.hasNextLine())){
                String deposit_data=reader_1.nextLine();
                System.out.println(deposit_data);
                histry_1.appendText(deposit_data);
                histry_1.appendText(" \n ");



            }

        }catch (FileNotFoundException e) {
            System.out.println("Error");
        }





        Pane root = new Pane();
        root.getChildren().add(histry_1);
        root.getChildren().add(ok);
        loanHistry.setScene(new Scene(root, 620, 500));
        loanHistry.show();
    }
}

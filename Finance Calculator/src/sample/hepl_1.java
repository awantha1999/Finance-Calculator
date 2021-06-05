package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class hepl_1 {
    public static void content() {
        Stage help_s=new Stage();
        help_s.setTitle("Help");

        String s= " This program allow you to do the Saving ,Morgage and Loan calculations . \r" +
                "\r " +
                " Step 1 : " +
                " First you need to select the calculator you want on the home \r" +
                "               page .\r" +
                " \r" +
                "  Step 2 : Enter all the inputs except the output you want to get . \r" +
                " \r  Step 3 : You can give inputs to this program from your computer \r" +
                "               keyboard or program internal keyboard . \r" +
                "\r  Step 4 : Hit the ' Calculate ' button . After you can see the results.\r" +
                "               \r" +
                "               *** ALWAYS THIS PROGRAM SAVE AUTOMATICALLY \r" +
                "               YOUR CALCULATION DATA INTO THE TEXT FILE ! ***  \r" +
                "\r" +
                "   Step 5 : If you want to clear the data in the textField , \r" +
                "               click 'Reset' button ." ;



        Label lb=new Label();
        lb.setText(s);

        Button okbtn=new Button();
        okbtn.setText("Ok");
        okbtn.setLayoutX(180);
        okbtn.setLayoutY(420);
        okbtn.setPrefSize(100,40);
        okbtn.setStyle("-fx-background-color:green; -fx-text-fill: white;");

        okbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                help_s.close();
            }
        });

        Pane root = new Pane();
        root.getChildren().add(lb);
        root.getChildren().add(okbtn);

        help_s.setScene(new Scene(root, 500, 500));
        help_s.show();
        }

    }









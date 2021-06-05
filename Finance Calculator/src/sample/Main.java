package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Home");

        Button btn_1=new Button();
        btn_1.setText("Fixed Deposit");
        btn_1.setLayoutX(100);
        btn_1.setLayoutY(100);
        btn_1.setPrefSize(150,50);
        btn_1.setStyle("-fx-background-color:#16b75b; -fx-text-fill: white;");

        Button btn_2=new Button();
        btn_2.setText("Saving");
        btn_2.setLayoutX(100);
        btn_2.setLayoutY(180);
        btn_2.setPrefSize(150,50);
        btn_2.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button btn_3=new Button();
        btn_3.setText("Loan");
        btn_3.setLayoutX(100);
        btn_3.setLayoutY(260);
        btn_3.setPrefSize(150,50);
        btn_3.setStyle("-fx-background-color:#736dd7; -fx-text-fill: white;");

        Button btn_4=new Button();
        btn_4.setText("Mortgage");
        btn_4.setLayoutX(100);
        btn_4.setLayoutY(340);
        btn_4.setPrefSize(150,50);
        btn_4.setStyle("-fx-background-color:#845f2e; -fx-text-fill: white;");

        Button btn_5=new Button();
        btn_5.setText("Quit");
        btn_5.setLayoutX(100);
        btn_5.setLayoutY(420);
        btn_5.setPrefSize(150,50);
        btn_5.setStyle("-fx-background-color:#f54d5b; -fx-text-fill: white;");

        Image img1=new Image("img1.jpg");
        ImageView viewimg1=new ImageView();
        viewimg1.setImage(img1);
        viewimg1.setFitHeight(600);
        viewimg1.setFitWidth(800);
        viewimg1.setCache(true);
        viewimg1.setPreserveRatio(true);
        viewimg1.setSmooth(true);





        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               page1.first();
            }
        });

        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                page2.second();


            }

        });

        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                page3.third();

            }
        });

        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                page4.fourth();

            }
        });

        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();

            }
        });









        Pane root = new Pane();
        root.getChildren().add(viewimg1);
        root.getChildren().add(btn_1);
        root.getChildren().add(btn_2);
        root.getChildren().add(btn_3);
        root.getChildren().add(btn_4);
        root.getChildren().add(btn_5);


        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}

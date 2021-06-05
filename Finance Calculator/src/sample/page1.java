package sample;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.Optional;



public class page1 {




    public static void first() {
        Stage stage1 =new Stage();
        stage1.setTitle("Fixed deposit");

        Label lb1=new Label();
        lb1.setText("Capital");
        lb1.setLayoutX(20);
        lb1.setLayoutY(100);

        Label lb2=new Label();
        lb2.setText("Rate ");
        lb2.setLayoutX(20);
        lb2.setLayoutY(150);

        Label lb3=new Label();
        lb3.setText("Period ");
        lb3.setLayoutX(20);
        lb3.setLayoutY(200);

        Label lb4=new Label();
        lb4.setText("Fv   ");
        lb4.setLayoutX(20);
        lb4.setLayoutY(250);

        TextField txt1=new TextField();
        txt1.setLayoutX(100);
        txt1.setLayoutY(100);
        txt1.setPromptText("Rs");

        TextField txt2=new TextField();
        txt2.setLayoutX(100);
        txt2.setLayoutY(150);
        txt2.setPromptText("%");


        TextField txt3=new TextField();
        txt3.setLayoutX(100);
        txt3.setLayoutY(200);
        txt3.setPromptText("Years");

        TextField txt4=new TextField();
        txt4.setLayoutX(100);
        txt4.setLayoutY(250);
        txt4.setPromptText("Rs");

        Button help=new Button();
        help.setText("Help");
        help.setLayoutX(0);
        help.setLayoutY(0);
        help.setPrefSize(100,40);
        help.setStyle("-fx-background-color:rgb(191, 121, 113); -fx-text-fill: white;");


        Button btn2=new Button();
        btn2.setText("Back");
        btn2.setLayoutX(420);
        btn2.setLayoutY(535);
        btn2.setPrefSize(100,40);
        btn2.setStyle("-fx-background-color:rgb(47, 126, 159); -fx-text-fill: white;");

        Label lb9=new Label();
        lb9.setLayoutX(300);

        Button btn3=new Button();
        btn3.setText("Calculate");
        btn3.setLayoutX(50);
        btn3.setLayoutY(320);
        btn3.setPrefSize(100,20);
        btn3.setStyle("-fx-background-color:Green; -fx-text-fill: white;");

        Button reset=new Button();
        reset.setText("Reset");
        reset.setLayoutX(180);
        reset.setLayoutY(320);
        reset.setPrefSize(100,20);
        reset.setStyle("-fx-background-color:#f54d5b; -fx-text-fill: white;");

        Button history=new Button();
        history.setText("Watch Fixed Deposit History");
        history.setLayoutX(102);
        history.setLayoutY(0);
        history.setPrefSize(220,40);
        history.setStyle("-fx-background-color:rgb(165, 135, 171); -fx-text-fill: white;");

        //keyboard Buttons

        Button key1=new Button();
        key1.setText("1");
        key1.setLayoutX(350);
        key1.setLayoutY(200);
        key1.setFocusTraversable(false);
        key1.setPrefSize(40,40);
        key1.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");


        Button key2=new Button();
        key2.setText("2");
        key2.setLayoutX(400);
        key2.setLayoutY(200);
        key2.setFocusTraversable(false);
        key2.setPrefSize(40,40);
        key2.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key3=new Button();
        key3.setText("3");
        key3.setLayoutX(450);
        key3.setLayoutY(200);
        key3.setFocusTraversable(false);
        key3.setPrefSize(40,40);
        key3.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key4=new Button();
        key4.setText("4");
        key4.setLayoutX(350);
        key4.setLayoutY(150);
        key4.setFocusTraversable(false);
        key4.setPrefSize(40,40);
        key4.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key5=new Button();
        key5.setText("5");
        key5.setLayoutX(400);
        key5.setLayoutY(150);
        key5.setFocusTraversable(false);
        key5.setPrefSize(40,40);
        key5.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key6=new Button();
        key6.setText("6");
        key6.setLayoutX(450);
        key6.setLayoutY(150);
        key6.setFocusTraversable(false);
        key6.setPrefSize(40,40);
        key6.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key7=new Button();
        key7.setText("7");
        key7.setLayoutX(350);
        key7.setLayoutY(100);
        key7.setFocusTraversable(false);
        key7.setPrefSize(40,40);
        key7.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key8=new Button();
        key8.setText("8");
        key8.setLayoutX(400);
        key8.setLayoutY(100);
        key8.setFocusTraversable(false);
        key8.setPrefSize(40,40);
        key8.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key9=new Button();
        key9.setText("9");
        key9.setLayoutX(450);
        key9.setLayoutY(100);
        key9.setFocusTraversable(false);
        key9.setPrefSize(40,40);
        key9.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key10=new Button();
        key10.setText("0");
        key10.setLayoutX(350);
        key10.setLayoutY(250);
        key10.setFocusTraversable(false);
        key10.setPrefSize(40,40);
        key10.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key11=new Button();
        key11.setText(".");
        key11.setLayoutX(400);
        key11.setLayoutY(250);
        key11.setFocusTraversable(false);
        key11.setPrefSize(40,40);
        key11.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");

        Button key12=new Button();
        key12.setText("<");
        key12.setLayoutX(450);
        key12.setLayoutY(250);
        key12.setFocusTraversable(false);
        key12.setPrefSize(40,40);
        key12.setStyle("-fx-background-color:Gray; -fx-text-fill: white;");


        //End of the keyboard Buttons

        Image img1=new Image("img1.jpg");         //Adding image
        ImageView viewimg2=new ImageView();
        viewimg2.setImage(img1);
        viewimg2.setFitHeight(700);
        viewimg2.setFitWidth(1000);
        viewimg2.setCache(true);
        viewimg2.setPreserveRatio(true);
        viewimg2.setSmooth(true);


        //keyboard Button functions

        key1.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"1");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"1");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"1");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"1");
            }

        });

        key2.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"2");

            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"2");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"2");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"2");
            }

        });

        key3.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"3");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"3");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"3");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"3");
            }

        });

        key4.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"4");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"4");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"4");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"4");
            }

        });

        key5.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"5");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"5");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"5");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"5");
            }

        });

        key6.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"6");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"6");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"6");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"6");
            }

        });

        key7.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"7");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"7");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"7");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"7");
            }

        });

        key8.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"8");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"8");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"8");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"8");
            }

        });

        key9.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"9");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"9");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"9");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"9");
            }

        });

        key10.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+"0");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+"0");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+"0");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+"0");
            }

        });

        key11.setOnAction(event -> {
            if (txt1.isFocused()){
                txt1.setText(txt1.getText()+".");
            }
            if(txt2.isFocused()){
                txt2.setText(txt2.getText()+".");
            }
            if(txt3.isFocused()){
                txt3.setText(txt3.getText()+".");
            }
            if(txt4.isFocused()){
                txt4.setText(txt4.getText()+".");
            }


        });

        key12.setOnAction(event -> {
            if(txt1.isFocused()){
                int i;
                String text_1=txt1.getText();
                String word = text_1;
                String[] texts = word.split("");
                ArrayList<String> word_1 = new ArrayList<String>();

                for(String text : texts)
                {
                    word_1.add(text);
                }

                txt1.clear();
                for (i=0;i<word_1.size()-1;i++){

                    txt1.appendText(String.valueOf(word_1.get(i)));

                }

            }
            if(txt2.isFocused()){
                int i;
                String text_2=txt2.getText();
                String word = text_2;
                String[] texts = word.split("");
                ArrayList<String> word_2 = new ArrayList<String>();

                for(String text : texts)
                {
                    word_2.add(text);
                }

                txt2.clear();
                for (i=0;i<word_2.size()-1;i++){

                    txt2.appendText(String.valueOf(word_2.get(i)));

                }


            }
            if(txt3.isFocused()){
                int i;
                String text_3=txt3.getText();
                String word = text_3;
                String[] texts = word.split("");
                ArrayList<String> word_3 = new ArrayList<String>();

                for(String text : texts)
                {
                    word_3.add(text);
                }

                txt3.clear();
                for (i=0;i<word_3.size()-1;i++){

                    txt3.appendText(String.valueOf(word_3.get(i)));

                }

            }

            if (txt4.isFocused()){
                int i;
                String text_4=txt4.getText();
                String word = text_4;
                String[] texts = word.split("");
                ArrayList<String> word_4 = new ArrayList<String>();

                for(String text : texts)
                {
                    word_4.add(text);
                }

                txt4.clear();
                for (i=0;i<word_4.size()-1;i++){

                    txt4.appendText(String.valueOf(word_4.get(i)));

                }
            }




        });





        //End of keyboard




        history.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fixDepoditHistory.history_1();

            }
        });


        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
            }
        });




        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage1.close();
            }
        });

        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hepl_1.content();
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                String st1=txt1.getText();
                String st2=txt2.getText();
                String st3=txt3.getText();
                String st4=txt4.getText();

                try {
                    if (st4.isEmpty()){

                        double P= Double.parseDouble(st1);
                        double T= Double.parseDouble(st3);
                        double R= (Double.parseDouble(st2))/100;
                        double a=1+(R/4);
                        double b=4*T;

                        double c=Math.pow(a,b);

                        double round1=Math.round(c*100.0)/100.0;
                        double fv=round1*P;
                        double roundoff=Math.round(fv*100.0)/100.0;
                        txt4.setText(String.valueOf(roundoff));

                        Alert alert =new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Future value is Rs "+roundoff+"  " + " \n \nAll the Data exported successfully, into the history file !");
                        Optional<ButtonType> result=alert.showAndWait();

                        File file=new File("Fixed Deposit Data.txt");
                        PrintWriter pw;
                        FileWriter fw;
                        try {
                            fw=new FileWriter(file,true);
                            pw=new PrintWriter(fw,true);
                            pw.println("---------------------- ");
                            pw.println("Capital :"+P);
                            pw.println("Rate : :"+R*100);
                            pw.println("Period :"+T);
                            pw.println("Fv :"+roundoff);


                        }catch (IOException e){
                            Alert alert_1 =new Alert(Alert.AlertType.ERROR);
                            alert_1.setContentText("No Permission to write the file");
                            Optional<ButtonType> result_1=alert.showAndWait();
                        }


                    }
                    else if(st3.isEmpty()){
                        double P= Double.parseDouble(st1);
                        double R= Double.parseDouble(st2)/100;
                        double fv= Double.parseDouble(st4);
                        double a= Math.log(fv/P);
                        double b=Math.log(1+(R/4));
                        double c=b*4;
                        double d=a/c;
                        txt3.setText(String.valueOf(Math.round(d)));

                        Alert alert =new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("No of months "+ Math.round(d)+" \n \nAll the Data exported successfully, into the history file !");
                        Optional<ButtonType> result=alert.showAndWait();

                        File file=new File("Fixed Deposit Data.txt");
                        PrintWriter pw;
                        FileWriter fw;
                        try {
                            fw=new FileWriter(file,true);
                            pw=new PrintWriter(fw,true);
                            pw.println("---------------------- ");
                            pw.println("Capital :"+P);
                            pw.println("Rate : :"+R*100);
                            pw.println("Period :"+Math.round(d));
                            pw.println("Fv :"+fv);


                        }catch (IOException e){
                            Alert alert_1 =new Alert(Alert.AlertType.ERROR);
                            alert_1.setContentText("No Permission to write the file.txt");
                            Optional<ButtonType> result_1=alert.showAndWait();
                        }


                    }
                    else if(st2.isEmpty()){
                        double P= Double.parseDouble(st1);
                        double T= Double.parseDouble(st3);
                        double fv= Double.parseDouble(st4);
                        double a=fv/P;
                        double b=Math.pow(a,1/(4*T));
                        double c=(b-1)*4;
                        double roundoff=Math.round(c*100.0)/100.0;
                        txt2.setText(String.valueOf(roundoff*100));

                        Alert alert =new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Rate "+roundoff*100+"%"+"\n \nAll the Data exported successfully, into the history file !");
                        Optional<ButtonType> result=alert.showAndWait();

                        File file=new File("Fixed Deposit Data.txt");
                        PrintWriter pw;
                        FileWriter fw;
                        try {
                            fw=new FileWriter(file,true);
                            pw=new PrintWriter(fw,true);
                            pw.println("---------------------- ");
                            pw.println("Capital :"+P);
                            pw.println("Rate : :"+roundoff*100);
                            pw.println("Period :"+T);
                            pw.println("Fv :"+fv);


                        }catch (IOException e){
                            Alert alert_1 =new Alert(Alert.AlertType.ERROR);
                            alert_1.setContentText("No Permission to write the file");
                            Optional<ButtonType> result_1=alert.showAndWait();
                        }


                    }
                    else if(st1.isEmpty()){
                        double R= Double.parseDouble(st2)/100;
                        double T= Double.parseDouble(st3);
                        double FV= Double.parseDouble(st4);
                        double a=1+(R/4);
                        double b=4*T;
                        double c=Math.pow(a,b);
                        double round1=Math.round(c*100.0)/100.0;
                        double P=FV/round1;
                        double roundoff=Math.round(P*100.0)/100.0;
                        txt1.setText(String.valueOf(roundoff));

                        Alert alert =new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Present Value Rs "+roundoff+ " \n \nAll the Data exported successfully, into the history file !");
                        Optional<ButtonType> result=alert.showAndWait();

                        File file=new File("Fixed Deposit Data.txt");
                        PrintWriter pw;
                        FileWriter fw;
                        try {
                            fw=new FileWriter(file,true);
                            pw=new PrintWriter(fw,true);
                            pw.println("---------------------- ");
                            pw.println("Capital :"+roundoff);
                            pw.println("Rate : :"+R*100);
                            pw.println("Period :"+T);
                            pw.println("Fv :"+FV);


                        }catch (IOException e){
                            Alert alert_1 =new Alert(Alert.AlertType.ERROR);
                            alert_1.setContentText("No Permission to write the file");
                            Optional<ButtonType> result_1=alert.showAndWait();
                        }
                    }
                }catch (Exception e){
                    Alert alert =new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please give 3 inputs !");
                    Optional<ButtonType> result=alert.showAndWait();

                }










            }
        });
        Pane root = new Pane();
        root.getChildren().add(viewimg2);
        root.getChildren().add(lb1);
        root.getChildren().add(lb2);
        root.getChildren().add(lb3);
        root.getChildren().add(lb4);
        root.getChildren().add(txt1);
        root.getChildren().add(txt2);
        root.getChildren().add(txt3);
        root.getChildren().add(txt4);
        root.getChildren().add(btn2);
        root.getChildren().add(lb9);
        root.getChildren().add(btn3);
        root.getChildren().add(reset);
        root.getChildren().add(history);
        root.getChildren().add(key1);
        root.getChildren().add(key2);
        root.getChildren().add(key3);
        root.getChildren().add(key4);
        root.getChildren().add(key5);
        root.getChildren().add(key6);
        root.getChildren().add(key7);
        root.getChildren().add(key8);
        root.getChildren().add(key9);
        root.getChildren().add(key10);
        root.getChildren().add(key11);
        root.getChildren().add(help);
        root.getChildren().add(key12);


        stage1.setScene(new Scene(root, 1000, 600));
        stage1.show();





    }




}


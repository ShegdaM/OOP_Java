package ua.lpnuai.oop.shegda15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main15 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Enter torgova tochka:");

        GridPane gridPane = createRegistrationFormPane();

        addUIControls(gridPane);

        Scene scene = new Scene(gridPane, 700, 450);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    private GridPane createRegistrationFormPane() {
        GridPane gridPane = new GridPane();

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(40, 40, 40, 40));

        gridPane.setHgap(10);

        gridPane.setVgap(10);

        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        Label headerLabel = new Label("Add torgova tochka:");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        headerLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(headerLabel, 0,0,2,1);

        gridPane.setStyle("-fx-background-image: url(https://dribbble.com/shots/3962532-Daily-UI-059-Background-Pattern/attachments/905272)");
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        Label nameLabel = new Label("Name: ");
        nameLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(nameLabel, 0,1);

        TextField nameField = new TextField();
        nameField.setPrefHeight(20);
        gridPane.add(nameField, 1,1);

        Label emailLabel = new Label("Specialization: ");
        emailLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(emailLabel, 0, 2);

        TextField emailField = new TextField();
        emailField.setPrefHeight(20);
        gridPane.add(emailField, 1, 2);

        Label RegNumLabel = new Label("Day: ");
        RegNumLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(RegNumLabel, 0, 3);

        TextField RegNumField = new TextField();
        RegNumField.setPrefHeight(20);
        gridPane.add(RegNumField, 1, 3);

        Label RegDateLabel = new Label("Number: ");
        RegDateLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(RegDateLabel, 0, 4);

        TextField RegDateField = new TextField();
        RegDateField.setPrefHeight(20);
        gridPane.add(RegDateField, 1, 4);

        Label GendLabel = new Label("Adress:");
        GendLabel.setStyle("-fx-text-fill: #000000");
        gridPane.add(GendLabel, 0, 5);

        TextField GendField = new TextField();
        GendField.setPrefHeight(20);
        gridPane.add(GendField, 1, 5);

        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        submitButton.setStyle("-fx-background-color: #FFDB58");
        gridPane.add(submitButton, 0, 6, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));


        Button deleteButton = new Button("Delete");
        deleteButton.setPrefHeight(40);
        deleteButton.setDefaultButton(true);
        deleteButton.setPrefWidth(100);
        deleteButton.setStyle("-fx-background-color: #FFDB58");
        gridPane.add(deleteButton, 0, 6, 2, 1);
        GridPane.setHalignment(deleteButton, HPos.LEFT);
        GridPane.setMargin(deleteButton, new Insets(20, 0,20,0));

        Button autoButton = new Button("Auto");
        autoButton.setPrefHeight(40);
        autoButton.setDefaultButton(true);
        autoButton.setPrefWidth(100);
        autoButton.setStyle("-fx-background-color: #FFDB58");
        gridPane.add(autoButton, 0, 6, 2, 1);
        GridPane.setHalignment(autoButton, HPos.RIGHT);
        GridPane.setMargin(autoButton, new Insets(20, 0,20,0));

        autoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlert(Alert.AlertType.WARNING, gridPane.getScene().getWindow(), "Autofilling", "File Autofilled!");
                File myFile = new File("C:\\Games\\test2.txt");
                ArrayList writelist;
                writelist = new ArrayList();
                writelist.add("Some name");
                writelist.add("Some spec");
                writelist.add("Some day");
                writelist.add("Some number");
                writelist.add("Some adress");
                try {
                    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                    writer.println(writelist);
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        deleteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                File myFile = new File("C:\\Games\\test2.txt");
                if(myFile.delete()){
                    showAlert(Alert.AlertType.WARNING, gridPane.getScene().getWindow(), "Removal", "File successfully deleted!");
                }
                else
                    showAlert(Alert.AlertType.WARNING, gridPane.getScene().getWindow(), "Removal error!", "File wasn`t found!");
                return;
            }
        });

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                showAlert(Alert.AlertType.WARNING, gridPane.getScene().getWindow(), "Registration Successful!", "Success!");

                File myFile = new File("C:\\Games\\test2.txt");
                ArrayList writelist;
                writelist = new ArrayList();
                writelist.add(nameField.getText());
                writelist.add(emailField.getText());
                writelist.add(RegDateField.getText());
                writelist.add(RegNumField.getText());
                writelist.add(GendField.getText());
                try {
                    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                    writer.println(writelist);
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static boolean isWord(String in){
        return Pattern.matches("[a-zA-Z, ]+",in);
    }

    public static boolean isNumber(String in){
        return Pattern.matches("[0-9]+",in);
    }

    public static boolean validDate(String in){
        return Pattern.matches("[0-9.,:]+",in);
    }
}
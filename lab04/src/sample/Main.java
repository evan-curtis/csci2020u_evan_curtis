package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

import javafx.scene.layout.VBox;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab 4 Solution");
        Label UNLabel = new Label("Username:");
        TextField UNInput = new TextField();

        Label PassLabel = new Label("Password:");
        PasswordField PassInput = new PasswordField();

        Label nameLabel = new Label("Full Name:");
        TextField nameInput = new TextField();

        Label emailLabel = new Label("E-Mail:");
        TextField emailInput = new TextField();

        Label phoneLabel = new Label("Phone #:");
        TextField phoneInput = new TextField();

        Label birthLabel = new Label("Date of Birth:");
        DatePicker birthInput = new DatePicker();

        Label submitSpacing = new Label(" ");

        HBox Username = new HBox(UNLabel, UNInput);
        HBox Password = new HBox(PassLabel, PassInput);
        HBox Name = new HBox(nameLabel, nameInput);
        HBox email = new HBox(emailLabel, emailInput);
        HBox phone = new HBox(phoneLabel, phoneInput);
        HBox birth = new HBox(birthLabel, birthInput);

        Button submit = new Button("Register");
        HBox submitbox = new HBox(submitSpacing, submit);

        Username.setSpacing(19);
        Password.setSpacing(22);
        Name.setSpacing(18);
        email.setSpacing(38);
        phone.setSpacing(27);
        birth.setSpacing(5);
        submitbox.setSpacing(70);

        VBox fields = new VBox(Username, Password, Name, email, phone, birth, submitbox);
        fields.setSpacing(10);

        primaryStage.setScene(new Scene(fields, 400 , 300));


        primaryStage.show();

        submit.setOnAction(value -> {
            System.out.println("Username: "+ UNInput.getText());
            System.out.println("Password: "+ PassInput.getText());
            System.out.println("Name: "+ nameInput.getText());
            System.out.println("E-Mail: "+ emailInput.getText());
            System.out.println("Phone #: "+ phoneInput.getText());
            System.out.println("Date of Birth: "+ birthInput.getValue());
        });
    }

    public static void main(String[] args){
        launch(args);
    }
}

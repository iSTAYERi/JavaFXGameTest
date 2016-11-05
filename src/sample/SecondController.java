package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by stayer on 05.11.16.
 */
public class SecondController implements Initializable{

    public TextField textFieldLogin;
    public TextField textFieldAge;
    public ChoiceBox choiceBoxSex;
    public CheckBox checkBoxPython;
    public CheckBox checkBoxJava;
    public CheckBox checkBoxCPlusPlus;
    public Label labelComment;
    public PasswordField passwordField;

    public void pressButtonSubmit(){
        if (textFieldLogin.getText().isEmpty()){
            labelComment.setText("You don't fill Login field");
        }
        else if (passwordField.getText().isEmpty()){
            labelComment.setText("You don't fill Password field");
        }
        else if (textFieldAge.getText().isEmpty()){
            labelComment.setText("You don't fill Age field");
        }
        else{
            try {
                int age = Integer.parseInt(textFieldAge.getText());
            }catch (Exception e) {
                labelComment.setText("Age must be integer");
            }
            System.out.println(
                    "Login: " + textFieldLogin.getText() +
                    "\nPassword: " + passwordField.getText() +
                    "\nAge: " + textFieldAge.getText() +
                    "\nSex: " + choiceBoxSex.getValue().toString() +
                    "\nLanguages: ");
        }
    }
    public void pressButtonClear(){
        textFieldLogin.clear();
        textFieldAge.clear();
        passwordField.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBoxSex.setItems(FXCollections.observableArrayList("Male", "Female"));
        choiceBoxSex.setValue("Male");
    }

}

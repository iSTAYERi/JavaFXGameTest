package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Rectangle rect;
    public ToggleButton toggleButtonChangeColor;
//    public Random rand;
    public ToggleGroup togGroup1;
    public RadioButton radioButton1;
    public RadioButton radioButton2;
    public RadioButton radioButton3;
    public ImageView imageViewGeneral;


    public void pressButtonChangeColor(){
        if (toggleButtonChangeColor.isSelected()) {
            rect.setFill(Color.RED);
        } else {
            rect.setFill(Color.BLACK);
        }
    }

    public void pressRadioButton1(){
        setImageViewGeneral("grass.jpg");
    }
    public void pressRadioButton2(){
        setImageViewGeneral("pussy.jpg");
    }
    public void pressRadioButton3(){
        setImageViewGeneral("tree.jpg");
    }

    public void pressButtonSecondStage(){
        Stage stage = new Stage();
        SecondStage win = new SecondStage();
        try {
            win.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enteredButtonChangeColor(){
//        rand = new Random();
//        int shift = rand.nextInt(100);
//        double oldPositionX = toggleButtonChangeColor.getTranslateX();
//        double oldPositionY = toggleButtonChangeColor.getTranslateY();
//
//        toggleButtonChangeColor.setTranslateX(oldPositionX + 50);
//        toggleButtonChangeColor.setTranslateY(oldPositionY + 50);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setImageViewGeneral("grass.jpg");
    }

    public void setImageViewGeneral(String imageNameWithExtention) {
        Image imag = new Image(getClass().getResourceAsStream("/pictures/" + imageNameWithExtention));
        imageViewGeneral.setImage(imag);
    }
}

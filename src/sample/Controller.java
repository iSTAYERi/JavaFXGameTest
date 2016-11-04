package sample;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Controller {
    public Rectangle rect;
    public ToggleButton toggleButtonChangeColor;
    public Random rand;
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

    public void enteredButtonChangeColor(){
//        rand = new Random();
//        int shift = rand.nextInt(100);
//        double oldPositionX = toggleButtonChangeColor.getTranslateX();
//        double oldPositionY = toggleButtonChangeColor.getTranslateY();
//
//        toggleButtonChangeColor.setTranslateX(oldPositionX + 50);
//        toggleButtonChangeColor.setTranslateY(oldPositionY + 50);
    }
}

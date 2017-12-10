/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceenshot;

import java.awt.Color;
//import java.awt.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;


/**
 *
 * @author Mayur
 */
public class Sceenshot extends Application {
    
    @Override
    public void start(Stage stage)throws Exception {
        //stage = new Stage(StageStyle.TRANSPARENT);
        stage.setResizable(false);
       // stage.centerOnScreen();
        stage.setTitle("Screenshot By MK");
        try{
        Image anothericon = new Image("file:C:\\Users\\Mayur\\Documents\\NetBeansProjects\\Sceenshot\\src\\sceenshot\\unnamed.png");
        stage.getIcons().add(anothericon);
        }
        catch(Exception e)
        {
        
        }
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

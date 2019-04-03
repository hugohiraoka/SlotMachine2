
/**
 *  Homework Chapter 11 Slot Machine DUE DATE: 3/31/2019 
 *  Hugo Hiraoka
 *  Eric Petit
 *  Mitchell Napoleon
 * 
 */

package slotmachinetwo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextFormatter;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.text.Font;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.*;
import static javafx.application.Application.launch;
import javafx.scene.control.TextFormatter.Change;

/**
 *
 * @author hhira
 */
public class SlotMachineTwo extends Application {
    
 // @Override
    public void start(Stage stage) throws Exception{

        
        
        
        Parent parent = FXMLLoader.load(getClass().getResource("SlotMachineTwo.fxml"));
        
        
        Scene scene = new Scene(parent);
        
        stage.setTitle("SLOT MACHINE TWO");
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

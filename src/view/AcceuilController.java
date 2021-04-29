/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class AcceuilController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private AnchorPane rootLayout;
    private Stage primaryStage;
    @FXML
    private Button btn;
    
    @FXML
    private Button btn2;
    @FXML
    private ImageView imageview;
    @FXML
    private Button btn3;
    @FXML
    private Button calcul;

   @Override
    public void initialize(URL url, ResourceBundle rb) {
      btn.setOnAction((event) -> {
             
          
          try {
            Parent page1 = FXMLLoader.load(getClass().getResource("/view/Ajoutervaccin.fxml"));
            
            
               Scene scene = new Scene(page1);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  stage.setScene(scene);
     stage.show();
  } catch (IOException ex) {
         Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
  }
      
     });
  
        btn2.setOnAction(event ->{
        try {
            Parent page   = FXMLLoader.load(getClass().getResource("/view/ListeVaccin.fxml"));
            Scene scene = new Scene(page );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    });  
                btn3.setOnAction(event ->{
        try {
            Parent page   = FXMLLoader.load(getClass().getResource("/view/panier.fxml"));
            Scene scene = new Scene(page );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    });  

        
    }

        // TODO
   //     btn_add.setOnAction((event) -> {
          
     //       try {
      //          Parent page1 = FXMLLoader.load(getClass().getResource("/view/Ajoutervaccin.fxml)"));
       //         Scene scene = new Scene(page1);
        //        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          //      stage.setScene(scene);
           //     stage.show();
        //    } catch (IOException ex) {
        //        Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
          ///  }
      //  });
    }   
    
    


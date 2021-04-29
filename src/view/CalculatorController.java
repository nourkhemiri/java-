/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class CalculatorController implements Initializable {

    @FXML
    private TextField txt_result;
    String op="";
    long number1;
    long number2;
    @FXML
    private Button retour;
    
    // click CTRL
    @FXML
    public void Number(ActionEvent ae){
        String no = ((Button)ae.getSource()).getText();
        txt_result.setText(txt_result.getText()+no);
        
        
    }
    
    //Second
    @FXML
     public void Operation (ActionEvent ae){
         String operation = ((Button)ae.getSource()).getText();
         if (!operation.equals("=")){
                     if (!op.equals("")){
             return;
             
         }
         op = operation;
         number1 = Long.parseLong(txt_result.getText());
         txt_result.setText("");
             
         } else {
             if(op.equals("")){
                 return;
                 
             }
             number2 = Long.parseLong(txt_result.getText());
             calculate( number1, number2,op);
             op="";
             
         }
 
         
        
    }
     
     public void calculate (long n1, long n2, String op){ 
         switch (op){
             case "+" : txt_result.setText(n1+ n2 + "");break;
             case "-" : txt_result.setText(n1 - n2 + "");break;
             case "*" : txt_result.setText(n1 * n2 + "");break;
             case "/" : txt_result.setText(n1 / n2 + "");break;
         }
         
     }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                                    retour.setOnAction((event) -> {
             
          
          try {
            Parent page1 = FXMLLoader.load(getClass().getResource("/view/ListeVaccin.fxml"));
               Scene scene = new Scene(page1);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  stage.setScene(scene);
     stage.show();
  } catch (IOException ex) {
         Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
  }
      
     });
    }    
    
}

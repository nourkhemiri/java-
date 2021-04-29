/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entite.vaccins;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import service.VaccinService;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class AjoutervaccinController implements Initializable {

    /**
     * Initializes the controller class.
     */
  
    @FXML
    private TextField nom;
     @FXML
    private TextField id_pharmacie;
      @FXML
    private TextField description;
       @FXML
    private TextField prix;
           @FXML
    private TextField quantity;
               @FXML
    private TextField img;
    @FXML
    private Button ajouter;
    @FXML
    private Button retour;
    @FXML
    private Button calendrier;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    ajouter.setOnAction((event) -> { 
    
       vaccins v = new vaccins(nom.getText(),id_pharmacie.getText(),description.getText(),Double.parseDouble(prix.getText()),Integer.parseInt(quantity.getText()),img.getText());
        VaccinService vs = new VaccinService();
        vs.ajouterVaccin(v);
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("information dialog");
        alert.setHeaderText(null);
        alert.setContentText("vaccin ajouté avec succes");
        alert.show();
        nom.setText("");
        id_pharmacie.setText("");
        description.setText("");
        prix.setText("");
        quantity.setText("");
        img.setText("");
    });
            calendrier.setOnAction((event) -> {
             
          
          try {
            Parent page4 = FXMLLoader.load(getClass().getResource("/view/calendrier.fxml"));
               Scene scene = new Scene(page4);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  stage.setScene(scene);
     stage.show();
  } catch (IOException ex) {
         Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
  }
      
     });
        retour.setOnAction((event) -> {
             
          
          try {
            Parent page4 = FXMLLoader.load(getClass().getResource("/view/acceuil.fxml"));
               Scene scene = new Scene(page4);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  stage.setScene(scene);
     stage.show();
  } catch (IOException ex) {
         Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
  }
      
     });

    }    
    
}

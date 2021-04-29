/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entite.reservationvacc;
import entite.vaccins;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import service.VaccinService;
import service.reservationvaccService;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class ReserverController implements Initializable {

    @FXML
    private Button reserver;
    @FXML
    private TextField nom_vaccin;
    @FXML
    private TextField id_pharmacie;
    @FXML
    private TextField id_patient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      reserver.setOnAction((event) -> { 
 
   reservationvacc vac = new reservationvacc(nom_vaccin.getText(),id_pharmacie.getText(),id_patient.getText());
    reservationvaccService vs = new reservationvaccService();
   vs.ajouterreservation(vac);
   Alert alert = new Alert(Alert.AlertType.ERROR);
  alert.setTitle("information dialog");
  alert.setHeaderText(null);
  alert.setContentText("vaccin ajouté avec succes");
   alert.show();
   nom_vaccin.setText("");
   id_pharmacie.setText("");
   id_patient.setText("");
     
  });
    }    
    
}

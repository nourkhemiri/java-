/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class CalendrierController implements Initializable {

    @FXML
    private DatePicker dtPicker;
    @FXML
    private Button btnDate;
    @FXML
    private Label lbDate;
    @FXML
    private Button retour;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                           retour.setOnAction(event ->{
        try {
            Parent page4   = FXMLLoader.load(getClass().getResource("/view/ListeVaccin.fxml"));
            Scene scene = new Scene(page4 );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }); 
        // TODO
    }    

    @FXML
    private void onDate(ActionEvent event) {
        LocalDate lDate = dtPicker.getValue();
        lbDate.setText(formatDate(lDate.toString()));
        
    }
    
    
    public String formatDate (String Date){
        SimpleDateFormat sdf = null;
        Date d = null;
        try {
            sdf = new SimpleDateFormat("yy-MM-dd");
            d = sdf.parse(Date);
            sdf.applyPattern("EEEE d MM YYYY");
        } catch ( ParseException e) {
            System.out.println(e);
        }
        return sdf.format(d);
    }
    
}

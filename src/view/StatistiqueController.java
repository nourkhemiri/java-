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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import service.VaccinService;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class StatistiqueController implements Initializable {

    @FXML
    private BarChart<String, Number> vaccin_covid;
    @FXML
    private NumberAxis y;
    @FXML
    private CategoryAxis x;
        final static String Pfizer = "Pfizer";
    final static String Moderna = "Moderna";
    final static String Astra = "Astra";
    final static String Sinovac = "Sinovac";
    @FXML
    private Button retour;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      XYChart.Series series1 = new XYChart.Series();
        series1.setName("2021");       
        VaccinService dr = new VaccinService();
        for(int i=0;i<dr.readchart().size(); i++)
        {
                    series1.getData().add(new XYChart.Data(dr.readchart().get(i).getNom(), dr.readchart().get(i).getQuantity()));

        }
        
         
        vaccin_covid.getData().addAll(series1);
                                   retour.setOnAction((event) -> {
             
          
          try {
            Parent page4 = FXMLLoader.load(getClass().getResource("/view/ListeVaccin.fxml"));
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

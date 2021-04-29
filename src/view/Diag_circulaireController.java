/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class Diag_circulaireController implements Initializable {

    @FXML
    private PieChart pieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                   ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Pfizer", 13),
                new PieChart.Data("Moderna", 25),
                new PieChart.Data("Astra", 10),
                new PieChart.Data("Sinovac", 22),
                new PieChart.Data("novaclav", 30));
        
        pieChart.setData(pieChartData);
        pieChart.setTitle("Vaccin Covid");
    }    
    
}

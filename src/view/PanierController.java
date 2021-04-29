/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entite.panier;
import entite.reservationvacc;
import entite.vaccins;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import service.PanierService;
import service.VaccinService;
import service.reservationvaccService;
import utils.DataSource;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class PanierController implements Initializable {

    @FXML
    private TableColumn<panier, Integer> id;
    @FXML
    private TableColumn<panier, String> id_vaccin;
    @FXML
    private TableColumn<panier, String> nom_vaccin;
    @FXML
    private TableColumn<panier, String> prix_vaccin;
    ObservableList<panier> panierList=FXCollections.observableArrayList();
    String query= null ;
    Connection connection= null ;
    PreparedStatement ps = null;
    ResultSet rs=null;
    vaccins vaccins = null;
    @FXML
    private TableView<panier> table;
    ObservableList<panier> oblist=FXCollections.observableArrayList();
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private TextField text_id;
    @FXML
    private TextField text_nom;
    int index =-1 ;
    @FXML
    private Button ajouter_au_panier;
    @FXML
    private AnchorPane retour;
    @FXML
    private Button rt;
    @FXML
    private Button act;
    @FXML
    private Button totall;
    @FXML
    private TableColumn<?, ?> prix_vaccin1;

 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                       act.setOnAction(event ->{
        try {
            Parent page4   = FXMLLoader.load(getClass().getResource("/view/panier.fxml"));
            Scene scene = new Scene(page4 );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }); 
                   rt.setOnAction(event ->{
        try {
            Parent page4   = FXMLLoader.load(getClass().getResource("/view/acceuil.fxml"));
            Scene scene = new Scene(page4 );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }); 
             ajouter_au_panier.setOnAction(event ->{
        try {
            Parent page4   = FXMLLoader.load(getClass().getResource("/view/ajouterpanier.fxml"));
            Scene scene = new Scene(page4 );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }); 
 
             
        loadDate();
    }    

    @FXML
    private void getAffiche() throws SQLException {
          panierList.clear();
        PanierService sc=new PanierService();
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        id_vaccin.setCellValueFactory(new PropertyValueFactory<>("id_vaccin"));
         nom_vaccin.setCellValueFactory(new PropertyValueFactory<>("nom_vaccin"));
          prix_vaccin.setCellValueFactory(new PropertyValueFactory<>("prix_vaccin"));
           
        table.setItems((ObservableList<panier>) sc.readAll()); 
        
    }
              

    private void loadDate() {
        connection=DataSource.getInstance().getCnx();
        try {
            getAffiche();
        } catch (SQLException ex) {
            Logger.getLogger(PanierController.class.getName()).log(Level.SEVERE, null, ex);
        }
           id_vaccin.setCellValueFactory(new PropertyValueFactory<>("id_vaccin"));
   nom_vaccin.setCellValueFactory(new PropertyValueFactory<>("nom_vaccin"));
   prix_vaccin.setCellValueFactory(new PropertyValueFactory<>("prix_vaccin"));
          
    }

    @FXML
    private void getselected(MouseEvent event) {
              index = table.getSelectionModel().getSelectedIndex();
    if (index <= -1){
    
   }
    text_id.setText(id_vaccin.getCellData(index).toString());

  
   text_nom.setText(nom_vaccin.getCellData(index).toString());
    }

    @FXML
    private void Edit(ActionEvent event) {
        String nom_vaccin = text_nom.getText();
        String id_vaccin = text_id.getText();
           PanierService sc=new PanierService() ;
           sc.Updatepanier(id_vaccin, nom_vaccin);
           
           JOptionPane.showMessageDialog(null, "Update");
    }

    @FXML
    private void delete(ActionEvent event) {
           String id_vaccin = text_id.getText();
           PanierService sc=new PanierService() ;
           sc.Deletepanier(id_vaccin);
           JOptionPane.showMessageDialog(null, "Delete Done"+id_vaccin);
    }

 

    @FXML
    private void total(ActionEvent event) throws SQLException {
          PanierService p = new PanierService();
        double m=p.calcultotalpanier("4");
//    prixtotal.setText();
         JOptionPane.showMessageDialog(null, m);
        
    }

    @FXML
    private void reserver(ActionEvent event) {
        String vaccins = id.getText();
        reservationvacc r1= new reservationvacc( 9 ,"unidex", "tunis", "saraaa");
        reservationvaccService sr = new reservationvaccService ();
        sr.ajouterreservation(r1);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(query);
        alert.setHeaderText(query);
        alert.setContentText("vaccin réservé avec succés");
        alert.show();
        
    }
    }



 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import service.VaccinService;
import utils.DataSource;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class ListeVaccinController implements Initializable {

    @FXML
    private TableColumn<vaccins, String> nom;
    @FXML
    private TableColumn<vaccins, String> id_pharmacie;
    @FXML
    private TableColumn<vaccins, String> description;
    @FXML
    private TableColumn<vaccins, Double> prix;
    @FXML
    private TableColumn<vaccins, Integer> quantity;
    @FXML
    private Label liste;
    @FXML
    private TableColumn<vaccins, String> img;
    @FXML
    private TableView<vaccins> tableview;
    @FXML
    private Button ajout;
    @FXML
    private Button affiche;
    String query= null ;
    Connection connection= null ;
    PreparedStatement ps = null;
    ResultSet rs=null;
    vaccins vaccins = null;
    ObservableList<vaccins> vaccinList=FXCollections.observableArrayList();
    @FXML
    private TextField filtre;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private TextField textid;
    @FXML
    private TextField textnom;
    
    int index =-1 ;
    ObservableList<vaccins> oblist=FXCollections.observableArrayList();
    private Button reserver;
    @FXML
    private Button reservation;
    private Button stat;
    private Button stat1;
    @FXML
    private Button actualiser;
    @FXML
    private Button retour;
    @FXML
    private Button calendrier;
    @FXML
    private Button calcul;
    
    
    
   
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
      loadDate();
       
//        // TODO
//        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
//        id_pharmacie.setCellValueFactory(new PropertyValueFactory<>("id_pharmacie"));
//        description.setCellValueFactory(new PropertyValueFactory<>("description"));
//        prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
//        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
//        img.setCellValueFactory(new PropertyValueFactory<>("img"));
//        vaccins v = new vaccins ();
//        VaccinService vs = new VaccinService();
//  //   affichervaccin = FXCollections.observableArrayList(vs.affichervaccin());
// //    tableview.setItems(affichervaccin);
        
              ajout.setOnAction((event) -> {
             
          
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
                             calcul.setOnAction(event ->{
        try {
            Parent page3   = FXMLLoader.load(getClass().getResource("/view/calculator.fxml"));
            Scene scene = new Scene(page3 );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            
        }   catch (IOException ex) {
                Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }); 
                            ajout.setOnAction((event) -> {
             
          
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
                                                        ajout.setOnAction((event) -> {
             
          
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
       actualiser.setOnAction((event) -> {
             
          
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
                   
    

   @FXML
  private void getAffiche() throws SQLException {
    vaccinList.clear();
    query="SELECT * FROM vaccins";
       ps=connection.prepareStatement(query);
      rs=ps.executeQuery();
    while(rs.next()) {
         vaccinList.add(new vaccins(rs.getString("id"), rs.getString("nom"),rs.getString("id_pharmacie") , rs.getString("description"), rs.getDouble("prix"), rs.getInt("quantity"), rs.getString("img")));
   
         tableview.setItems(vaccinList);
    }
      
   }

  private void loadDate() {
    connection=DataSource.getInstance().getCnx();
      try {
          getAffiche();
    } catch (SQLException ex) {
        Logger.getLogger(ListeVaccinController.class.getName()).log(Level.SEVERE, null, ex);
   }
   nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
 id_pharmacie.setCellValueFactory(new PropertyValueFactory<>("id_pharmacie"));
  description.setCellValueFactory(new PropertyValueFactory<>("description"));
  prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
 quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
 img.setCellValueFactory(new PropertyValueFactory<>("img"));
 id.setCellValueFactory(new PropertyValueFactory<>("id"));
 

    
 }
  

    @FXML
    private void getselected(MouseEvent event) {
           index = tableview.getSelectionModel().getSelectedIndex();
    if (index <= -1){
    
   }
    textid.setText(id.getCellData(index).toString());

  
   textnom.setText(nom.getCellData(index).toString());
    }

    @FXML
    private void Edit(ActionEvent event) {
          String nom = textnom.getText();
        String id = textid.getText();
           VaccinService pubs=new VaccinService() ;
           pubs.Updatevaccin(id, nom);
           JOptionPane.showMessageDialog(null, "Update");
//            UpdateTable();
    }

    @FXML
    private void delete(ActionEvent event) {
           String id = textid.getText();
           VaccinService pubs=new VaccinService() ;
           pubs.Deletevaccin(id);
           JOptionPane.showMessageDialog(null, "Delete Done");
//            UpdateTable();
    }

  @FXML
  private void readmy(ActionEvent event) {
      tableview.getItems().clear();
    String rch = filtre.getText();    
    VaccinService vs = new VaccinService();
    java.util.ArrayList<vaccins> ml = vs.readmy(rch);
     for(int i=0; i<ml.size();i++ )
      {
  oblist.add(new vaccins(ml.get(i).getId(),ml.get(i).getNom(),ml.get(i).getId_pharmacie(), ml.get(i).getDescription(), ml.get(i).getPrix(),ml.get(i).getQuantity(),ml.get(i).getImg()));
     }
   nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
   id_pharmacie.setCellValueFactory(new PropertyValueFactory<>("id_pharmacie"));
   description.setCellValueFactory(new PropertyValueFactory<>("description"));
  prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
   quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
   img.setCellValueFactory(new PropertyValueFactory<>("img"));
   id.setCellValueFactory(new PropertyValueFactory<>("id"));
     tableview.setItems(oblist);
     
 }

    @FXML
    private void stat(ActionEvent event) throws IOException {
        Parent page1 = FXMLLoader.load(getClass().getResource("/view/statistique.fxml"));
               Scene scene = new Scene(page1);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  stage.setScene(scene);
     stage.show();
    }
   

  
   
}
 
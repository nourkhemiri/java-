/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import entite.panier;
import entite.reservationvacc;
import entite.vaccins;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import service.PanierService;
import service.VaccinService;
import service.reservationvaccService;

/**
 *
 * @author pc doctor
 */
public class Projet extends Application {
    private Stage primaryStage;
    private Parent parentPage;
    @Override
    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("hello word");
        parentPage = FXMLLoader.load(getClass().getResource("/view/acceuil.fxml"));
       Scene scene = new Scene(parentPage);
       this.primaryStage.setScene(scene);
       
        this.primaryStage.show();
    }
 
     public static void main(String[] args) {
        launch(args);
             //singletton
     //   DataSource ds1=DataSource.getInstance();
     //   DataSource ds2=DataSource.getInstance();
     //   DataSource ds3=DataSource.getInstance();
   // vaccins v1=new vaccins("test", "khemiri1234", "test33", 5.2, 8, "mmnh23");
    //VaccinService vs=new VaccinService();
  // vs.ajouterVaccin(v1);
 // vs.readAll().forEach(e->System.out.println(e));
   //    vs.Updatevaccin();
   // vs.Deletevaccin();
  // vs.Recherchervaccin("roua");
 
 //Scanner myReader = new Scanner(System.in);
        
     
   //  System.out.println("chercher a un produit");
   //  String search = myReader.nextLine();
     //   System.out.println(vs.readmy("%"+search+"%"));    
 //vs.Trivaccin().forEach(e->System.out.println(e));
//vs.prixtotal(4);
//vs.prixttc(4);

  // panier p1=new panier("test234", "test123", "test33");
       PanierService ps=new PanierService();
 //ps.ajouterPanier(p1);
 // ps.readAll().forEach(e->System.out.println(e));
    //  ps.Updatepanier();
   // ps.Deletepanier();
   

  //reservationvacc r1=new reservationvacc("reserv1", "mlkjcde123", "lmpmk33");
   reservationvaccService rs=new reservationvaccService();
  // rs.ajouterreservation(r1);
     rs.readAll().forEach(e->System.out.println(e));
   //  rs.Updatereservation();
   rs.Deletereservation();
    }
   

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //singletton
     //   DataSource ds1=DataSource.getInstance();
     //   DataSource ds2=DataSource.getInstance();
     //   DataSource ds3=DataSource.getInstance();
    //   vaccins v1=new vaccins("test", "khemiri12", "test33", 5.2, 8, "mmnh23");
    //  VaccinService vs=new VaccinService();
  //  vs.ajouterVaccin(v1);
  //  vs.readAll().forEach(e->System.out.println(e));
      //  vs.Updatevaccin();
   //   vs.Deletevaccin();
  // vs.Recherchervaccin("roua");
 
 //Scanner myReader = new Scanner(System.in);
        
     
   //  System.out.println("chercher a un produit");
   //  String search = myReader.nextLine();
     //   System.out.println(vs.readmy("%"+search+"%"));    
 //vs.Trivaccin().forEach(e->System.out.println(e));
//vs.prixtotal(4);
//vs.prixttc(4);

  // panier p1=new panier("test2", "test123", "test33");
     //   PanierService ps=new PanierService();
 //ps.ajouterPanier(p1);
 //  ps.readAll().forEach(e->System.out.println(e));
    //  ps.Updatepanier();
   // ps.Deletepanier();
   

 //  reservationvacc r1=new reservationvacc("aaabc2", "mlkjcde123", "lmpmk33");
  //  reservationvaccService rs=new reservationvaccService();
  //  rs.ajouterreservation(r1);
     //rs.readAll().forEach(e->System.out.println(e));
   //  rs.Updatereservation();
  // rs.Deletereservation();
  
    }

  
    


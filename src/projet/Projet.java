/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import entite.vaccins;
import java.sql.SQLException;
import java.util.Scanner;
import service.VaccinService;
import utils.DataSource;

/**
 *
 * @author pc doctor
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //singletton
     //   DataSource ds1=DataSource.getInstance();
     //   DataSource ds2=DataSource.getInstance();
     //   DataSource ds3=DataSource.getInstance();
      //  vaccins v1=new vaccins("nour23", "khemiri", "test33", 5.2, 8, "mmnh23");
        VaccinService vs=new VaccinService();
    //  vs.ajouterVaccin(v1);
    //  vs.readAll().forEach(e->System.out.println(e));
      //  vs.Updatevaccin();
   //   vs.Deletevaccin();
  // vs.Recherchervaccin("roua");
 
 Scanner myReader = new Scanner(System.in);
        
     
       System.out.println("chercher a un produit");
       String search = myReader.nextLine();
        System.out.println(vs.readmy("%"+search+"%"));    
 //vs.Trivaccin().forEach(e->System.out.println(e));
vs.prixtotal(4);
//vs.prixttc(4);

  
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.vaccins;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;

/**
 *
 * @author pc doctor
 */
public class VaccinService {
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection connection;

    public VaccinService() {
        connection=DataSource.getInstance().getCnx();
    }
    
    public void ajouterVaccin(vaccins v){
        String req="insert into vaccins(nom,id_pharmacie,description,prix,quantity,img)values('"+v.getNom()+"','"+v.getId_pharmacie()+"','"+v.getDescription()+"','"+v.getPrix()+"','"+v.getQuantity()+"','"+v.getImg()+"')";
        try {
            ste=connection.createStatement();
            ste.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<vaccins> readAll(){
        String req="select* from vaccins";
        List<vaccins> List=new ArrayList<>();
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            while (rs.next()){
                List.add(new vaccins(rs.getInt("id"), rs.getString("nom"),rs.getString("id_pharmacie") , rs.getString("description"), rs.getDouble("prix"), rs.getInt("quantity"), rs.getString("img")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return List;
    }
public void Updatevaccin(){
      String req="UPDATE vaccins SET nom='roua' WHERE id='2'";
    
      try {
            ste=connection.createStatement();
         int   rs=ste.executeUpdate(req);
            if ( rs >0)
            {
                System.out.println("le vaccin a été bien modifier");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
public void Deletevaccin() {
        
          String req="DELETE From vaccins WHERE nom='roua'";
    
      try {
            ste=connection.createStatement();
         int   rs=ste.executeUpdate(req);
            if ( rs >0)
            {
                System.out.println("le vaccin a été supprimé ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void Recherchervaccin( String nom ) {
        
         String req="SELECT * FROM vaccins WHERE nom ='"+nom+"'";
     
         try {
              ste=connection.createStatement();
              rs=ste.executeQuery(req);
              rs.last();
              int nbrRow= rs.getRow();
              if (nbrRow!=0) {
                System.out.println("le vaccin a été bien trouvé ");  
              }
              else {
                 System.out.println("vaccin non trouvé ! ");    
              }
         }
        catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
}
/* public void Filtrervaccin( String ValToSearch ) {

    List<vaccins> reservationaide = new ArrayList<>();
        
     
         try {
             ste=connection.createStatement();
       ResultSet result = ste.executeQuery("SELECT * FROM vaccins WHERE CONCAT('id','nom', 'id_pharmacie', 'description', 'prix','quantité','img') LIKE '%"+ValToSearch+"%' ");
              
       //       rs=ste.executeQuery(req);
          //    rs.last();
              while(result.next()){
            reservationaide.add(new vaccins(result.getInt(1), result.getString("nom"), result.getString("id_pharmacie"),result.getString("description"),result.getDouble("prix"),result.getInt(2), result.getString("img")));
        }
          //    int nbrRow= rs.getRow();
        //      if (nbrRow!=0) {
        //        System.out.println("le vaccin a été bien trouvé ");  
        //      }
        //      else {
        //         System.out.println("vaccin non trouvé ! ");    
          //    }
         }
        catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
}
*/

        public List<String> readmy(String mychar) {
        List<String> form = new ArrayList<>();
       
          String req="SELECT * FROM `vaccins` WHERE `nom` LIKE '" + mychar + "' ";
        try {
            ste=connection.createStatement();
              rs=ste.executeQuery(req);
               while(rs.next()){
            form.add(rs.getString("nom"));
             form.add(rs.getString("prix"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return form;
    }
        public List<vaccins> Trivaccin()
   {
       String req="SELECT * FROM vaccins\n" +"ORDER BY prix DESC;";
       List<vaccins> list= new ArrayList<>();
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                list.add(new vaccins(rs.getInt("id"), rs.getString("nom"),rs.getString("id_pharmacie") , rs.getString("description"), rs.getDouble("prix"), rs.getInt("quantity"), rs.getString("img")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
          return list;
   }
        
      public void prixtotal(int id)
   {
       String req="SELECT (`prix`+(`prix`*0.19))*`quantity` FROM `vaccins` WHERE id ="+id;
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                System.out.println(rs.getFloat("(`prix`+(`prix`*0.19))*`quantity`"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
         public void prixttc(int id)
   {
       String req="SELECT `prix`+(`prix`*0.19) FROM `vaccins` WHERE id ="+id;
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                System.out.println(rs.getFloat("`prix`+(`prix`*0.19)"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccinService.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

}

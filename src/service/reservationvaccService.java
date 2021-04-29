/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.reservationvacc;
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
public class reservationvaccService {

  private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection connection;

    public reservationvaccService() {
        connection=DataSource.getInstance().getCnx();
    }
    
    public void ajouterreservation(reservationvacc r){
        String req="insert into reservationvacc(nom_vaccin,id_pharmacie,id_patient)values('"+r.getNom_vaccin()+"','"+r.getId_pharmacie()+"','"+r.getId_patient()+"')";
        try {
            ste=connection.createStatement();
            ste.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(reservationvaccService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List<reservationvacc> readAll(){
        String req="select* from reservationvacc";
        List<reservationvacc> List=new ArrayList<>();
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            while (rs.next()){
                List.add(new reservationvacc(rs.getInt("id_vaccin"), rs.getString("nom_vaccin"),rs.getString("id_pharmacie"), rs.getString("id_patient")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservationvaccService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return List;
    }
        public void Updatereservation(){
      String req="UPDATE reservationvacc SET nom_vaccin='roua' WHERE id_pharmacie='test123'";
    
      try {
            ste=connection.createStatement();
         int   rs=ste.executeUpdate(req);
            if ( rs >0)
            {
                System.out.println("la reservation a été bien modifier");
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservationvaccService.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    public void Deletereservation() {
        
          String req="DELETE From reservationvacc WHERE nom_vaccin='reserv1'";
    
      try {
            ste=connection.createStatement();
         int   rs=ste.executeUpdate(req);
            if ( rs >0)
            {
                System.out.println("la reservation a été supprimé ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservationvaccService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    

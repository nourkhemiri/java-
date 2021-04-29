/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Objects;

/**
 *
 * @author pc doctor
 */
public class reservationvacc {
    private int id;
    private String nom_vaccin;
    private String id_pharmacie;
    private String id_patient;

    public reservationvacc(int id, String nom_vaccin, String id_pharmacie, String id_patient) {
        this.id = id;
        this.nom_vaccin = nom_vaccin;
        this.id_pharmacie = id_pharmacie;
        this.id_patient = id_patient;
    }
        public reservationvacc(String nom_vaccin, String id_pharmacie, String id_patient) {
       
        this.nom_vaccin = nom_vaccin;
        this.id_pharmacie = id_pharmacie;
        this.id_patient = id_patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }

    public String getId_pharmacie() {
        return id_pharmacie;
    }

    public void setId_pharmacie(String id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final reservationvacc other = (reservationvacc) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom_vaccin, other.nom_vaccin)) {
            return false;
        }
        if (!Objects.equals(this.id_pharmacie, other.id_pharmacie)) {
            return false;
        }
        if (!Objects.equals(this.id_patient, other.id_patient)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reservationvacc{" + "id=" + id + ", nom_vaccin=" + nom_vaccin + ", id_pharmacie=" + id_pharmacie + ", id_patient=" + id_patient + '}';
    }
    
    
}

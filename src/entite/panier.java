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
public class panier {
    private String id;
    private String id_vaccin;
    private String nom_vaccin;
    private String prix_vaccin;

    public panier(String id, String id_vaccin, String nom_vaccin, String prix_vaccin) {
        this.id = id;
        this.id_vaccin = id_vaccin;
        this.nom_vaccin = nom_vaccin;
        this.prix_vaccin = prix_vaccin;
    }
        public panier( String id_vaccin, String nom_vaccin, String prix_vaccin) {
       
        this.id_vaccin = id_vaccin;
        this.nom_vaccin = nom_vaccin;
        this.prix_vaccin = prix_vaccin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_vaccin() {
        return id_vaccin;
    }

    public void setId_vaccin(String id_vaccin) {
        this.id_vaccin = id_vaccin;
    }

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }

    public String getPrix_vaccin() {
        return prix_vaccin;
    }

    public void setPrix_vaccin(String prix_vaccin) {
        this.prix_vaccin = prix_vaccin;
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
        final panier other = (panier) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.id_vaccin, other.id_vaccin)) {
            return false;
        }
        if (!Objects.equals(this.nom_vaccin, other.nom_vaccin)) {
            return false;
        }
        if (!Objects.equals(this.prix_vaccin, other.prix_vaccin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "panier{" + "id=" + id + ", id_vaccin=" + id_vaccin + ", nom_vaccin=" + nom_vaccin + ", prix_vaccin=" + prix_vaccin + '}';
    }

  
    
    
}

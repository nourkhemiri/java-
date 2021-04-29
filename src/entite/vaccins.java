/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author pc doctor
 */
public class vaccins {
        private String id;
    private String nom;
    private String id_pharmacie;
    private String Description;
    private double prix;
    private int quantity;
    private String img;

    public vaccins() {
    }

    public vaccins(String id, String nom, String id_pharmacie, String Description, double prix, int quantity, String img) {
        this.id = id;
        this.nom = nom;
        this.id_pharmacie = id_pharmacie;
        this.Description = Description;
        this.prix = prix;
        this.quantity = quantity;
        this.img = img;
    }
        public vaccins( String nom, String id_pharmacie, String Description, double prix, int quantity, String img) {
        
        this.nom = nom;
        this.id_pharmacie = id_pharmacie;
        this.Description = Description;
        this.prix = prix;
        this.quantity = quantity;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId_pharmacie() {
        return id_pharmacie;
    }

    public void setId_pharmacie(String id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        final vaccins other = (vaccins) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vaccins{" + "id=" + id + ", nom=" + nom + ", id_pharmacie=" + id_pharmacie + ", Description=" + Description + ", prix=" + prix + ", quantity=" + quantity + ", img=" + img + '}';
    }
    
    
}

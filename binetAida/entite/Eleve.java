/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.entite;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author binetAida
 */
public class Eleve {
   public  String prenom;
    public String nom;
    public Date dateNaissance;
    public String codEleve;
    public String niveau;
    public String nomFiliere;

    public Eleve() {
    }

    public Eleve(String prenom, String nom, Date dateNaissance, String codEtudiant, String niveau, String nomFiliere) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.codEleve = codEleve;
        this.niveau = niveau;
        this.nomFiliere = nomFiliere;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCodEleve() {
        return codEleve;
    }

    public void setCodEleve(String codEleve) {
        this.codEleve = codEleve;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    @Override
    public String toString() {
        return "Eleve{" + "prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", codEleve=" + codEleve + ", niveau=" + niveau + ", nomFiliere=" + nomFiliere + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codEleve);
        return hash;
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
        final Eleve other = (Eleve) obj;
        if (!Objects.equals(this.codEleve, other.codEleve)) {
            return false;
        }
        return true;
    }

   
    }

    
    


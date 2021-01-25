/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.entite;

import java.util.Objects;

/**
 *
 * @author binetAida
 */
public class Filiere {
   public String nomFiliere;
    public Filiere() {
    }

    public Filiere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }
    

    @Override
    public String toString() {
        return "Filiere{" + "nomFiliere=" + nomFiliere + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nomFiliere);
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
        final Filiere other = (Filiere) obj;
        if (!Objects.equals(this.nomFiliere, other.nomFiliere)) {
            return false;
        }
        return true;
    }

    
    
    
}

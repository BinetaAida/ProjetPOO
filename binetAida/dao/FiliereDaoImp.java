/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public class FiliereDaoImp implements IFiliereDao{

    public FiliereDaoImp(){
        
    }
    
    @Override
    public void saveFiliere(Filiere f) {
        String nomFiliere=f.getNomFiliere();
   
        String requete="INSERT INTO filiere(nomFiliere) VALUES('"+nomFiliere+"')";   
        System.out.println("requete="+requete);
        try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void DeleteFiliere(Filiere f) {
    
        String nomFili=f.getNomFiliere();
   
        String requete="DELETE FROM filiere WHERE nomFiliere='"+nomFili+"'";   
        System.out.println("requete="+requete);
        try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifieFiliere(Filiere f, String m) {
        String nomFili=f.getNomFiliere();
   
        String requete="UPDATE filiere SET nomFiliere='"+m+"' WHERE nomFiliere='"+nomFili+"'";   
        System.out.println("requete="+requete);
        try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    @Override
    public List<Filiere> getFiliere() {
        
         List<Filiere> filieres=new ArrayList<>();
         
        try {
            Connection conn=DbUtils.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from filiere");
            while(rs.next()){
        Filiere f=new Filiere();
        String fil=rs.getNString("nomFiliere");
      
        f.nomFiliere=fil;
        filieres.add(f);
        } 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return filieres;
    }
    
}

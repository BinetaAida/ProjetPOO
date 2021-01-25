/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.dao;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import sn.ipsl.bineta.entite.Eleve;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public class EleveDaoImp implements IEleveDao{

     public EleveDaoImp(){
        
    }
    
    @Override
    public void saveEleve(Eleve e) {
        String codEleve=e.getCodEleve();
        String pren=e.getPrenom();
        String nom=e.getNom();
        Date dateNaissance=e.getDateNaissance();
        String dateNaiss=DbUtils.SQL_FORMAT.format(dateNaissance);
        String niveau=e.getNiveau();
        String nomFiliere=e.getNomFiliere();
   
    String requete="INSERT INTO eleve(prenom,nom,dateNaissance,codEleve,niveau,nomFiliere) VALUES('"+pren+"', '"+nom+"', '"+dateNaiss+"', '"+codEleve+"', '"+niveau+"', '"+nomFiliere+"')";   
        System.out.println("requete="+requete);
        try {
            
            Connection conn=DbUtils.getConnection();
            Statement st=conn.createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erreur de syntaxe", "invalide", JOptionPane.ERROR_MESSAGE);
            
        }
    }

   

    @Override
    public List<Eleve> getEleves() {
    
         List<Eleve> eleves=new ArrayList<>();
         
        try {
            Connection conn=DbUtils.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from eleve");
            while(rs.next()){
        Eleve e=new Eleve();
        String id=rs.getString("codEleve");
        String prenom=rs.getNString("prenom");
        String nom=rs.getNString("nom");
        String niv=rs.getNString("niveau");
        String fil=rs.getNString("nomFiliere");
        Date dateNaissance=rs.getDate("dateNaissance");
      
        e.codEleve= id;
        e.nom=nom;
        e.prenom=prenom;
        e.dateNaissance=dateNaissance;
        e.niveau=niv;
        e.nomFiliere=fil;
        eleves.add(e);
        } 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return eleves;
    }

    @Override
    public List<Eleve> getElevesClass(Filiere f, Eleve e) {
        /*String nomFili=f.getNomFiliere();
        String nive=e.getNiveau();*/
        List<Eleve> eleves=new ArrayList<>();
         
        try {
            Connection conn=DbUtils.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from eleve,filiere where eleve.nomFiliere=filiere.nomFiliere and filiere.nomFiliere='"+f.nomFiliere+"' and niveau='"+e.niveau+"'");
            while(rs.next()){
        String id=rs.getString("codEleve");
        String prenom=rs.getNString("prenom");
        String nom=rs.getNString("nom");
        String niv=rs.getNString("niveau");
        String fil=rs.getNString("nomFiliere");
        Date dateNaissance=rs.getDate("dateNaissance");
        Eleve d=new Eleve();
        d.codEleve= id;
        d.nom=nom;
        d.prenom=prenom;
        d.dateNaissance=dateNaissance;
        d.niveau=niv;
        d.nomFiliere=fil;
        eleves.add(d);
        } 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erreur de syntaxe", "invalide", JOptionPane.ERROR_MESSAGE);
        }
        return eleves;
    }

    @Override
    public List<Eleve> getEleves(Filiere f) {
        
        
        List<Eleve> eleves=new ArrayList<>();
         String nomFiliere=f.getNomFiliere();
        try {
            Connection conn=DbUtils.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from eleve where nomFiliere='"+nomFiliere+"'");
            while(rs.next()){
        Eleve e=new Eleve();
        String id=rs.getString("codEleve");
        String prenom=rs.getNString("prenom");
        String nom=rs.getNString("nom");
        String niv=rs.getNString("niveau");
        String fil=rs.getNString("nomFiliere");
        Date dateNaissance=rs.getDate("dateNaissance");
      
        e.codEleve= id;
        e.nom=nom;
        e.prenom=prenom;
        e.dateNaissance=dateNaissance;
        e.niveau=niv;
        e.nomFiliere=fil;
        eleves.add(e);
        } 
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "erreur de syntaxe", "invalide", JOptionPane.ERROR_MESSAGE);
        }
        return eleves;
    }
    

    
    
    
    
}

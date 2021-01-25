/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sn.ipsl.bineta.dao.DbUtils;
import sn.ipsl.bineta.dao.EleveDaoImp;
import sn.ipsl.bineta.dao.IEleveDao;
import sn.ipsl.bineta.entite.Eleve;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public class EleveServiceImp implements IEleveService{
    
    private final IEleveDao eleveDao=new EleveDaoImp();

    @Override
    public void saveEleve(Eleve e) {
        eleveDao.saveEleve(e);
    }

    

    @Override
    public void saveEleve(Set<Eleve> eleves) {
        for (Eleve eleve: eleves){
         eleveDao.saveEleve(eleve);
        }
        }

    

    @Override
    public List<Eleve> getEleves() {
     return eleveDao.getEleves();
    }

    @Override
    public List<Eleve> getElevesClass(Filiere f, Eleve e) {
        return eleveDao.getElevesClass(f,e);
    }

    @Override
    public List<Eleve> getEleves(Filiere f) {
    return eleveDao.getEleves(f);
    }
        
        
    }
    
    
    


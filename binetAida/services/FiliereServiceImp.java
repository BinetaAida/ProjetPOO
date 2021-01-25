/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.services;

import java.util.List;
import java.util.Set;
import sn.ipsl.bineta.dao.FiliereDaoImp;
import sn.ipsl.bineta.dao.IFiliereDao;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public class FiliereServiceImp implements IFiliereService{

    private IFiliereDao filiereDao=new FiliereDaoImp();
    
    @Override
    public void saveFiliere(Filiere f) {
    filiereDao.saveFiliere(f);
    }


    @Override
    public void DeleteFiliere(Filiere f) {
    filiereDao.DeleteFiliere(f);
    }

    @Override
    public void ModifieFiliere(Filiere f, String m) {
    filiereDao.ModifieFiliere(f,m);
    }



    @Override
    public List<Filiere> getFiliere() {
        return filiereDao.getFiliere();
    }
    
}

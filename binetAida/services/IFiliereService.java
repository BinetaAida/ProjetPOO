/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.services;

import java.util.List;
import java.util.Set;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public interface IFiliereService {

public void saveFiliere(Filiere f);
    public List<Filiere> getFiliere();
    public void DeleteFiliere(Filiere f);
    public void ModifieFiliere(Filiere f, String m);
    
}


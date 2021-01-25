/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.services;

import java.util.List;
import java.util.Set;
import sn.ipsl.bineta.entite.Eleve;
import sn.ipsl.bineta.entite.Filiere;

/**
 *
 * @author binetAida
 */
public interface IEleveService {
    
    public void saveEleve(Eleve e);
    public List<Eleve> getEleves();
   public void saveEleve(Set<Eleve> eleves);
   public List<Eleve> getEleves(Filiere f);
    public List<Eleve> getElevesClass(Filiere f, Eleve e);
    
}

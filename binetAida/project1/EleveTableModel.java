/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.project1;

import java.util.List;
import java.util.Set;
import javax.swing.table.AbstractTableModel;
import sn.ipsl.bineta.entite.Eleve;
import sn.ipsl.bineta.services.EleveServiceImp;
import sn.ipsl.bineta.services.IEleveService;

/**
 *
 * @author binetAida
 */
public class EleveTableModel extends AbstractTableModel {
    
    private final List<Eleve> eleves;
    private final String[] entetes = {"Code Eleve", "Prenom", "Nom", "Date Naissance", "Niveau", "Nom Filiere"};
    
    public EleveTableModel() {
        super();
        IEleveService eleveService = new EleveServiceImp();
        eleves = eleveService.getEleves();
    }
    
    @Override
    public int getRowCount() {
        return eleves.size();        
    }
    
    @Override
    public int getColumnCount() {
        return entetes.length;        
    }
    
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Eleve e = eleves.get(rowIndex);
        Object res;
        switch (columnIndex) {
            case 0:
                res = e.getCodEleve();
                break;
            case 1:
                res = e.getPrenom();
                break;
            case 2:
                res = e.getNom();
                break;
            case 3:
                res = e.getDateNaissance();
                break;
            case 4:
                res = e.getNiveau();
                break;
            case 5:
                res = e.getNomFiliere();
                break;
            default:
                res = "pas encore implementer";
            
        }
        return  res;
        
    }
    
}

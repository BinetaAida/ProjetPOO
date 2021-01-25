/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.project1;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ipsl.bineta.entite.Filiere;
import sn.ipsl.bineta.services.FiliereServiceImp;
import sn.ipsl.bineta.services.IFiliereService;

/**
 *
 * @author binetAida
 */
public class FiliereTableModel extends AbstractTableModel {

    private  final List<Filiere> filieres;
    private final String[] entetes = {"Nom Filiere"};

    public FiliereTableModel() {
        IFiliereService filiereService=new FiliereServiceImp();
        filieres=filiereService.getFiliere();
    }
    
    @Override
    public int getRowCount() {
     return filieres.size();
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
    
        Filiere f=filieres.get(rowIndex);
        Object res;
        switch (columnIndex) {
            case 0:
                res = f.getNomFiliere();
                break;
            default:
                res = "pas encore implementer";
            
        }
        return  res;
        
    }
    
}

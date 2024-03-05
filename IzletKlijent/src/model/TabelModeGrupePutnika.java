/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domen.Clan;
import domen.Grupa;
import domen.Putnik;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import kontroler.KlijentKontroler;

/**
 *
 * @author Jovana
 */
public class TabelModeGrupePutnika extends AbstractTableModel {

  
     private ArrayList<Grupa> mojalista=new ArrayList<>();
    private String[] kolone = {"Izlet", "Prevoz", "Vodic", "Datum polaska", "Kapacitet"};
 

    public TabelModeGrupePutnika(Putnik p ) throws Exception {
         mojalista= KlijentKontroler.getInstance().getSveGrupePutnika(p); 
    }
     
    
   
    @Override
    public int getRowCount() {
        
        return mojalista.size();
    
    }

    @Override
    public int getColumnCount() {
       return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     Grupa g = mojalista.get(rowIndex);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        switch (columnIndex) {
            case 0:
                return g.getIzlet().toString();
            case 1:
                return g.getPrevoz();
            case 2:
                return g.getVodic().toString();
            case 3:
                return sdf.format(g.getDatumPolaska());
            case 4:
                return g.getKapacitetGrupe();
           default:
                return "n/a";
            
            
            
            
        }
    }
    
    
    
}

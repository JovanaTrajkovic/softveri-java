/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domen.Clan;
import domen.Grupa;
import domen.Putnik;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import kontroler.KlijentKontroler;

/**
 *
 * @author Jovana
 */
public class TableModelClanovi extends AbstractTableModel {

    private ArrayList<Clan> listaClanova;
    private String[] kolone = {"Rb", "Putnik","Dodatni izleti","Napomena"};
    private int rb = 0;
    private String parametar = "";

    public TableModelClanovi() {
        listaClanova = new ArrayList<>();
    }

    public TableModelClanovi(Grupa g) {
        try {
            listaClanova = KlijentKontroler.getInstance().getSveClanove(g);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return listaClanova.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==2){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); 
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Clan c = listaClanova.get(row);

        switch (column) {
            case 0:
                return c.getRbClana();
            case 1:
                return c.getPutnik();
            case 2:
                return c.isFakultativniIzleti();
            case 3:
                return c.getNapomena();
            default:
                return"n/a";
        }
    }

    public void dodajClana(Clan c) {
        rb = listaClanova.size();
        c.setRbClana(++rb);
        listaClanova.add(c);
        fireTableDataChanged();
    }

    public boolean postojiClan(Putnik p) {
        for (Clan clan : listaClanova) {
            if (clan.getPutnik().getPutnikID().equals(p.getPutnikID())) {
                return true;
            }
        }
        return false;
    }

    public void obrisiClana(int row) {
        listaClanova.remove(row);
        rb = 0;
        for (Clan c : listaClanova) {
            c.setRbClana(++rb);
        }

        fireTableDataChanged();
    }

    public ArrayList<Clan> getLista() {
        return listaClanova;
    }

}

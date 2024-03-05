/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domen.Putnik;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import kontroler.KlijentKontroler;

/**
 *
 * @author Jovana
 */
public class TableModelPutnici  extends AbstractTableModel  implements Runnable{

    private ArrayList<Putnik> listaPutnika;
    private String[] kolone = {"Ime","Prezime", "Email", "Broj telefona"};
    private String parametar = "";

    public TableModelPutnici() {
        try {
            listaPutnika = KlijentKontroler.getInstance().getSvePutnike();
            System.out.println(listaPutnika.get(1).getImePutnika());
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return listaPutnika.size();
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
    public Object getValueAt(int row, int column) {
        Putnik  p = listaPutnika.get(row);

        switch (column) {

            case 0:
                return p.getImePutnika();
            case 1:
                return p.getPrezimePutnika();
            case 2:
                return p.getEmail();
            case 3:
                return p.getBrojTelefona();
            default:
                return "n/a";
        }
    }

    public Putnik getSelectedPolaznik(int row) {
        return listaPutnika.get(row);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(10000);
                refresujTablelu();
            }
        } catch (InterruptedException ex) {
         
           System.out.println("Greska u threadu");
            ex.printStackTrace();
    }
        
    
    }
   
        public void setParametar(String parametar) {
        this.parametar = parametar;
        refresujTablelu();
        } 

    public void refresujTablelu(){
   try {
            listaPutnika = KlijentKontroler.getInstance().getSvePutnike();
            System.out.println(listaPutnika.get(0).toString());
            if (!parametar.equals("")) {
                ArrayList<Putnik> novaLista = new ArrayList<>();
                for (Putnik p:listaPutnika) {
                    if (p.getImePutnika().toLowerCase().contains(parametar.toLowerCase())
                            || p.getPrezimePutnika().toLowerCase().contains(parametar.toLowerCase())) {
                        novaLista.add(p);
                        System.out.println("USLO OVDE");
                    }
                }
                listaPutnika = novaLista;
            }

            fireTableDataChanged();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}


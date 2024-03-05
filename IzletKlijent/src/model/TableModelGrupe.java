/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domen.Grupa;
import domen.Putnik;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import kontroler.KlijentKontroler;

/**
 *
 * @author Jovana
 */
public class TableModelGrupe extends AbstractTableModel implements Runnable{

    private ArrayList<Grupa> listaGrupa;
    private String[] kolone = {"Izlet", "Prevoz", "Vodic", "Datum polaska", "Kapacitet"};
    private String parametar = "";

    public TableModelGrupe() {
        try {
            listaGrupa = KlijentKontroler.getInstance().getSveGrupe();
            System.out.println(listaGrupa.get(0).getIzlet());
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return listaGrupa.size();
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
        Grupa g = listaGrupa.get(row);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        switch (column) {
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

    public Grupa getOdabranaGrupa(int row) {
        return listaGrupa.get(row);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(10000);
                refresujTabelu();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public void setParametar(String parametar) {
        this.parametar = parametar;
        refresujTabelu();
    }

    public void refresujTabelu() {
        try {
            listaGrupa = KlijentKontroler.getInstance().getSveGrupe();
           if (!parametar.equals("")) {
                ArrayList<Grupa> novaLista = new ArrayList<>();
                for (Grupa g : listaGrupa) {
                    if (g.getIzlet().getMesto().getNazivMesta().toLowerCase()
                            .contains(parametar.toLowerCase())) {
                        novaLista.add(g);
                    }
                }
                listaGrupa = novaLista;
            }

            fireTableDataChanged();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Grupa getSelectedGrupa(int row) {
      return listaGrupa.get(row);
    }
}

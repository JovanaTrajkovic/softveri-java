/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jovana
 */
public class Izlet extends OpstiDomenskiObjekat{
    
    private Long izletID;
    private int cena;
    private Mesto mesto;
  public Izlet() {
    }

    public Izlet(Long izletID, int cena, Mesto mesto) {
        this.izletID = izletID;
        this.cena = cena;
        this.mesto = mesto;
    }
     @Override
    public String toString() {
        return mesto.getNazivMesta() + ", cena: " + cena + "dinara";
    }
    @Override
    public String nazivTabele() {
        return " Izlet";
    }

    @Override
    public String alijas() {
         return " i";
    }

    @Override
    public String join() {
         return " JOIN mesto m  ON (m.mestoID= i.mestoID) ";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
       ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            
            Mesto m= new Mesto(rs.getLong("mestoID"),
                    rs.getString("nazivMesta"));
            
            Izlet i = new Izlet(rs.getLong("izletID"), rs.getInt("cena"), m);

            lista.add(i);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
       return "";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " izletID = " + izletID;
    }

    @Override
    public String vrednostiZaInsert() {
      return "";
    }

    @Override
    public String vrednostiZaUpdate() {
         return "";
    }

    @Override
    public String uslov() {
         return "";
    }

    public Long getIzletID() {
        return izletID;
    }

    public void setIzletID(Long izletID) {
        this.izletID = izletID;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
}

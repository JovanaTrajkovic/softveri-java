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
public class Vodic  extends OpstiDomenskiObjekat{
    private Long vodicID;
    private String imeVodica;
    private String prezimeVodica;
    private String brojTelefona;
    private int godineIskustva;

    public Vodic() {
    }

    public Vodic(Long vodicID, String imeVodica, String prezimeVodica, String brojTelefona, int godineIskustva) {
        this.vodicID = vodicID;
        this.imeVodica = imeVodica;
        this.prezimeVodica = prezimeVodica;
        this.brojTelefona = brojTelefona;
        this.godineIskustva = godineIskustva;
    }
    
    
    
      @Override
    public String toString() {
        return imeVodica + " " + prezimeVodica;
    }  
    @Override
    public String nazivTabele() {
       return " vodic ";
    }

    @Override
    public String alijas() {
        return " v ";
    }

    @Override
   public String join() {
        return "";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
     ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Vodic v = new Vodic(rs.getLong("vodicID"),
                    rs.getString("imeVodica"), rs.getString("prezimeVodica"),
                     rs.getString("brojTelefona"),
                    rs.getInt("godineIskustva"));

            lista.add(v);
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
         return " vodicID = " + vodicID;
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

    public Long getVodicID() {
        return vodicID;
    }

    public void setVodicID(Long vodicID) {
        this.vodicID = vodicID;
    }

    public String getImeVodica() {
        return imeVodica;
    }

    public void setImeVodica(String imeVodica) {
        this.imeVodica = imeVodica;
    }

    public String getPrezimeVodica() {
        return prezimeVodica;
    }

    public void setPrezimeVodica(String prezimeVodica) {
        this.prezimeVodica = prezimeVodica;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }
    
}

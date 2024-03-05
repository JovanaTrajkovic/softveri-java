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
public class Putnik extends OpstiDomenskiObjekat{
     private Long putnikID;
    private String imePutnika;
    private String prezimePutnika;
    private String email;
    private String brojTelefona;

    public Putnik() {
    }

    public Putnik(Long putnikID, String imePutnika, String prezimePutnika, String email, String brojTelefona) {
        this.putnikID = putnikID;
        this.imePutnika = imePutnika;
        this.prezimePutnika = prezimePutnika;
        this.email = email;
        this.brojTelefona = brojTelefona;
    }

    

    public String getImePutnika() {
        return imePutnika;
    }

    public void setImePutnika(String imePutnika) {
        this.imePutnika = imePutnika;
    }

    public String getPrezimePutnika() {
        return prezimePutnika;
    }

    public void setPrezimePutnika(String prezimePutnika) {
        this.prezimePutnika = prezimePutnika;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

       @Override
    public String nazivTabele() {
         return " putnik ";
    }

    @Override
    public String alijas() {
         return " p ";
    }

    @Override
    public String join() {
          return "";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
     ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Putnik p = new Putnik(rs.getLong("putnikID"),
                    rs.getString("imePutnika"), rs.getString("prezimePutnika"),
                    rs.getString("email"), rs.getString("brojTelefona"));

            lista.add(p);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (imePutnika, prezimePutnika, email, brojTelefona) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
          return " PutnikID = " +putnikID ;
    }

    @Override
    public String vrednostiZaInsert() {
      return "'" + imePutnika+ "', '" + prezimePutnika + "', "
                + "'" + email + "', '" + brojTelefona+ "'";
    }

    @Override
    public String vrednostiZaUpdate() {
    return " prezimePutnika = '" + prezimePutnika + "', email = '" + email + "', brojTelefona = '" + brojTelefona + "' ";
    }
 
    @Override
    public String uslov() {
       return "";
    }

    public Long getPutnikID() {
        return putnikID;
    }

    public void setPutnikID(Long putnikID) {
        this.putnikID = putnikID;
    }

    @Override
    public String toString() {
        return imePutnika+", "+prezimePutnika;
    }
    
    
}

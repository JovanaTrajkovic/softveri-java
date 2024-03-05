/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.grupa;

import db.DBBroker;
import domen.Clan;
import domen.Grupa;
import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import java.util.Date;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Jovana
 */
public class SOIzmeniGrupu  extends OpstaSistemskaOperacija{
    
    

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
         if (!(odo instanceof Grupa)) {
            throw new Exception("Prosledjeni objekat nije instanca klase Grupa!");
        }
              Grupa g = (Grupa) odo;

 }

    @Override
    protected void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
    DBBroker.getInstance().update(odo);

       
        Grupa g = (Grupa) odo;
        Clan c= new Clan();
        c.setGrupa(g);
        DBBroker.getInstance().delete(c);
        
        for (Clan clan : g.getClanovi()) {
            DBBroker.getInstance().insert(clan);
        }
    }

}

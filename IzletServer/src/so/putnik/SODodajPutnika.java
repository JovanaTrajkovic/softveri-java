/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.putnik;

import db.DBBroker;
import domen.OpstiDomenskiObjekat;
import domen.Putnik;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Jovana
 */
public class SODodajPutnika extends OpstaSistemskaOperacija{

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Putnik)) {
            throw new Exception("Prosledjeni objekat nije instanca klase Putnik");
        }

       Putnik p= (Putnik) odo;
       
      ArrayList<Putnik> putnici = (ArrayList<Putnik>) (ArrayList<?>) DBBroker.getInstance().select(new Putnik());

        for (Putnik putnik : putnici) {
            if(putnik.getEmail().equals(p.getEmail())){
                 throw new Exception("Vec postoji putnik sa datim email-om");
            }

    }
    }

    @Override
    protected void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
         DBBroker.getInstance().insert(odo);
    }
    
}

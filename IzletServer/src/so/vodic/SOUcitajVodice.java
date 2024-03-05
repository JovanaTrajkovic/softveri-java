/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.vodic;

import db.DBBroker;
import domen.OpstiDomenskiObjekat;
import domen.Vodic;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Jovana
 */
public class SOUcitajVodice  extends OpstaSistemskaOperacija{
    private ArrayList<Vodic> vodici;
    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
         if (!(odo instanceof Vodic)) {
            throw new Exception("Prosledjeni objekat nije instanca klase Vodic!");
        }
    }

    @Override
    protected void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        ArrayList<OpstiDomenskiObjekat> lista=DBBroker.getInstance().select(odo);
        vodici=(ArrayList<Vodic>) (ArrayList<?>)lista;
    }
    
    public ArrayList<Vodic> getLista(){
        return vodici;
    }
            
    
}

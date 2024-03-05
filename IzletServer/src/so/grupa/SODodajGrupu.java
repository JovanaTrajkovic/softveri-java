/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.grupa;

import db.DBBroker;
import domen.Clan;
import domen.Grupa;
import domen.OpstiDomenskiObjekat;
import domen.Putnik;
import so.OpstaSistemskaOperacija;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jovana
 */
public class SODodajGrupu extends OpstaSistemskaOperacija{

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
      if (!(odo instanceof Grupa)) {
            throw new Exception("Prosledjeni objekat nije instanca klase Grupa!");
        }
       Grupa g = (Grupa) odo;
       
      ArrayList<Grupa> grupe= (ArrayList<Grupa>) (ArrayList<?>) DBBroker.getInstance().select(new Grupa());

        for (Grupa gr:grupe) {
            if(gr.getDatumPolaska().compareTo(g.getDatumPolaska())==0 &&  
                    gr.getPrevoz().equals(g.getPrevoz())  && 
                    gr.getIzlet().getMesto().getNazivMesta().equals(g.getIzlet().getMesto().getNazivMesta())){
                 throw new Exception("Vec postoji grupa za izlet sa istim datumom i istim prevozom");
            }

    }
     
    }
      
    @Override
    protected void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
       PreparedStatement ps = DBBroker.getInstance().insert(odo);

       
        ResultSet rsID= ps.getGeneratedKeys();
        rsID.next();
        Long grupaID =rsID.getLong(1);

       
        Grupa g = (Grupa) odo;
        g.setGrupaID(grupaID);

        
        for (Clan  clan :g.getClanovi()) {
             clan.setGrupa(g);
              DBBroker.getInstance().insert(clan);
        }
 
    }
    
    
}

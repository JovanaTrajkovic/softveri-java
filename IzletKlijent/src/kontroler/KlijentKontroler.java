/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontroler;

import domen.Administrator;
import domen.Clan;
import domen.Grupa;
import domen.Izlet;
import domen.Mesto;
import domen.Putnik;
import domen.Vodic;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sesija.Sesija;
import transfer.Odgovor;
import transfer.Zahtev;
import transfer.util.Operacije;
import transfer.util.StatusOdgovora;

/**
 *
 * @author Jovana
 */
public class KlijentKontroler {
    private static KlijentKontroler instance;

    private KlijentKontroler() {
    }

    public static KlijentKontroler getInstance() {
        if (instance == null) {
            instance = new KlijentKontroler();
        }
        return instance;
    }

    public Administrator login(Administrator administrator) throws Exception {
        return (Administrator) posaljiZahtev(Operacije.Login,administrator);
    }

    public void dodajGrupu(Grupa grupa) throws Exception {
        posaljiZahtev(Operacije.dodajGrupu,grupa);
    }

    public void dodajPutnika(Putnik putnik) throws Exception {
        posaljiZahtev(Operacije.dodajPutnika, putnik);
    }
    

    public void obrisiGrupu(Grupa grupa) throws Exception {
        posaljiZahtev(Operacije.obrisiGrupu, grupa);
    }

    public void obrisiPutnika(Putnik putnik) throws Exception {
        posaljiZahtev(Operacije.obrisiPutnika, putnik);
    }
    

    public void izmeniGrupu(Grupa grupa) throws Exception {
        posaljiZahtev(Operacije.izmeniGrupu, grupa);
    }

    public void izmeniPutnika(Putnik putnik) throws Exception {
        posaljiZahtev(Operacije.izmeniPutnika, putnik);
    }
    

    public ArrayList<Administrator> getSveAdministratore() throws Exception {
        return (ArrayList<Administrator>)  posaljiZahtev(Operacije.vratiSveAdministratore, null);
    }

    public ArrayList<Grupa> getSveGrupe() throws Exception {
        return (ArrayList<Grupa>) posaljiZahtev(Operacije.vratiSveGrupe,null);
    }

    public ArrayList<Putnik> getSvePutnike() throws Exception {
        return (ArrayList<Putnik>) posaljiZahtev(Operacije.vratiSvePutnike,null);
    }

    public ArrayList<Mesto> getSvaMesta() throws Exception {
        return (ArrayList<Mesto>) posaljiZahtev(Operacije.vratiSvaMesta,null);
    }

    public ArrayList<Izlet> getSveIzlete() throws Exception {
        return (ArrayList<Izlet>) posaljiZahtev(Operacije.vratiSveIzlete,null);
    }

    public ArrayList<Vodic> getSveVodice() throws Exception {
        return (ArrayList<Vodic>) posaljiZahtev(Operacije.vratiSveVodice,null);
    }

    public ArrayList<Clan> getSveClanove(Grupa g) throws Exception {
        return (ArrayList<Clan>) posaljiZahtev(Operacije.vratiSveClanove,g);
    }

    private Object posaljiZahtev(int operacija, Object parametar) throws Exception {
        Zahtev zahtev = new Zahtev(operacija, parametar);

        ObjectOutputStream out = new ObjectOutputStream(Sesija.getInstance().getSocket().getOutputStream());
        out.writeObject(zahtev);

        ObjectInputStream  ois= new ObjectInputStream(Sesija.getInstance().getSocket().getInputStream());
        Odgovor odgovor = (Odgovor) ois.readObject();

        if (odgovor.getStatusOdgvora().equals(StatusOdgovora.Error)) {
            throw odgovor.getException();
        } else {
            return odgovor.getOdgovor();
        }

    }

    public ArrayList<Grupa> getSveGrupePutnika(Putnik p) throws Exception {
        
       return (ArrayList<Grupa>) posaljiZahtev(Operacije.GETSveGrupePutnika,p);
        
    }
}

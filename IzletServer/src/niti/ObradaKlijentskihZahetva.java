/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import domen.Administrator;
import domen.Grupa;
import domen.Putnik;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import kontroler.ServerKontroler;
import transfer.Odgovor;
import transfer.Zahtev;
import transfer.util.Operacije;
import transfer.util.StatusOdgovora;

/**
 *
 * @author Jovana
 */
public class ObradaKlijentskihZahetva extends Thread {

    private Socket socket;

    ObradaKlijentskihZahetva(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (!socket.isClosed()) {
                 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Zahtev zahtev =  (Zahtev) ois.readObject();
                Odgovor odgovor = obradiZahtev(zahtev);
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(odgovor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Odgovor obradiZahtev(Zahtev zahtev) {
     Odgovor odgovor = new Odgovor(null, null, StatusOdgovora.Success);
        try {
            switch (zahtev.getOperacija()) {
                case Operacije.Login:
                    Administrator administrator = (Administrator) zahtev.getParametar();
                    Administrator ulogovani = ServerKontroler.getInstance().login(administrator);
                    odgovor.setOdgovor(ulogovani);
                    break;
                case Operacije.dodajPutnika:
                    ServerKontroler.getInstance().dodajPutnik((Putnik) zahtev.getParametar());
                    break;
                case Operacije.izmeniPutnika:
                    ServerKontroler.getInstance().updatePutnik((Putnik) zahtev.getParametar());
                    break;
                case Operacije.obrisiPutnika:
                    ServerKontroler.getInstance().deletePutnik((Putnik) zahtev.getParametar());
                    break;
                case Operacije.vratiSvePutnike:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSvePutnike());
                    break;

                case Operacije.vratiSvaMesta:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSvaMesta());
                    break;
                case Operacije.vratiSveIzlete:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSveIzlete());
                    break;
                case Operacije.vratiSveVodice:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSveVodice());
                    break;

                case Operacije.dodajGrupu:
                    ServerKontroler.getInstance().dodajGrupa((Grupa) zahtev.getParametar());
                    break;
                case Operacije.izmeniGrupu:
                    ServerKontroler.getInstance().updateGrupa((Grupa) zahtev.getParametar());
                    break;
                case Operacije.obrisiGrupu:
                    ServerKontroler.getInstance().deleteGrupa((Grupa) zahtev.getParametar());
                    break;
                case Operacije.vratiSveGrupe:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSveGrupe());
                    break;

                case Operacije.vratiSveClanove:
                    odgovor.setOdgovor(ServerKontroler.getInstance().getSveClanove((Grupa) zahtev.getParametar()));
                    break;
                    case Operacije.GETSveGrupePutnika:
                   odgovor.setOdgovor(ServerKontroler.getInstance().getSveGrupePutnika((Putnik) zahtev.getParametar()));
                    break;

                default:
                    return null;
            }
        } catch (Exception e) {
            odgovor.setStatusOdgvora(StatusOdgovora.Error);
            odgovor.setException(e);
        }
        return  odgovor;
    }

    

}
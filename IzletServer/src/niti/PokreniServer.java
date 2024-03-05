/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jovana
 */
public class PokreniServer extends Thread {

   private ServerSocket serverSoket;

    public PokreniServer() {
        try {
            serverSoket = new ServerSocket(9000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 @Override
    public void run() {
        try {
            while (!serverSoket.isClosed()) {
                System.out.println("Cekanje klijenta...");
                Socket soket = serverSoket.accept();
                System.out.println("Klijent se povezao!");
                ObradaKlijentskihZahetva th = new ObradaKlijentskihZahetva(soket);
                th.start();
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    public ServerSocket getServerSocket() {
        return serverSoket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSoket = serverSocket;
    }

}

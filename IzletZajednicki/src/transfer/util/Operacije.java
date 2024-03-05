/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transfer.util;

/**
 *
 * @author Jovana
 */
public interface Operacije {
    public static final int Login = 0;

    public static final int vratiSveAdministratore = 1;

    
     public static final int dodajPutnika = 2;
    public static final int obrisiPutnika = 3;
    public static final int izmeniPutnika=4;
    public static final int vratiSvePutnike = 5;
    
    public static final int dodajGrupu= 6;
    public static final int obrisiGrupu = 7;
    public static final int izmeniGrupu = 8;
    public static final int vratiSveGrupe = 9;

    public static final int vratiSveClanove = 10;

    public static final int vratiSvaMesta = 11;

    public static final int vratiSveIzlete= 12;

    public static final int vratiSveVodice= 13;
      public static final int GETSveGrupePutnika = 18;
   
    public static final int DELETE_KOMPONENTA = 15;
    public static final int UPDATE_KOMPONENTA= 16;
    public static final int GET_ALL_KOMPONENTA = 17;
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Jovana
 */
public class Zahtev implements Serializable{
    private int operacija;
    private Object parametar;

    public Zahtev() {
    }

    public Zahtev(int operacija, Object parametar) {
        this.operacija = operacija;
        this.parametar = parametar;
    }

    public int getOperacija() {
        return operacija;
    }

    public Object getParametar() {
        return parametar;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public void setParametar(Object parametar) {
        this.parametar = parametar;
    }
    
}

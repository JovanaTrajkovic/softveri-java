/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;
import transfer.util.StatusOdgovora;

/**
 *
 * @author Jovana
 */
public class Odgovor implements Serializable{
    private Object odgovor;
    private Exception exception;
     private StatusOdgovora statusOdgvora;

    public Odgovor() {
    }

    public Odgovor(Object odgovor, Exception exception, StatusOdgovora statusOdgvora) {
        this.odgovor = odgovor;
        this.exception = exception;
        this.statusOdgvora = statusOdgvora;
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public StatusOdgovora getStatusOdgvora() {
        return statusOdgvora;
    }

    public void setStatusOdgvora(StatusOdgovora statusOdgvora) {
        this.statusOdgvora = statusOdgvora;
    }
     
}

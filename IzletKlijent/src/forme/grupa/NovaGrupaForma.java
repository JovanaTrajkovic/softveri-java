/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme.grupa;

import domen.Administrator;
import domen.Clan;
import domen.Grupa;
import domen.Izlet;
import domen.Putnik;
import domen.Vodic;
import forme.GlavnaForma;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.KlijentKontroler;
import model.TableModelClanovi;
import model.TableModelGrupe;

/**
 *
 * @author Jovana
 */
public class NovaGrupaForma extends javax.swing.JDialog {
Administrator a;
    /**
     * Creates new form DetaljiGrupa
     */
    public NovaGrupaForma(java.awt.Frame parent, boolean modal,Administrator a) {
        super(parent, modal);
        initComponents();
        this.a=a;
        popuniIzlete();
        popuniVodice();
        popuniPutnike();
        tblClanovi.setModel(new TableModelClanovi());
        setTitle("Dodavanje nove grupe");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDatumPolaska = new javax.swing.JTextField();
        txtKAPACITET = new javax.swing.JTextField();
        cmbVodic = new javax.swing.JComboBox<>();
        cmbPrevoz = new javax.swing.JComboBox<>();
        cmbIzlet = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbPutnik = new javax.swing.JComboBox<>();
        cbFakulativno = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNapomena = new javax.swing.JTextArea();
        btnDodajClana = new javax.swing.JButton();
        btnObrisiClana = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClanovi = new javax.swing.JTable();
        btnSacuvaj = new javax.swing.JButton();
        btnOtkazi1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Izlet");

        jLabel2.setText("Vodic");

        jLabel3.setText("Prevoz");

        jLabel4.setText("Datum polaska");

        jLabel5.setText("Kapacitet");

        txtDatumPolaska.setText("1.9.2029");

        txtKAPACITET.setText("60");

        cmbVodic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPrevoz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bus1", "Bus2", "Bus3", " " }));

        cmbIzlet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Putnik");

        jLabel7.setText("Dodatni izleti");

        jLabel8.setText("Napomena");

        cmbPutnik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNapomena.setColumns(20);
        txtNapomena.setRows(5);
        jScrollPane1.setViewportView(txtNapomena);

        btnDodajClana.setText("Dodaj clana grupe");
        btnDodajClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajClanaActionPerformed(evt);
            }
        });

        btnObrisiClana.setText("Obrisi clana grupe");
        btnObrisiClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiClanaActionPerformed(evt);
            }
        });

        tblClanovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblClanovi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFakulativno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPutnik, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDodajClana, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnObrisiClana, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPutnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbFakulativno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajClana)
                    .addComponent(btnObrisiClana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnSacuvaj.setText("Sacuvaj grupu");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        btnOtkazi1.setText("Otkazi");
        btnOtkazi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkazi1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Clanovi grupe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(615, 615, 615))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbVodic, 0, 298, Short.MAX_VALUE)
                            .addComponent(cmbPrevoz, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbIzlet, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDatumPolaska)
                            .addComponent(txtKAPACITET))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOtkazi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbIzlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPrevoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbVodic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDatumPolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtkazi1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKAPACITET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacuvaj)))
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        
    try {
        if (txtKAPACITET.getText().isEmpty() || txtDatumPolaska.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira novu grupu!");
            return;
        }
        
        

      
        int kapacitetGrupe = Integer.parseInt(txtKAPACITET.getText());
        if (kapacitetGrupe < 15 || kapacitetGrupe> 60) {
           JOptionPane.showMessageDialog(this, "Kapacitet grupe moze biti izmedju 15 i 60!");
           return;
    }   
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date datumPolaska = sdf.parse(txtDatumPolaska.getText());
        
        if (datumPolaska.before(new java.util.Date())) {
            JOptionPane.showMessageDialog(this, "Datum polaska mora biti posle danasnjeg datuma!");
            return;
        }
        
        Izlet i = (Izlet) cmbIzlet.getSelectedItem();
        Vodic vodic = (Vodic) cmbVodic.getSelectedItem();
        String prevoz= (String) cmbPrevoz.getSelectedItem();
        
        TableModelClanovi tm = (TableModelClanovi) tblClanovi.getModel();
       
        Grupa grupa = new Grupa(null, datumPolaska,kapacitetGrupe,
                prevoz, i, vodic, a, tm.getLista());
        
        KlijentKontroler.getInstance().dodajGrupu(grupa);
        GlavnaForma gf= (GlavnaForma) getParent();
        gf.refresujTabelu();
        resetujFormu();
        JOptionPane.showMessageDialog(this, "Uspesno sacuvana grupa!");
    } catch (ParseException ex) {
        Logger.getLogger(NovaGrupaForma.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
       JOptionPane.showMessageDialog(this, ex.getMessage());
    }
            
        
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void btnDodajClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajClanaActionPerformed
      Putnik p = (Putnik) cmbPutnik.getSelectedItem();
        String napomena = txtNapomena.getText();
        Boolean fakulativno= cbFakulativno.isSelected();

        if (napomena.isEmpty()) {
            napomena = "Nema";
        }

        Clan c = new Clan(null, -1, napomena, fakulativno,p);

        TableModelClanovi tm = (TableModelClanovi) tblClanovi.getModel();

        if (tm.postojiClan(p)) {
            JOptionPane.showMessageDialog(this, "Vec ste uneli ovog putnika za  ovu grupu!");
            return;
        }

        tm.dodajClana(c);
    }//GEN-LAST:event_btnDodajClanaActionPerformed

    private void btnOtkazi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkazi1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkazi1ActionPerformed

    private void btnObrisiClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiClanaActionPerformed
       int row = tblClanovi.getSelectedRow();

        if (row >= 0) {
            TableModelClanovi tm = (TableModelClanovi) tblClanovi.getModel();
            tm.obrisiClana(row);
        }
        else {
            JOptionPane.showMessageDialog(this, "Izaberite red!");
        }
    }//GEN-LAST:event_btnObrisiClanaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajClana;
    private javax.swing.JButton btnObrisiClana;
    private javax.swing.JButton btnOtkazi1;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JCheckBox cbFakulativno;
    private javax.swing.JComboBox<Object> cmbIzlet;
    private javax.swing.JComboBox<String> cmbPrevoz;
    private javax.swing.JComboBox<Object> cmbPutnik;
    private javax.swing.JComboBox<Object> cmbVodic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClanovi;
    private javax.swing.JTextField txtDatumPolaska;
    private javax.swing.JTextField txtKAPACITET;
    private javax.swing.JTextArea txtNapomena;
    // End of variables declaration//GEN-END:variables

    private void popuniIzlete() {
        try {
            ArrayList<Izlet> izleti= KlijentKontroler.getInstance().getSveIzlete();
            
            cmbIzlet.removeAllItems();

            for (Izlet izlet:izleti) {
                cmbIzlet.addItem(izlet);
            }
        } catch (Exception ex) {
            Logger.getLogger(NovaGrupaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniVodice() {
        try {
            ArrayList<Vodic> vodici= KlijentKontroler.getInstance().getSveVodice();
            
            cmbVodic.removeAllItems();

            for (Vodic v: vodici) {
                cmbVodic.addItem(v);
            }
        } catch (Exception ex) {
            Logger.getLogger(NovaGrupaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniPutnike() {
     
        try {
            ArrayList<Putnik> putnici = KlijentKontroler.getInstance().getSvePutnike();

            cmbPutnik.removeAllItems();

            for (Putnik putnik : putnici) {
                cmbPutnik.addItem(putnik);
            }
        } catch (Exception ex) {
            Logger.getLogger(NovaGrupaForma.class.getName()).log(Level.SEVERE, null, ex);
        }

        
}

    private void resetujFormu() {
          txtDatumPolaska.setText("");
         txtKAPACITET.setText("");
         tblClanovi.setModel(new TableModelClanovi());
          
    }
}
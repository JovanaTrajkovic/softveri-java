/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme.putnik;

import domen.Putnik;
import forme.GlavnaForma;
import javax.swing.JOptionPane;
import model.TableModelPutnici;

/**
 *
 * @author Jovana
 */
public class PretragaPutnikaForma extends javax.swing.JDialog {

    /**
     * Creates new form PretragaPutnikaForma
     */
    public PretragaPutnikaForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        TableModelPutnici tm = new TableModelPutnici();
       Thread thread = new Thread(tm);
       thread.start();
        tblPutnici.setModel(tm);
        setTitle("Pretraga putnika");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPretraga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPutnici = new javax.swing.JTable();
        btnDetalji = new javax.swing.JButton();
        btnIzadji = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Unesite ime ili prezime putnika");

        txtPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPretragaActionPerformed(evt);
            }
        });
        txtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretragaKeyReleased(evt);
            }
        });

        tblPutnici.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPutnici);

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        btnIzadji.setText("Izadji");
        btnIzadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzadjiActionPerformed(evt);
            }
        });

        jButton1.setText(" Vrati Sve Grupe izabranog putnika");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(244, 244, 244)
                            .addComponent(txtPretraga))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(67, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(319, 319, 319))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnIzadji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalji)
                    .addComponent(btnIzadji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
    int izabranRed= tblPutnici.getSelectedRow();

        if(izabranRed<0){
            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita putnike");
            return;
        }
        
        if (izabranRed>= 0) {
            JOptionPane.showMessageDialog(this, "Uspesno ucitan putnik");
            Putnik p = ((TableModelPutnici) tblPutnici.getModel()).getSelectedPolaznik(izabranRed);
           /// kao root dajemo JDIjalog
            new DetaljiPutnikaForma(this, rootPaneCheckingEnabled, p).setVisible(true);
        }
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void btnIzadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzadjiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIzadjiActionPerformed

    private void txtPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPretragaActionPerformed
       String param = txtPretraga.getText();
        //kada se setuje parametar odmah se i refreshuje tablea,tj stavi nova lista putnika po kriterijumu 
        ((TableModelPutnici) tblPutnici.getModel()).setParametar(param);
   
    }//GEN-LAST:event_txtPretragaActionPerformed

    private void txtPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyReleased
       String param = txtPretraga.getText();
        //kada se setuje parametar odmah se i refreshuje tablea,tj stavi nova lista putnika po kriterijumu 
        ((TableModelPutnici) tblPutnici.getModel()).setParametar(param);
    }//GEN-LAST:event_txtPretragaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      int izabranRed= tblPutnici.getSelectedRow();

        if(izabranRed<0){
            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita putnike");
            return;
        }
        
        if (izabranRed>= 0) {
            JOptionPane.showMessageDialog(this, "Uspesno ucitan putnik");
            Putnik p = ((TableModelPutnici) tblPutnici.getModel()).getSelectedPolaznik(izabranRed);
           /// kao root dajemo JDIjalog
            new DetaljiPutnikaSaFrupom(this, rootPaneCheckingEnabled, p).setVisible(true);
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

                                    

 ////////////kada se obrise putnik iz forme detalji ili se izmeni u ovoj formi Pretraga se iscrtava nova tabela
     void refresujTabelu() {
        TableModelPutnici tm = (TableModelPutnici) tblPutnici.getModel();
        tm.refresujTablelu();
    }
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JButton btnIzadji;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPutnici;
    private javax.swing.JTextField txtPretraga;
    // End of variables declaration//GEN-END:variables

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uncuyo.dbproyect.OLDgui;
import javax.swing.JOptionPane;
/**
 *
 * @author Martín
 */
public class Report extends javax.swing.JPanel {
    Report_imp imp = new Report_imp();
    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PreView_bttn = new javax.swing.JButton();
        RPath_txf = new javax.swing.JTextField();
        Generate_bttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RText_txf = new javax.swing.JTextArea();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Report");

        PreView_bttn.setText("PreView");
        PreView_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreView_bttnActionPerformed(evt);
            }
        });

        RPath_txf.setText("C:\\Users\\Martín\\Desktop\\Ciencias en Computación\\report.pdf");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RPath_txf, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PreView_bttn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreView_bttn)
                    .addComponent(jLabel1)
                    .addComponent(RPath_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        Generate_bttn.setText("Generate Report");
        Generate_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_bttnActionPerformed(evt);
            }
        });
        add(Generate_bttn, java.awt.BorderLayout.PAGE_END);

        RText_txf.setColumns(20);
        RText_txf.setRows(5);
        RText_txf.setText("Cantidad de alumnos:\nCantidad de Docentes:\nCantidad de Numeros de Telefono\nCantidad de Mails:\nCantidad de alumnos por Provincia:\nCantidadd de alumnos Agentes con obra social:\nCantidad sin obra social:\n");
        jScrollPane1.setViewportView(RText_txf);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void Generate_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_bttnActionPerformed
        // TODO add your handling code here:
        String report;
        try{
            report = imp.getAgentsReport();
            imp.SaveReport(report,RPath_txf.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(jDialog1, e.getMessage());
        }
    }//GEN-LAST:event_Generate_bttnActionPerformed

    private void PreView_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreView_bttnActionPerformed
        // TODO add your handling code here:
        try{
            String report = imp.getAgentsReport();
            RText_txf.setText(report);
        }catch(Exception e){
            JOptionPane.showMessageDialog(jDialog1, e.getMessage());
        }
    }//GEN-LAST:event_PreView_bttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generate_bttn;
    private javax.swing.JButton PreView_bttn;
    private javax.swing.JTextField RPath_txf;
    private javax.swing.JTextArea RText_txf;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

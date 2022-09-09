/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uncuyo.dbproyect.gui;
import javax.swing.JOptionPane;
/*
 *
 * @author Martín
 */
public class CreatePanel extends javax.swing.JFrame {
    AgentsCUD_imp imp = new AgentsCUD_imp();
    /**
     * Creates new form NewJFrame
     */
    public CreatePanel(){
        initComponents();
        CRole_txf.setEnabled(false);
        CName_txf.setEnabled(false);
        CLastName_txf.setEnabled(false);
        CBornDate_formatted.setEnabled(false);
        CCountry_Box.setEnabled(false);
        CCountry_List.setEnabled(false);
        CCountry_txf.setEnabled(false);
        CState_Box.setEnabled(false);
        CState_List.setEnabled(false);
        CState_txf.setEnabled(false);
        CZone_Box.setEnabled(false);
        CZone_List.setEnabled(false);
        CZone_txf.setEnabled(false);
        CStreet_txf.setEnabled(false);
        CNumber_txf.setEnabled(false);
        CHealthEnsurance_txf.setEnabled(false);
        CEmergencyPhone_formatted.setEnabled(false);
        CMail_formatted.setEnabled(false);
        CPhoneNumber_formatted.setEnabled(false);
        CRole_List.setEnabled(false);
        CRole_Box.setEnabled(false);
        imp.SetRoleComboBoxModel(CRole_List);
        imp.SetCountryComboBoxModel(CCountry_List);
        imp.SetStateComboBoxModel(CState_List);
        imp.SetZoneComboBoxModel(CZone_List);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        CZone_List = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CState_List = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CCountry_List = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CCountry_Box = new javax.swing.JCheckBox();
        CZone_Box = new javax.swing.JCheckBox();
        CState_Box = new javax.swing.JCheckBox();
        CCountry_txf = new javax.swing.JTextField();
        CState_txf = new javax.swing.JTextField();
        CZone_txf = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CStreet_txf = new javax.swing.JTextField();
        CNumber_txf = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        CHealthEnsurance_txf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CEmergencyPhone_formatted = new javax.swing.JFormattedTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CMail_formatted = new javax.swing.JFormattedTextField();
        CPhoneNumber_formatted = new javax.swing.JFormattedTextField();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        Create_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CName_txf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CBornDate_formatted = new javax.swing.JFormattedTextField();
        CNationalNumber_formatted = new javax.swing.JFormattedTextField();
        CLastName_txf = new javax.swing.JTextField();
        NameEnable_box = new javax.swing.JCheckBox();
        LastNameEnable_Box = new javax.swing.JCheckBox();
        BornEnable_Box = new javax.swing.JCheckBox();
        CStatus_txf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CRole_Box = new javax.swing.JCheckBox();
        CRole_txf = new javax.swing.JTextField();
        CRole_List = new javax.swing.JComboBox<>();
        AddressEnable_Box = new javax.swing.JCheckBox();
        RoleEnable_Box = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CZone_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Godoy Cruz" }));

        jLabel7.setText("Zone:");

        CState_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mendoza" }));

        jLabel6.setText("State:");

        CCountry_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina" }));

        jLabel5.setText("Country:");

        CCountry_Box.setText("new Country");
        CCountry_Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CCountry_BoxMousePressed(evt);
            }
        });

        CZone_Box.setText("new Zone");
        CZone_Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CZone_BoxMousePressed(evt);
            }
        });

        CState_Box.setText("new State");
        CState_Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CState_BoxMousePressed(evt);
            }
        });

        CCountry_txf.setText("No Country");

        CState_txf.setText("No State");

        CZone_txf.setText("No Zone");

        jLabel10.setText("Live on Street:");

        CStreet_txf.setText("No Street");

        CNumber_txf.setText("0000");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CStreet_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CNumber_txf)
                .addGap(102, 102, 102))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jCheckBox6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CStreet_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNumber_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addComponent(jCheckBox6)
                .addContainerGap())
        );

        CHealthEnsurance_txf.setText("No Health Ensurance");

        jLabel12.setText("Emergency Phone Number");

        jLabel11.setText("Health Ensurance Name");

        CEmergencyPhone_formatted.setText("+261 9 555 9999");

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CHealthEnsurance_txf)
                    .addComponent(CEmergencyPhone_formatted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(CHealthEnsurance_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(CEmergencyPhone_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox8))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel13.setText("Phone number:");

        jLabel14.setText("Mail");

        CMail_formatted.setText("noMail@gmail.com");

        CPhoneNumber_formatted.setText("+261 5 555 9999");

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CPhoneNumber_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(CMail_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(CPhoneNumber_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CMail_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jCheckBox10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CCountry_Box))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CCountry_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CCountry_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CState_Box))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CState_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CState_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CZone_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CZone_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CZone_Box)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(CCountry_Box)
                    .addComponent(CZone_Box)
                    .addComponent(CState_Box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCountry_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CState_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CZone_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCountry_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CState_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CZone_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Create_btn.setText("Register new Agent");
        Create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Create a new Agent:");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Last Name:");

        jLabel19.setText("Born Date:");

        jLabel20.setText("National ID:");

        CName_txf.setText("No Name");

        jLabel21.setText("Name:");

        CBornDate_formatted.setText("01/01/9999");

        CNationalNumber_formatted.setText("00.000.000");

        CLastName_txf.setText("No Last Name");

        NameEnable_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEnable_boxActionPerformed(evt);
            }
        });

        LastNameEnable_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameEnable_BoxActionPerformed(evt);
            }
        });

        BornEnable_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BornEnable_BoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBornDate_formatted, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CLastName_txf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(CNationalNumber_formatted)
                    .addComponent(CName_txf, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameEnable_box)
                    .addComponent(LastNameEnable_Box)
                    .addComponent(BornEnable_Box))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CName_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(NameEnable_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(CLastName_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LastNameEnable_Box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(CBornDate_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BornEnable_Box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(CNationalNumber_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CStatus_txf.setText("-");

        jLabel15.setText("RESULT:");

        CRole_Box.setText("Create new Role");
        CRole_Box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CRole_BoxMousePressed(evt);
            }
        });

        CRole_txf.setText("No Role");

        CRole_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Role" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CRole_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CRole_txf, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRole_Box)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(CRole_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(CRole_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(CRole_Box))
        );

        AddressEnable_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressEnable_BoxActionPerformed(evt);
            }
        });

        RoleEnable_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleEnable_BoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Campo Obligatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RoleEnable_Box)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CStatus_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressEnable_Box)
                    .addComponent(Create_btn)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(CStatus_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RoleEnable_Box))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddressEnable_Box)
                        .addGap(82, 82, 82)
                        .addComponent(Create_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CCountry_BoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCountry_BoxMousePressed
        // TODO add your handling code here:
        if(CCountry_Box.isSelected()){
            CCountry_txf.setEnabled(false);
            CCountry_List.setEnabled(true);
            CZone_txf.setEnabled(false);
            CZone_List.setEnabled(true);
        }else{
            CCountry_txf.setEnabled(true);
            CCountry_List.setEnabled(false);
            CZone_txf.setEnabled(true);
            CZone_List.setEnabled(false);
            CState_txf.setEnabled(true);
            CState_List.setEnabled(false);
            CState_txf.setEnabled(false);
            CState_List.setEnabled(true);
        }
    }//GEN-LAST:event_CCountry_BoxMousePressed

    private void CZone_BoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CZone_BoxMousePressed
        // TODO add your handling code here:
        if(CZone_Box.isSelected()){
            CZone_txf.setEnabled(false);
            CZone_List.setEnabled(true);
        }else{
            CZone_txf.setEnabled(true);
            CZone_List.setEnabled(false);
        }
    }//GEN-LAST:event_CZone_BoxMousePressed

    private void CState_BoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CState_BoxMousePressed
        // TODO add your handling code here:
        if(CState_Box.isSelected()){
            CState_txf.setEnabled(false);
            CState_List.setEnabled(true);
            CZone_txf.setEnabled(false);
            CZone_List.setEnabled(true);
        }else{
            CState_txf.setEnabled(true);
            CState_List.setEnabled(false);
            CZone_txf.setEnabled(true);
            CZone_List.setEnabled(false);
        }
    }//GEN-LAST:event_CState_BoxMousePressed

    private void Create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_btnActionPerformed
        // TODO add your handling code here:
        try{
            String Role;
            String Country;
            String State;
            String Zone;
            if(CRole_Box.isSelected() || !this.RoleEnable_Box.isSelected()){
                Role = CRole_txf.getText();
            }else{
                Role =(String) CRole_List.getSelectedItem();
            }
            if(CCountry_Box.isSelected() || !this.AddressEnable_Box.isSelected()){
                Country = CCountry_txf.getText();
            }else{
                Country =(String) CCountry_List.getSelectedItem();
            }
            if(CState_Box.isSelected() || !this.AddressEnable_Box.isSelected()){
                State = CState_txf.getText();
            }else{
                State =(String) CState_List.getSelectedItem();
            }
            if(CZone_Box.isSelected() || !this.AddressEnable_Box.isSelected()){
                Zone = CZone_txf.getText();
            }else{
                Zone =(String) CZone_List.getSelectedItem();
            }
            imp.Create( Role, CName_txf.getText(), CLastName_txf.getText(),CBornDate_formatted.getText(), CNationalNumber_formatted.getText(), Country,State, Zone, CStreet_txf.getText(), CNumber_txf.getText(), CHealthEnsurance_txf.getText(), CEmergencyPhone_formatted.getText(),CPhoneNumber_formatted.getText(),CMail_formatted.getText());
            CStatus_txf.setText("Succed.Agent Create");
        }catch(Exception e){
            CStatus_txf.setText("Error.Agent not Create");
            JOptionPane.showMessageDialog(jDialog1, e.getMessage());
        }
    }//GEN-LAST:event_Create_btnActionPerformed

    private void CRole_BoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRole_BoxMousePressed
        // TODO add your handling code here:
        if(CRole_Box.isSelected()){
            CRole_txf.setEnabled(false);
            CRole_List.setEnabled(true);
        }else{
            CRole_txf.setEnabled(true);
            CRole_List.setEnabled(false);
        }
    }//GEN-LAST:event_CRole_BoxMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PanelManager.create.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RoleEnable_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleEnable_BoxActionPerformed
        // TODO add your handling code here:
    if(RoleEnable_Box.isSelected()){
        this.CRole_Box.setEnabled(true);
        this.CRole_List.setEnabled(true);
    }else{
        this.CRole_Box.setEnabled(false);
        this.CRole_List.setEnabled(false);
    }
    }//GEN-LAST:event_RoleEnable_BoxActionPerformed

    private void NameEnable_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEnable_boxActionPerformed
        // TODO add your handling code here:
    if(NameEnable_box.isSelected()){
        this.CName_txf.setEnabled(true);
    }else{
        this.CName_txf.setEnabled(false);
    }
    }//GEN-LAST:event_NameEnable_boxActionPerformed

    private void LastNameEnable_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameEnable_BoxActionPerformed
        // TODO add your handling code here:
        if(LastNameEnable_Box.isSelected()){
        this.CLastName_txf.setEnabled(true);
    }else{  
        this.CLastName_txf.setEnabled(false);
    }
    }//GEN-LAST:event_LastNameEnable_BoxActionPerformed

    private void BornEnable_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BornEnable_BoxActionPerformed
        // TODO add your handling code here:
        if(BornEnable_Box.isSelected()){
        this.CBornDate_formatted.setEnabled(true);
    }else{  
        this.CBornDate_formatted.setEnabled(false);
    }
    }//GEN-LAST:event_BornEnable_BoxActionPerformed

    private void AddressEnable_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressEnable_BoxActionPerformed
        // TODO add your handling code here:
    if(AddressEnable_Box.isSelected()){
        CCountry_Box.setEnabled(true);
        CCountry_List.setEnabled(true);
        CState_Box.setEnabled(true);
        CState_List.setEnabled(true);
        CZone_Box.setEnabled(true);
        CZone_List.setEnabled(true);
        CStreet_txf.setEnabled(true);
        CNumber_txf.setEnabled(true);
    }else{  
        CCountry_Box.setEnabled(false);
        CCountry_List.setEnabled(false);
        CCountry_txf.setEnabled(false);
        CState_Box.setEnabled(false);
        CState_List.setEnabled(false);
        CState_txf.setEnabled(false);
        CZone_Box.setEnabled(false);
        CZone_List.setEnabled(false);
        CZone_txf.setEnabled(false);
        CStreet_txf.setEnabled(false);
        CNumber_txf.setEnabled(false);
    }
    }//GEN-LAST:event_AddressEnable_BoxActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox7.isSelected()){
            CHealthEnsurance_txf.setEnabled(true);
        }else{  
            CHealthEnsurance_txf.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox8.isSelected()){
            CEmergencyPhone_formatted.setEnabled(true);
        }else{  
            CEmergencyPhone_formatted.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox9.isSelected()){
            CPhoneNumber_formatted.setEnabled(true);
        }else{  
            CPhoneNumber_formatted.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox10.isSelected()){
            CMail_formatted.setEnabled(true);
        }else{  
            CMail_formatted.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AddressEnable_Box;
    private javax.swing.JCheckBox BornEnable_Box;
    private javax.swing.JFormattedTextField CBornDate_formatted;
    private javax.swing.JCheckBox CCountry_Box;
    private javax.swing.JComboBox<String> CCountry_List;
    private javax.swing.JTextField CCountry_txf;
    private javax.swing.JFormattedTextField CEmergencyPhone_formatted;
    private javax.swing.JTextField CHealthEnsurance_txf;
    private javax.swing.JTextField CLastName_txf;
    private javax.swing.JFormattedTextField CMail_formatted;
    private javax.swing.JTextField CName_txf;
    private javax.swing.JFormattedTextField CNationalNumber_formatted;
    private javax.swing.JTextField CNumber_txf;
    private javax.swing.JFormattedTextField CPhoneNumber_formatted;
    private javax.swing.JCheckBox CRole_Box;
    private javax.swing.JComboBox<String> CRole_List;
    private javax.swing.JTextField CRole_txf;
    private javax.swing.JCheckBox CState_Box;
    private javax.swing.JComboBox<String> CState_List;
    private javax.swing.JTextField CState_txf;
    private javax.swing.JTextField CStatus_txf;
    private javax.swing.JTextField CStreet_txf;
    private javax.swing.JCheckBox CZone_Box;
    private javax.swing.JComboBox<String> CZone_List;
    private javax.swing.JTextField CZone_txf;
    private javax.swing.JButton Create_btn;
    private javax.swing.JCheckBox LastNameEnable_Box;
    private javax.swing.JCheckBox NameEnable_box;
    private javax.swing.JCheckBox RoleEnable_Box;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}

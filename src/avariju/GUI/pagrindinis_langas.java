/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avariju.GUI;

import avariju.db.JdbcSQLServerConnection;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.sql.Date;  
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author tueik
 */
public class pagrindinis_langas extends javax.swing.JFrame {

    static JdbcSQLServerConnection con = new JdbcSQLServerConnection();
     prideti naujas;
     pakeisti pak;
    
    public pagrindinis_langas() throws SQLException {
        initComponents();
          lentele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ieskoti = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        filter = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        filtras = new javax.swing.JButton();
        ataskaita = new javax.swing.JButton();
        istrynti = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ieskoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ieskotiActionPerformed(evt);
            }
        });
        ieskoti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ieskotiKeyReleased(evt);
            }
        });

        jLabel1.setText("Paieška:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        filter.setText("Atnaujinti lentelę");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        dateChooserCombo1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserCombo1OnSelectionChange(evt);
            }
        });
        dateChooserCombo1.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateChooserCombo1OnCommit(evt);
            }
        });

        dateChooserCombo2.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserCombo2OnSelectionChange(evt);
            }
        });

        filtras.setText("Filtruoti pagal datą");
        filtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrasActionPerformed(evt);
            }
        });

        ataskaita.setText("Generuoti ataskaitą");
        ataskaita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataskaitaActionPerformed(evt);
            }
        });

        istrynti.setText("Ištrynti eilutę");
        istrynti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                istryntiMouseClicked(evt);
            }
        });
        istrynti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                istryntiActionPerformed(evt);
            }
        });

        jButton1.setText("Pakeisti eilutę");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Pridėti duomenis");

        jMenuItem1.setText("Pridėti naują įrašą");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);
        jMenu2.add(jSeparator2);
        jMenu2.add(jSeparator3);
        jMenu2.add(jSeparator4);
        jMenu2.add(jSeparator5);
        jMenu2.add(jSeparator6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(istrynti)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ieskoti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(ataskaita))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(filtras)
                            .addGap(32, 32, 32)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filter))))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtras)
                            .addComponent(filter)))
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(istrynti)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ieskoti, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ataskaita)
                        .addComponent(jLabel1)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ieskotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ieskotiActionPerformed
      
    }//GEN-LAST:event_ieskotiActionPerformed

    private void ieskotiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ieskotiKeyReleased
       
       try{
        String query = "SELECT DALYVAUJA.VALSTYBINIAI_NUMERIAI, EISMO_DALYVIS.PRELIMINARI_ZALA, EISMO_DALYVIS.ASMENS_KODAS, TRANSPORTO_PRIEMONE.MARKE, EISMO_IVYKIS.MIESTO_NR, IVYKIO_VIETA.MIESTAS FROM dbo.EISMO_DALYVIS \n" +
                "INNER JOIN DALYVAUJA ON DALYVAUJA.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
"INNER JOIN TRANSPORTO_PRIEMONE ON TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
                      "INNER JOIN EISMO_IVYKIS ON EISMO_IVYKIS.EISMO_IVYKIO_ID=EISMO_DALYVIS.EISMO_IVYKIO_ID\n" +  
                   "INNER JOIN IVYKIO_VIETA ON EISMO_IVYKIS.MIESTO_NR=IVYKIO_VIETA.MIESTO_NR\n" +    
                "WHERE DALYVAUJA.VALSTYBINIAI_NUMERIAI LIKE '%" + ieskoti.getText() + "%' OR EISMO_DALYVIS.PRELIMINARI_ZALA LIKE  '%" + ieskoti.getText() + "%'  OR EISMO_DALYVIS.ASMENS_KODAS LIKE  '%" + ieskoti.getText() + "%' OR TRANSPORTO_PRIEMONE.MARKE LIKE  '%" + ieskoti.getText() + "%' OR IVYKIO_VIETA.MIESTAS LIKE  '%" + ieskoti.getText() + "%' ";
      ResultSet rs = con.getback(query);
      jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
}
     catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"Got an exception!");
        System.err.println(e.getMessage()); 
    }        
    }//GEN-LAST:event_ieskotiKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        try {
            int row = jTable1.rowAtPoint(evt.getPoint());
            int col = jTable1.columnAtPoint(evt.getPoint());
            String value = jTable1.getModel().getValueAt(row, col).toString();
            if(col==4){
            String query = " SELECT IVYKIO_VIETA.GATVE, IVYKIO_VIETA.MIESTO_NR, IVYKIO_VIETA.KORDINATES FROM dbo.IVYKIO_VIETA, dbo.EISMO_IVYKIS \n" +
                    "WHERE IVYKIO_VIETA.MIESTO_NR=EISMO_IVYKIS.MIESTO_NR  \n" +
                      "AND  IVYKIO_VIETA.MIESTAS LIKE '%" + value + "%' \n" + 
                    "";
            
            
            ResultSet rs = con.getback(query);
            String gatv = null, kord=null, nr = null;
            while (rs.next()) {
                 gatv = rs.getString("GATVE");
                 kord = rs.getString("KORDINATES");
                 nr = rs.getString("MIESTO_NR");
               
            } 
            String to_print = "Gatvė :"+ gatv +"\n"+ "Kordinates: " + kord  +"\n"+ "Miesto NR: " + nr;
            
            JOptionPane.showMessageDialog(null,to_print); } else if(col==3) {
            
             String query = " SELECT * FROM dbo.TRANSPORTO_PRIEMONE \n" +
                    "WHERE TRANSPORTO_PRIEMONE.MARKE LIKE '%" + value + "%'  \n" +
                    "";
            
            
            ResultSet rs = con.getback(query);
            String mode = null, vin=null, techas = null, draud=null;
            while (rs.next()) {
                 mode = rs.getString("MODELIS");
                 vin = rs.getString("VIN_KODAS");
                 techas = rs.getString("TECHNINES_AZPIUROS_GALIOJIMO_DATA");
                 draud = rs.getString("DRAUDIMO_NR");
               
            } 
            String to_print = "Modelis :"+ mode +"\n"+ "VIN kodas: " + vin +"\n"+ "Technines azpiuros galiojimo data: " + techas +"\n"+ "Draudimo NR:" + draud;
            
            JOptionPane.showMessageDialog(null,to_print); } else if(col==2) {
                
                String query = " SELECT * FROM dbo.EISMO_DALYVIS \n" +
                    "WHERE EISMO_DALYVIS.ASMENS_KODAS LIKE '%" + (value) + "%'  \n" +
                    "";
            
            
            ResultSet rs = con.getback(query);
            String lytis = null, data=null, dal_id = null, ivyk_id=null, nr=null, zala=null, kal_id=null;
            while (rs.next()) {
                 lytis = rs.getString("LYTIS");
                 data = rs.getString("GIMIMO_DATA");
                 dal_id = rs.getString("EISMO_DALYVIO_ID");
                 ivyk_id = rs.getString("EISMO_IVYKIO_ID");
                  nr = rs.getString("VALSTYBINIAI_NUMERIAI");
                   zala = rs.getString("PRELIMINARI_ZALA");
                    kal_id = rs.getString("KALTININKO_ID");
            
               
            } 
            String to_print = "lytis :"+ lytis +"\n"+ "data: " + data +"\n"+ "ivykio ID: " + ivyk_id +"\n"+ "dalyvio ID:" + dal_id  +"\n"+ "Automobilio valstybinis  numeris:" + nr +"\n"+ "Preliminari zala:" + zala +"\n"+ "Kaltininko ID:" + kal_id;
            
            JOptionPane.showMessageDialog(null,to_print);
            } else if(col==0) {
            
                  String query = " SELECT EISMO_IVYKIS.IVYKIO_DATA ,EISMO_IVYKIS.ZUVUSIUJU_SKAICIUS, EISMO_IVYKIS.SUZEISTUJU_SKAICIUS, EISMO_IVYKIS.TRANSPORTO_PRIEMONIU_SKAICIUS ,EISMO_IVYKIS.LIUDININKU_SKAICIUS FROM dbo.EISMO_IVYKIS, dbo.DALYVAUJA, dbo.TRANSPORTO_PRIEMONE \n" +
                            "WHERE DALYVAUJA.EISMO_IVYKIO_ID=EISMO_IVYKIS.EISMO_IVYKIO_ID  \n" +
                             "AND TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI=DALYVAUJA.VALSTYBINIAI_NUMERIAI  \n" +
                                 " AND TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI LIKE '%" + value + "%'  \n" +
                    "";
                  
                  
            
            
            ResultSet rs = con.getback(query);
            String zuv = null, suz=null, trans = null, liud=null, id=null, miesto_nr=null, data=null, miestas=null;
            while (rs.next()) {
                 zuv = rs.getString("ZUVUSIUJU_SKAICIUS");
                 suz = rs.getString("SUZEISTUJU_SKAICIUS");
                 trans = rs.getString("TRANSPORTO_PRIEMONIU_SKAICIUS");
                 liud = rs.getString("LIUDININKU_SKAICIUS");
                 data = rs.getString("IVYKIO_DATA");
             
            
               
            } 
            String to_print = "Zuvusiuju skaicius :"+ zuv +"\n"+ "Suzeistuju skaicius : " + suz +"\n"+ "Transporto priemoniu skaicius : " + trans +"\n"+ "Liudininu skaicius :" + liud  +"\n"+ "Ivykio data:" + data;
            
            JOptionPane.showMessageDialog(null,to_print);
            }
            
            
           
        } 
        catch (SQLException ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       try{
        String query = "SELECT DALYVAUJA.VALSTYBINIAI_NUMERIAI, EISMO_DALYVIS.PRELIMINARI_ZALA, EISMO_DALYVIS.ASMENS_KODAS, TRANSPORTO_PRIEMONE.MARKE, EISMO_IVYKIS.MIESTO_NR, IVYKIO_VIETA.MIESTAS FROM dbo.EISMO_DALYVIS \n" +
                "INNER JOIN DALYVAUJA ON DALYVAUJA.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
"INNER JOIN TRANSPORTO_PRIEMONE ON TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
                      "INNER JOIN EISMO_IVYKIS ON EISMO_IVYKIS.EISMO_IVYKIO_ID=EISMO_DALYVIS.EISMO_IVYKIO_ID\n" +  
                   "INNER JOIN IVYKIO_VIETA ON EISMO_IVYKIS.MIESTO_NR=IVYKIO_VIETA.MIESTO_NR\n" +    
              "WHERE IVYKIO_VIETA.MIESTAS LIKE '%" + jComboBox1.getSelectedItem().toString() + "%' ";
      ResultSet rs = con.getback(query);
      jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
}
     catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"Got an exception!");
        System.err.println(e.getMessage()); 
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        try {
            lentele();
        } catch (SQLException ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_filterActionPerformed

    private void dateChooserCombo1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnSelectionChange

    }//GEN-LAST:event_dateChooserCombo1OnSelectionChange

    private void dateChooserCombo1OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnCommit

    }//GEN-LAST:event_dateChooserCombo1OnCommit

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        naujas = new prideti(this,true);
        naujas.setVisible(true);
        naujas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try {
            lentele();
        } catch (SQLException ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void dateChooserCombo2OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserCombo2OnSelectionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserCombo2OnSelectionChange

    private void filtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrasActionPerformed
     SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         String dateFormatted = formattedDate.format(dateChooserCombo1.getSelectedDate().getTime());
          String dateFormatted2 = formattedDate.format(dateChooserCombo2.getSelectedDate().getTime());
         System.out.println(dateFormatted);
         LocalDateTime gal = LocalDateTime.parse(dateFormatted, formatter);
           LocalDateTime gal2 = LocalDateTime.parse(dateFormatted2, formatter);
   //  JOptionPane.showMessageDialog(null,dateFormatted);
     //Date data = Date.valueOf(dateFormatted);
    // java.sql.Date datasql = new java.sql.Date(data.getTime());
 //JOptionPane.showMessageDialog(null,datasql);
         try{
       String query = "SELECT DALYVAUJA.VALSTYBINIAI_NUMERIAI, EISMO_DALYVIS.PRELIMINARI_ZALA, EISMO_DALYVIS.ASMENS_KODAS, TRANSPORTO_PRIEMONE.MARKE, EISMO_IVYKIS.MIESTO_NR, IVYKIO_VIETA.MIESTAS FROM dbo.EISMO_DALYVIS \n" +
                "INNER JOIN DALYVAUJA ON DALYVAUJA.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
"INNER JOIN TRANSPORTO_PRIEMONE ON TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
                      "INNER JOIN EISMO_IVYKIS ON EISMO_IVYKIS.EISMO_IVYKIO_ID=EISMO_DALYVIS.EISMO_IVYKIO_ID\n" +  
                   "INNER JOIN IVYKIO_VIETA ON EISMO_IVYKIS.MIESTO_NR=IVYKIO_VIETA.MIESTO_NR\n" +    
              "WHERE EISMO_IVYKIS.IVYKIO_DATA BETWEEN ? AND ?;";
      ResultSet rs = con.getback1(query,gal,gal2);
      jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
}
     catch (Exception e) { 
        JOptionPane.showMessageDialog(null,gal);
        System.err.println(e.getMessage()); 
    } 
    }//GEN-LAST:event_filtrasActionPerformed

    private void ataskaitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataskaitaActionPerformed
       java.sql.Connection conn ;
        try {
             String DB_URL = "jdbc:sqlserver://DESKTOP-FL6PS0D\\data:1433;databaseName=veikianti;";
 String DB_USER = "root";
 String DB_PASSWORD = "admin";
               conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

           String path = "C:\\Users\\tueik\\Documents\\NetBeansProjects\\Avariju db\\src\\avariju\\GUI\\report1.jrxml";
           JasperReport jr = JasperCompileManager.compileReport(path);
           JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
           JasperViewer.viewReport(jp);
  
        } catch (Exception ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ataskaitaActionPerformed

    private void istryntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_istryntiActionPerformed
 
    }//GEN-LAST:event_istryntiActionPerformed

    private void istryntiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_istryntiMouseClicked
       
        int selectedRow = jTable1.getSelectedRow();
         selectedRow = jTable1.convertRowIndexToModel(selectedRow);
        int input = JOptionPane.showConfirmDialog(null, "Ar tikrai norite istrynti " + (String)jTable1.getModel().getValueAt(selectedRow, 0) + " ");
        if(input == 0){
        try {
            /*int col = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY()/jTable1.getRowHeight();
            if(row < jTable1.getRowCount() && row >= 0 && col < jTable1.getColumnCount() && col>=0){
            Object rowValue = jTable1.getValueAt(row, col);
            String nr = rowValue.toString();
            JOptionPane.showMessageDialog(null,nr);
            }
            */
         
     
           //selectedRow = jTable1.convertRowIndexToModel(selectedRow);
            String val1 = (String)jTable1.getModel().getValueAt(selectedRow, 0);
            con.delete("Delete dbo.EISMO_DALYVIS where VALSTYBINIAI_NUMERIAI =  ? ;\n" +
                    "Delete from dbo.DALYVAUJA where VALSTYBINIAI_NUMERIAI =  ?  ;\n" +
                    "Delete from dbo.TRANSPORTO_PRIEMONE where VALSTYBINIAI_NUMERIAI =  ? \n" +
                    "",val1,val1,val1);
            
            lentele();
        } catch (SQLException ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else { }

    }//GEN-LAST:event_istryntiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jTable1.setSelectionBackground(Color.lightGray);
        int selectedRow = jTable1.getSelectedRow();
            selectedRow = jTable1.convertRowIndexToModel(selectedRow);
            String val1 = (String)jTable1.getModel().getValueAt(selectedRow, 0);
             String val2 = (String)jTable1.getModel().getValueAt(selectedRow, 1);
             String val3 = (String)jTable1.getModel().getValueAt(selectedRow, 2);
             String val4 = (String)jTable1.getModel().getValueAt(selectedRow, 3);
             String val5 = (String)jTable1.getModel().getValueAt(selectedRow, 4);
        
        pak = new pakeisti(this,true,val1,val2,val3,val4,val5);
        pak.setVisible(true);
        pak.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try {
            lentele();
        } catch (SQLException ex) {
            Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

      public void lentele() throws SQLException{
      
       String sql = "SELECT IVYKIO_VIETA.MIESTO_NR,DALYVAUJA.VALSTYBINIAI_NUMERIAI, EISMO_DALYVIS.PRELIMINARI_ZALA, EISMO_DALYVIS.ASMENS_KODAS, TRANSPORTO_PRIEMONE.MARKE, EISMO_IVYKIS.MIESTO_NR, IVYKIO_VIETA.MIESTAS FROM dbo.EISMO_DALYVIS \n" +
                "INNER JOIN DALYVAUJA ON DALYVAUJA.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
"INNER JOIN TRANSPORTO_PRIEMONE ON TRANSPORTO_PRIEMONE.VALSTYBINIAI_NUMERIAI=EISMO_DALYVIS.VALSTYBINIAI_NUMERIAI\n" +
               "INNER JOIN EISMO_IVYKIS ON EISMO_IVYKIS.EISMO_IVYKIO_ID=EISMO_DALYVIS.EISMO_IVYKIO_ID\n" +     
                "INNER JOIN IVYKIO_VIETA ON EISMO_IVYKIS.MIESTO_NR=IVYKIO_VIETA.MIESTO_NR\n" +    
"";
       
        ResultSet rsl = con.getback(sql);
        boolean b = rsl.last();
    int count = rsl.getRow();
    rsl.beforeFirst();
    
    String sql1 = "SELECT DISTINCT IVYKIO_VIETA.MIESTAS FROM dbo.IVYKIO_VIETA";
     ResultSet rsl1 = con.getback(sql1);
      String mode = null;
            while (rsl1.next()) {
                 mode = rsl1.getString("MIESTAS");
                    //jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {mode}));
                    jComboBox1.addItem(mode);
                       //  JOptionPane.showMessageDialog(null,mode);
            }
        


        
    String [][] mas = new String [count][5];
    int i = 0;


       while(rsl.next()) {
        mas[i][0] = rsl.getString("VALSTYBINIAI_NUMERIAI");   
           mas[i][1] = rsl.getString("PRELIMINARI_ZALA"); 
             mas[i][2] = rsl.getString("ASMENS_KODAS"); 
               mas[i][3] = rsl.getString("MARKE"); 
                mas[i][4] = rsl.getString("MIESTAS"); 
                
i++;
        
    }
    
          jTable1.setModel(new javax.swing.table.DefaultTableModel(
           mas,
            new String [] {
                "Valstybiniai numeriai", "PRELIMINARI ZALA EUR", "Asmens kodas", "Marke","Miestas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
         
      
          
    }
      


      
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pagrindinis_langas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagrindinis_langas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagrindinis_langas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagrindinis_langas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pagrindinis_langas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pagrindinis_langas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataskaita;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton filter;
    private javax.swing.JButton filtras;
    private javax.swing.JTextField ieskoti;
    private javax.swing.JButton istrynti;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

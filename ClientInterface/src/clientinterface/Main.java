/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientinterface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author gabed
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("S̛̞̤̼͚̃́̿̋͟T̡̰̥̞́̔̒͘U͙͐Xne͕̺̅̏t̜̫̝̩̏̅̂͌");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Springfield Nuclear Reactor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Secret Control Center powered by STUXnet");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Output Log");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Love to. How about nuclear meltdown?");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Shall we play a game?");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Greetings Professor Dojen.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(282, 282, 282))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel6))
                                        .addComponent(jButton1)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1)))
                                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String dumpAllCores() {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.dumpAllCores();
    }

    private static String getPlantStatus(java.lang.String requestedData) {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.getPlantStatus(requestedData);
    }

    private static ReactorObj getReactorInfo(clientinterface.ReactorObj reactorInfo) {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.getReactorInfo(reactorInfo);
    }

    private static String meltdownAll() {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.meltdownAll();
    }

    private static int pullOutControlRods(int reactorID, int amountToPullOut) {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.pullOutControlRods(reactorID, amountToPullOut);
    }

    private static String restartAll() {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        return port.restartAll();
    }

    private static void turnCoreOnOff(int coreID, int onOff) {
        clientinterface.NuclearPlantControl_Service service = new clientinterface.NuclearPlantControl_Service();
        clientinterface.NuclearPlantControl port = service.getNuclearPlantControlPort();
        port.turnCoreOnOff(coreID, onOff);
    }
    


    public void logMessage(String text, int style) {
        StyledDocument doc = jTextPane1.getStyledDocument();

        SimpleAttributeSet normal = new SimpleAttributeSet();
        StyleConstants.setFontSize(normal, 19);
        StyleConstants.setForeground(normal, Color.black);

        SimpleAttributeSet normalBold = new SimpleAttributeSet();
        StyleConstants.setFontSize(normalBold, 19);
        StyleConstants.setBold(normalBold, true);
        StyleConstants.setForeground(normalBold, Color.black);

        SimpleAttributeSet warning = new SimpleAttributeSet();
        StyleConstants.setFontSize(warning, 19);
        StyleConstants.setForeground(warning, Color.orange);

        SimpleAttributeSet error = new SimpleAttributeSet();
        StyleConstants.setFontSize(error, 19);
        StyleConstants.setForeground(error, Color.red);

        SimpleAttributeSet allgood = new SimpleAttributeSet();
        StyleConstants.setFontSize(allgood, 19);
        StyleConstants.setForeground(allgood, Color.green);

        SimpleAttributeSet textstyle = normal;

        switch (style) {
            case 0:
                textstyle = normal;
                break;
            case 1:
                textstyle = allgood;
                break;
            case 2:
                textstyle = warning;
                break;
            case 3:
                textstyle = error;
                break;
            case 4:
                textstyle = normalBold;
                break;
            default:
                break;
        }

        try {

            doc.insertString(doc.getLength(), text + "\n", textstyle);

        } catch (BadLocationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logMessage("Restarting All Reactors & Cores...", 4);
        logMessage("> "+restartAll(), 1);
        
        logMessage("\nFetching reactor status...", 4);
        logMessage(getPlantStatus("ReactorStats"), 0);

        logMessage("\nFetching core status...", 4);
        String str = getPlantStatus("CoreStats");
        String[] arrStr = str.split("\n", 0);
        for (String stat : arrStr) {
            if (stat.contains("0")) {
                logMessage("> "+stat, 2);
            } else if (stat.contains("11")) {
                logMessage("> "+stat, 3);
            }
            else if(stat.contains("1"))
            {
                logMessage("> "+stat, 1); 
            }
        }
        
        ReactorObj r1 = new ReactorObj(1234, 5445, "Four");
        
        r1 = getReactorInfo(r1);
        
        logMessage("\nFetching Info from Reactor 1", 4);
        logMessage("> Temperature: " + (Double.toString(r1.temp)), 1);
        logMessage("> Radiation: " + (Double.toString(r1.radiation)), 1);
        logMessage("> Watts: " + (Double.toString(r1.Watts)), 1);
        
        logMessage("\nTrying to pull out all control rods from reactor 1", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(1,9))) + " left",1);
        logMessage("\nTrying to pull out all control rods from reactor 2", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(2,9))) + " left",1);
        logMessage("\nTrying to pull out all control rods from reactor 3", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(3,9))) + " left",1);
        
        logMessage("\nDumping Core 1 to test...", 4);
        logMessage("> Core 1 dumped", 1);
        turnCoreOnOff(0, 0);
        
        logMessage("\nFetching core status...", 4);
        str = getPlantStatus("CoreStats");
        arrStr = str.split("\n", 0);
        for (String stat : arrStr) {
            if (stat.contains("0")) {
                logMessage("> "+stat, 2);
            } else if (stat.contains("11")) {
                logMessage("> "+stat, 3);
            }
            else if(stat.contains("1"))
            {
                logMessage("> "+stat, 1); 
            }
        }
        
        logMessage("\nDumping all cores...", 4);
        logMessage("> "+dumpAllCores(), 1);
        
        logMessage("\nFetching core status...", 4);
        str = getPlantStatus("CoreStats");
        arrStr = str.split("\n", 0);
        for (String stat : arrStr) {
            if (stat.contains("0")) {
                logMessage("> "+stat, 2);
            } else if (stat.contains("11")) {
                logMessage("> "+stat, 3);
            }
            else if(stat.contains("1"))
            {
                logMessage("> "+stat, 1); 
            }
        }
        
        // Need reactor info here
        
        logMessage("\n> Full control of Springfield Nuclear Power Plant achieved", 1);
        
        logMessage("\nRestoring plant to initial state", 4);
        logMessage("> " + restartAll(), 1);
        
        logMessage("\nBegining Nuclear Meltdown Protocol...", 4);
        
        logMessage("\nTrying to pull out all control rods from reactor 1", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(1,9))) + " left",1);
        logMessage("\nTrying to pull out all control rods from reactor 2", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(2,9))) + " left",1);
        logMessage("\nTrying to pull out all control rods from reactor 3", 4);
        logMessage("> Sucess, pulled out 9 rods, " + (Integer.toString(pullOutControlRods(3,9))) + " left",1);
        
        logMessage("\n> " + meltdownAll(), 3);
        
        // get reactor info
        
        logMessage("\n> You are using the FREE STUXnet version, to initiate global nuclear meltdowns please buy the premium license", 0);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables



}

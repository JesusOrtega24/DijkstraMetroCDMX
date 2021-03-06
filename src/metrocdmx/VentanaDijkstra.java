/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocdmx;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesus Toxqui Ortega
 */
public class VentanaDijkstra extends javax.swing.JFrame {
    
    dijkstra algoDijkstra = new dijkstra();
    String getItemOrigen;
    String getItemDestino;
    Desktop desktop = Desktop.getDesktop();

    /**
     * Creates new form VentanaDijkstra
     */
    public VentanaDijkstra() {
        initComponents();
        this.setSize(new Dimension(1545, 935));
        this.setMinimumSize(new Dimension(1340, 880));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonCalcDijks = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TextOrigen = new javax.swing.JComboBox<>();
        TextDestino = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        facebook = new javax.swing.JButton();
        instagram = new javax.swing.JButton();
        twitter = new javax.swing.JButton();
        youtube = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("App Dijkstra Metro Ciudad de M??xico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1530, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/origen.jpg"))); // NOI18N
        jLabel6.setText("ORIGEN");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 320, 112, 52);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/destino.png"))); // NOI18N
        jLabel7.setText("DESTINO");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(170, 410, 112, 50);

        buttonCalcDijks.setBackground(new java.awt.Color(255, 153, 0));
        buttonCalcDijks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonCalcDijks.setForeground(new java.awt.Color(255, 255, 255));
        buttonCalcDijks.setText("CALCULAR DISTANCIA CORTA");
        buttonCalcDijks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCalcDijksMouseClicked(evt);
            }
        });
        buttonCalcDijks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcDijksActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCalcDijks);
        buttonCalcDijks.setBounds(260, 520, 240, 50);

        jLabel8.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel8.setText("Desarrollador | Jesus Toxqui Ortega");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(180, 700, 254, 18);

        TextOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un origen", "4_CAMINOS", "ACATITLA", "ACULCO", "AGRICOLA_ORIENTAL", "ALLENDE", "APATLACO", "AQUILES_SERDAN", "ARAGON", "ATLALILCO", "AUDITORIO", "AUTOBUSES_DEL_NORTE", "AZCAPOTZALCO", "BALBUENA", "BALDERAS", "BARRANCA_DEL_MUERTO", "BELLAS_ARTES", "BONDOJITO", "BOSQUE_ARAGON", "BOULEVARD_PUERTO_AEREO", "BUENA_VISTA", "CALLE_11", "CAMARONES", "CANAL_DE_SAN_JUAN", "CANAL_DEL_NORTE", "CANDELARIA", "CENTRO_MEDICO", "CERRO_DE_LA_ESTRELLA", "CHABACANO", "CHAPULTEPEC", "CHILPANCINGO", "CIUDAD_AZTECA", "CIUDAD_DEPORTIVA", "COLEGIO_MILITAR", "CONSTITUCION_DE_1917", "CONSTITUYENTES", "CONSULADO", "COPILCO", "COYOACAN", "COYUYA", "CUAUHTEMOC", "CUITLAHUAC", "CULHUACAN", "DEPORTIVO_18_DE_MARZO", "DEPORTIVO_OCEANIA", "DIVISION_DEL_NORTE", "DOCTORES", "ECATEPEC", "EDUARDO_MOLINA", "EJE_CENTRAL", "EL_ROSARIO ", "ERMITA", "ESCUADRON_201", "ETIOPIA", "EUGENIA", "FERRERIA", "FRAY_SERVANDO", "GARIBALDI", "GENERAL_ANAYA", "GOMEZ_FARIAS", "GUELATAO", "GUERRERO", "HANGARES", "HIDALGO", "HOSPITAL_20_DE_NOVIEMBRE", "HOSPITAL_GENERAL", "IMPULSORA", "INDIOS_VERDES", "INSTITUTO_DEL_PETROLEO", "INSURGENTES", "INSURGENTES_SUR", "ISABEL_LA_CATOLICA", "IZTACALCO", "IZTAPALAPA", "JAMAICA", "JUANACATLAN", "JUAREZ", "LA_PAZ", "LA_RAZA", "LA_VIGA", "LA_VILLA_BASILICA", "LAGUNILLA", "LAZARO_CARDENAS", "LINDA_VISTA", "LOMAS_LA_ESTRELLA", "LOS_REYES", "M.A._QUEVEDO", "MARTIN_CARRERA", "MERCED", "MEXICALTZINGO", "MISTERIOS", "MIXCOAC", "MIXIUHCA", "MOCTEZUMA", "MORELOS", "MUZQUIZ", "NATIVITAS", "NEZAHUALCOYOTL", "NI??OS_HEROES", "NOPALERA", "NORMAL", "NORTE_45", "OBRERA ", "OBSERVATORIO", "OCEANIA", "OLIMPICA", "OLIVOS", "PANTEONES", "PANTITLAN", "PARQUE_DE_LOS_VENADOS", "PATRIOTISMO", "PE??ON_VIEJO", "PERIFERICO_ORIENTE", "PINO_SUAREZ", "PLAZA_ARAGON", "POLANCO", "POLITECNICO", "POPOTLA", "PORTALES", "POTRERO", "PUEBLA", "REFINERIA", "REVOLUCION", "RICARDO_FLORES_MAGON", "RIO_DE_LOS_REMEDIOS", "ROMERO_RUBIO", "SALTO_DEL_AGUA", "SAN_ANDRES_TOMATLAN", "SAN_ANTONIO", "SAN_ANTONIO_ABAD", "SAN_COSME", "SAN_JOAQUIN", "SAN_JUAN_DE_LETRAN", "SAN_LAZARO", "SAN_PEDRO_DE_LOS_PINOS", "SANTA_ANITA", "SANTA_MARTHA", "SEVILLA", "TACUBA", "TACUBAYA", "TALISMAN", "TASQUE??A", "TEPALCATES", "TEPITO", "TERMINAL_AEREA", "TEZONCO", "TEZOZOMOC", "TLAHUAC", "TLALTENCO", "TLATELOLCO", "UAM-1", "UNIVERSIDAD", "VALLE_GOMEZ", "VALLEJO", "VELODROMO", "VIADUCTO", "VILLA_DE_ARAGON", "VILLA_DE_CORTES", "VIVEROS", "XOLA", "ZAPATA", "ZAPOTITLAN", "ZARAGOZA", "ZOCALO" }));
        jPanel2.add(TextOrigen);
        TextOrigen.setBounds(350, 320, 269, 52);

        TextDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un destino", "4_CAMINOS", "ACATITLA", "ACULCO", "AGRICOLA_ORIENTAL", "ALLENDE", "APATLACO", "AQUILES_SERDAN", "ARAGON", "ATLALILCO", "AUDITORIO", "AUTOBUSES_DEL_NORTE", "AZCAPOTZALCO", "BALBUENA", "BALDERAS", "BARRANCA_DEL_MUERTO", "BELLAS_ARTES", "BONDOJITO", "BOSQUE_ARAGON", "BOULEVARD_PUERTO_AEREO", "BUENA_VISTA", "CALLE_11", "CAMARONES", "CANAL_DE_SAN_JUAN", "CANAL_DEL_NORTE", "CANDELARIA", "CENTRO_MEDICO", "CERRO_DE_LA_ESTRELLA", "CHABACANO", "CHAPULTEPEC", "CHILPANCINGO", "CIUDAD_AZTECA", "CIUDAD_DEPORTIVA", "COLEGIO_MILITAR", "CONSTITUCION_DE_1917", "CONSTITUYENTES", "CONSULADO", "COPILCO", "COYOACAN", "COYUYA", "CUAUHTEMOC", "CUITLAHUAC", "CULHUACAN", "DEPORTIVO_18_DE_MARZO", "DEPORTIVO_OCEANIA", "DIVISION_DEL_NORTE", "DOCTORES", "ECATEPEC", "EDUARDO_MOLINA", "EJE_CENTRAL", "EL_ROSARIO ", "ERMITA", "ESCUADRON_201", "ETIOPIA", "EUGENIA", "FERRERIA", "FRAY_SERVANDO", "GARIBALDI", "GENERAL_ANAYA", "GOMEZ_FARIAS", "GUELATAO", "GUERRERO", "HANGARES", "HIDALGO", "HOSPITAL_20_DE_NOVIEMBRE", "HOSPITAL_GENERAL", "IMPULSORA", "INDIOS_VERDES", "INSTITUTO_DEL_PETROLEO", "INSURGENTES", "INSURGENTES_SUR", "ISABEL_LA_CATOLICA", "IZTACALCO", "IZTAPALAPA", "JAMAICA", "JUANACATLAN", "JUAREZ", "LA_PAZ", "LA_RAZA", "LA_VIGA", "LA_VILLA_BASILICA", "LAGUNILLA", "LAZARO_CARDENAS", "LINDA_VISTA", "LOMAS_LA_ESTRELLA", "LOS_REYES", "M.A._QUEVEDO", "MARTIN_CARRERA", "MERCED", "MEXICALTZINGO", "MISTERIOS", "MIXCOAC", "MIXIUHCA", "MOCTEZUMA", "MORELOS", "MUZQUIZ", "NATIVITAS", "NEZAHUALCOYOTL", "NI??OS_HEROES", "NOPALERA", "NORMAL", "NORTE_45", "OBRERA ", "OBSERVATORIO", "OCEANIA", "OLIMPICA", "OLIVOS", "PANTEONES", "PANTITLAN", "PARQUE_DE_LOS_VENADOS", "PATRIOTISMO", "PE??ON_VIEJO", "PERIFERICO_ORIENTE", "PINO_SUAREZ", "PLAZA_ARAGON", "POLANCO", "POLITECNICO", "POPOTLA", "PORTALES", "POTRERO", "PUEBLA", "REFINERIA", "REVOLUCION", "RICARDO_FLORES_MAGON", "RIO_DE_LOS_REMEDIOS", "ROMERO_RUBIO", "SALTO_DEL_AGUA", "SAN_ANDRES_TOMATLAN", "SAN_ANTONIO", "SAN_ANTONIO_ABAD", "SAN_COSME", "SAN_JOAQUIN", "SAN_JUAN_DE_LETRAN", "SAN_LAZARO", "SAN_PEDRO_DE_LOS_PINOS", "SANTA_ANITA", "SANTA_MARTHA", "SEVILLA", "TACUBA", "TACUBAYA", "TALISMAN", "TASQUE??A", "TEPALCATES", "TEPITO", "TERMINAL_AEREA", "TEZONCO", "TEZOZOMOC", "TLAHUAC", "TLALTENCO", "TLATELOLCO", "UAM-1", "UNIVERSIDAD", "VALLE_GOMEZ", "VALLEJO", "VELODROMO", "VIADUCTO", "VILLA_DE_ARAGON", "VILLA_DE_CORTES", "VIVEROS", "XOLA", "ZAPATA", "ZAPOTITLAN", "ZARAGOZA", "ZOCALO" }));
        jPanel2.add(TextDestino);
        TextDestino.setBounds(350, 410, 269, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/mapa cdmx metro2.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(790, 110, 690, 590);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/angel.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(210, 150, 310, 130);

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/facebook.png"))); // NOI18N
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });
        jPanel2.add(facebook);
        facebook.setBounds(550, 700, 50, 50);

        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/instagram.jpg"))); // NOI18N
        instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instagramActionPerformed(evt);
            }
        });
        jPanel2.add(instagram);
        instagram.setBounds(640, 700, 50, 50);

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/twitter.png"))); // NOI18N
        twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitterActionPerformed(evt);
            }
        });
        jPanel2.add(twitter);
        twitter.setBounds(730, 700, 50, 50);

        youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/youtube.png"))); // NOI18N
        youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                youtubeActionPerformed(evt);
            }
        });
        jPanel2.add(youtube);
        youtube.setBounds(820, 700, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocdmx/images/METROCDMX.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 580, 1550, 320);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1530, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcDijksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCalcDijksMouseClicked
        // TODO add your handling code here:
        
        getItemOrigen = (String) TextOrigen.getSelectedItem();
        getItemDestino = (String) TextDestino.getSelectedItem();
        
        dijkstra miDijkstra = new dijkstra();
        miDijkstra.algoritmo(getItemOrigen, getItemDestino);
    }//GEN-LAST:event_buttonCalcDijksMouseClicked

    private void buttonCalcDijksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcDijksActionPerformed
        // TODO add your handling code here:
        buttonCalcDijks.setBackground(new java.awt.Color(255,250,250));
        
    }//GEN-LAST:event_buttonCalcDijksActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop DeskBrowser = Desktop.getDesktop();
                if (DeskBrowser.isSupported(Desktop.Action.BROWSE)) {
                    DeskBrowser.browse(new URI("https://www.facebook.com/MetroCDMX"));
                }
            }
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_facebookActionPerformed

    private void instagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instagramActionPerformed
        // TODO add your handling code here:
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop DeskBrowser1 = Desktop.getDesktop();
                if (DeskBrowser1.isSupported(Desktop.Action.BROWSE)) {
                    DeskBrowser1.browse(new URI("https://www.instagram.com/metrocdmx/"));
                }
            }
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_instagramActionPerformed

    private void twitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitterActionPerformed
        // TODO add your handling code here:
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop DeskBrowser2 = Desktop.getDesktop();
                if (DeskBrowser2.isSupported(Desktop.Action.BROWSE)) {
                    DeskBrowser2.browse(new URI("https://twitter.com/MetroCDMX"));
                }
            }
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_twitterActionPerformed

    private void youtubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_youtubeActionPerformed
        // TODO add your handling code here:
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop DeskBrowser3 = Desktop.getDesktop();
                if (DeskBrowser3.isSupported(Desktop.Action.BROWSE)) {
                    DeskBrowser3.browse(new URI("https://www.youtube.com/user/METROGDF"));
                }
            }
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_youtubeActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDijkstra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TextDestino;
    private javax.swing.JComboBox<String> TextOrigen;
    private javax.swing.JButton buttonCalcDijks;
    private javax.swing.JButton facebook;
    private javax.swing.JButton instagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton twitter;
    private javax.swing.JButton youtube;
    // End of variables declaration//GEN-END:variables
}

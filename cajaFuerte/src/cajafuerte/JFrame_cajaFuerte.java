package cajafuerte;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 * Programa que simula una caja fuerte.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class JFrame_cajaFuerte extends javax.swing.JFrame {
    public JFrame_cajaFuerte() {
        initComponents();
            //Declarar objetos spinner's.
        SpinnerNumberModel unidades = new SpinnerNumberModel();
        SpinnerNumberModel decenas = new SpinnerNumberModel();
        SpinnerNumberModel centenas = new SpinnerNumberModel();
            //Establecer limites.
        unidades.setMaximum(9);
        unidades.setMinimum(0);
        decenas.setMaximum(9);
        decenas.setMinimum(0);
        centenas.setMaximum(9);
        centenas.setMinimum(0);
            //Asignar componente gráfico.
        spiUnidades.setModel(unidades);
        spiDecenas.setModel(decenas);
        spiCentenas.setModel(centenas);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        pnlSpinner = new javax.swing.JPanel();
        spiCentenas = new javax.swing.JSpinner();
        spiDecenas = new javax.swing.JSpinner();
        spiUnidades = new javax.swing.JSpinner();
        lblEstado = new javax.swing.JLabel();
        pnlLabel = new javax.swing.JPanel();
        lblCentenas = new javax.swing.JLabel();
        lblDecenas = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caja Fuerte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        mainPanel.setForeground(new java.awt.Color(204, 204, 255));

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajafuerte/cajaFuerte.jpeg"))); // NOI18N
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.setOpaque(true);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        pnlSpinner.setBackground(new java.awt.Color(17, 26, 32));
        pnlSpinner.setOpaque(false);

        spiCentenas.setOpaque(true);
        spiCentenas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiCentenasStateChanged(evt);
            }
        });

        spiDecenas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spiDecenas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiDecenasStateChanged(evt);
            }
        });

        spiUnidades.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiUnidadesStateChanged(evt);
            }
        });

        lblEstado.setBackground(new java.awt.Color(20, 19, 25));
        lblEstado.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 51, 51));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setOpaque(true);

        javax.swing.GroupLayout pnlSpinnerLayout = new javax.swing.GroupLayout(pnlSpinner);
        pnlSpinner.setLayout(pnlSpinnerLayout);
        pnlSpinnerLayout.setHorizontalGroup(
            pnlSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpinnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spiCentenas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spiDecenas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spiUnidades)
                .addContainerGap())
            .addGroup(pnlSpinnerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSpinnerLayout.setVerticalGroup(
            pnlSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpinnerLayout.createSequentialGroup()
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spiCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLabel.setBackground(new java.awt.Color(20, 19, 25));
        pnlLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Narrow", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblCentenas.setBackground(new java.awt.Color(20, 19, 25));
        lblCentenas.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lblCentenas.setForeground(new java.awt.Color(255, 153, 153));
        lblCentenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCentenas.setText("0");
        lblCentenas.setToolTipText("");
        lblCentenas.setOpaque(true);

        lblDecenas.setBackground(new java.awt.Color(20, 19, 25));
        lblDecenas.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lblDecenas.setForeground(new java.awt.Color(255, 153, 153));
        lblDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecenas.setText("0");
        lblDecenas.setToolTipText("");
        lblDecenas.setOpaque(true);

        lblUnidades.setBackground(new java.awt.Color(20, 19, 25));
        lblUnidades.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lblUnidades.setForeground(new java.awt.Color(255, 153, 153));
        lblUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnidades.setText("0");
        lblUnidades.setToolTipText("");
        lblUnidades.setOpaque(true);

        javax.swing.GroupLayout pnlLabelLayout = new javax.swing.GroupLayout(pnlLabel);
        pnlLabel.setLayout(pnlLabelLayout);
        pnlLabelLayout.setHorizontalGroup(
            pnlLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabelLayout.createSequentialGroup()
                .addComponent(lblCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLabelLayout.setVerticalGroup(
            pnlLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(pnlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
            //Declarar variables tipo entero.
        int centenas, decenas, unidades, clave=0;
          //Declarar iconos (imagenes) -> Esta linea no es usada en el programa...
        /*ImageIcon TNT = new ImageIcon("src/TNT.png");*/
            //Obtener numeros de los Spinners para convertirlos a texto; luego a numeros enteros.
        unidades = Integer.parseInt(spiUnidades.getValue().toString());
        decenas = Integer.parseInt(spiDecenas.getValue().toString());
        centenas = Integer.parseInt(spiCentenas.getValue().toString());
            /*Comprobar si unidades == 6; decenas == 4; centenas == 2.
                                o sea comprobar si la clave es 246; */
        if(centenas==2){
            if(decenas==4){
                if(unidades==6){
                        //Cambiar icono -> Esta linea no es usada en el programa...
                    /*btnAbrir.setIcon(TNT);*/
                    lblEstado.setText("ABIERTO");
                    lblEstado.setForeground(Color.green);
                    btnAbrir.setEnabled(false);
                }
            }
        }else{
            lblEstado.setText("CERRADO");
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void spiUnidadesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiUnidadesStateChanged
        lblUnidades.setText(spiUnidades.getValue().toString());
    }//GEN-LAST:event_spiUnidadesStateChanged

    private void spiDecenasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiDecenasStateChanged
        lblDecenas.setText(spiDecenas.getValue().toString());
    }//GEN-LAST:event_spiDecenasStateChanged

    private void spiCentenasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiCentenasStateChanged
        lblCentenas.setText(spiCentenas.getValue().toString());
    }//GEN-LAST:event_spiCentenasStateChanged

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
            java.util.logging.Logger.getLogger(JFrame_cajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_cajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_cajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_cajaFuerte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_cajaFuerte().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JLabel lblCentenas;
    private javax.swing.JLabel lblDecenas;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblUnidades;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlLabel;
    private javax.swing.JPanel pnlSpinner;
    private javax.swing.JSpinner spiCentenas;
    private javax.swing.JSpinner spiDecenas;
    private javax.swing.JSpinner spiUnidades;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.awt.Graphics;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author user
 */
public class InterfazPrincipal extends javax.swing.JFrame {
protected boolean iconable;
protected boolean closable;
protected boolean isMaximum;
    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        menuBar.setOpaque(true);

        menuBar.setUI(new BasicMenuBarUI() {
            public void paint(Graphics g, JComponent c) {
                g.setColor(new java.awt.Color(255, 255, 255));
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
        });

//        jDesktopPane1.setUI(new BasicDesktopPaneUI() {
//
//            public void paintComponent(Graphics g) {
//                g.setColor(new java.awt.Color(36, 33, 33));
//                g.fillRect(0, 0, getWidth(), getHeight());
//            }
//        });

     
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu8.setText("jMenu8");

        jMenuItem17.setText("jMenuItem17");

        jMenuItem19.setText("jMenuItem19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        jMenu1.setText("Productos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        jMenuItem1.setText("Listado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        jMenuItem2.setText("Gestionar Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/usuarioMenu.png"))); // NOI18N
        jMenu2.setText("Personal");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioA.png"))); // NOI18N
        jMenuItem3.setText("Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioA.png"))); // NOI18N
        menuProveedores.setText("Proveedores");
        menuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(menuProveedores);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioA.png"))); // NOI18N
        jMenu11.setText("Usuarios del Sistema");

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/usuarioMenu.png"))); // NOI18N
        jMenuItem20.setText("Usuarios Registrados");
        jMenu11.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/usuarioMenu.png"))); // NOI18N
        jMenuItem21.setText("Cobradores");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem21);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/usuarioMenu.png"))); // NOI18N
        jMenuItem22.setText("Vendedores");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem22);

        jMenu2.add(jMenu11);

        menuBar.add(jMenu2);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ventaMenu.png"))); // NOI18N
        jMenu7.setText("Venta");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ventaMenu.png"))); // NOI18N
        jMenuItem4.setText("Nueva Venta");
        jMenu7.add(jMenuItem4);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ventaMenu.png"))); // NOI18N
        jMenuItem11.setText("Historial de Ventas");
        jMenu7.add(jMenuItem11);

        menuBar.add(jMenu7);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/compraMenu.png"))); // NOI18N
        jMenu9.setText("Compra");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/compraMenu.png"))); // NOI18N
        jMenuItem12.setText("Registrar Compra");
        jMenu9.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/compraMenu.png"))); // NOI18N
        jMenuItem13.setText("Historial de Compras");
        jMenu9.add(jMenuItem13);

        menuBar.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/porcentaj.png"))); // NOI18N
        jMenu10.setText("Presupuesto");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/porcentaj.png"))); // NOI18N
        jMenuItem16.setText("Nuevo Presupuesto");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem16);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/porcentaj.png"))); // NOI18N
        jMenuItem18.setText("Presupuestos Registrados");
        jMenu10.add(jMenuItem18);

        menuBar.add(jMenu10);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/reporteMenu.png"))); // NOI18N
        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jMenuItem6.setText("Stock de Productos");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jMenuItem7.setText("Ventas por Fecha");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jMenuItem8.setText("Ventas de Productos por Fecha");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jMenuItem9.setText("Compras de Productos");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jMenuItem10.setText("Total Recaudacion");
        jMenu3.add(jMenuItem10);

        menuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/toolsMenu.png"))); // NOI18N
        jMenu4.setText("Configuraciones");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configure.png"))); // NOI18N
        jMenuItem14.setText("Respaldar BD");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configure.png"))); // NOI18N
        jMenuItem15.setText("Restaurar BD");
        jMenu4.add(jMenuItem15);

        menuBar.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ayuda.png"))); // NOI18N
        jMenu5.setText("Ayuda");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuBar.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/exitMenu.png"))); // NOI18N
        jMenu6.setText("Cerrar Sesión");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        menuBar.add(jMenu6);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
//        GestionProductos prod = new GestionProductos();
//        prod.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProveedoresActionPerformed
              GestionProveedor p=new GestionProveedor();
      p.setVisible(true);
    }//GEN-LAST:event_menuProveedoresActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
                                    int mensaje= JOptionPane.showConfirmDialog(this,"¿Deseas cerrar sesión?","Cerrar Sesión",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(mensaje == JOptionPane.YES_OPTION) {
            this.dispose();    
              LoginUI login = new LoginUI();
              login.setVisible(true);
        }

    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GestionClientes g=new GestionClientes();
      g.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
              GestionCobradores c=new GestionCobradores();
      c.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
              GestionVendedores v=new GestionVendedores();
      v.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuProveedores;
    // End of variables declaration//GEN-END:variables
}

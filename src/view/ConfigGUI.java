package view;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

public class ConfigGUI extends javax.swing.JFrame
{
    public ConfigGUI()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NyelvButtonGroup = new javax.swing.ButtonGroup();
        IdkComboBox = new javax.swing.JComboBox<>();
        HirlevelCheckBox = new javax.swing.JCheckBox();
        NyelvPanel = new javax.swing.JPanel();
        IOSJavaRadioButton = new javax.swing.JRadioButton();
        MSJavaRadioButton = new javax.swing.JRadioButton();
        JavaRadioButton = new javax.swing.JRadioButton();
        ResetButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        BetoltMenuItem = new javax.swing.JMenuItem();
        MentMenuItem = new javax.swing.JMenuItem();
        Separator = new javax.swing.JPopupMenu.Separator();
        KilepMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Config");
        setResizable(false);

        IdkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "confing", "ballsql" }));

        HirlevelCheckBox.setText("Hírlevél");

        NyelvPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Nyelv"));

        NyelvButtonGroup.add(IOSJavaRadioButton);
        IOSJavaRadioButton.setText("IOS Java");

        NyelvButtonGroup.add(MSJavaRadioButton);
        MSJavaRadioButton.setText("Microsoft Java");

        NyelvButtonGroup.add(JavaRadioButton);
        JavaRadioButton.setSelected(true);
        JavaRadioButton.setText("Java");

        javax.swing.GroupLayout NyelvPanelLayout = new javax.swing.GroupLayout(NyelvPanel);
        NyelvPanel.setLayout(NyelvPanelLayout);
        NyelvPanelLayout.setHorizontalGroup(
            NyelvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NyelvPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NyelvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JavaRadioButton)
                    .addComponent(MSJavaRadioButton)
                    .addComponent(IOSJavaRadioButton))
                .addContainerGap())
        );
        NyelvPanelLayout.setVerticalGroup(
            NyelvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NyelvPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JavaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MSJavaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IOSJavaRadioButton)
                .addContainerGap())
        );

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        Menu.setText("Config");

        BetoltMenuItem.setText("Betolt");
        BetoltMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetoltMenuItemActionPerformed(evt);
            }
        });
        Menu.add(BetoltMenuItem);

        MentMenuItem.setText("Ment...");
        MentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MentMenuItemActionPerformed(evt);
            }
        });
        Menu.add(MentMenuItem);
        Menu.add(Separator);

        KilepMenuItem.setText("Kilépés");
        Menu.add(KilepMenuItem);

        MenuBar.add(Menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IdkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NyelvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResetButton)
                            .addComponent(HirlevelCheckBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HirlevelCheckBox)
                        .addGap(67, 67, 67)
                        .addComponent(ResetButton))
                    .addComponent(NyelvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        IdkComboBox.setSelectedIndex(0);
        NyelvButtonGroup.setSelected(JavaRadioButton.getModel(), true);
        HirlevelCheckBox.setSelected(false);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void MentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MentMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(rootPane) == JFileChooser.APPROVE_OPTION)
        {
            try (
                FileOutputStream fos = new FileOutputStream(fc.getSelectedFile());
                ObjectOutputStream oos = new ObjectOutputStream(fos)
            )
            {
                oos.writeObject(HirlevelCheckBox);
            }
            catch (IOException ex)
            {
                Logger.getLogger(ConfigGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MentMenuItemActionPerformed

    private void BetoltMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetoltMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(rootPane) == JFileChooser.APPROVE_OPTION)
        {
            try (
                FileInputStream fis = new FileInputStream(fc.getSelectedFile());
                ObjectInputStream ois = new ObjectInputStream(fis)
            )
            {
                HirlevelCheckBox.setSelected(((JCheckBox)ois.readObject()).isSelected());
            }
            catch (IOException | ClassNotFoundException ex)
            {
                Logger.getLogger(ConfigGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BetoltMenuItemActionPerformed

    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(ConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new ConfigGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BetoltMenuItem;
    private javax.swing.JCheckBox HirlevelCheckBox;
    private javax.swing.JRadioButton IOSJavaRadioButton;
    private javax.swing.JComboBox<String> IdkComboBox;
    private javax.swing.JRadioButton JavaRadioButton;
    private javax.swing.JMenuItem KilepMenuItem;
    private javax.swing.JRadioButton MSJavaRadioButton;
    private javax.swing.JMenuItem MentMenuItem;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.ButtonGroup NyelvButtonGroup;
    private javax.swing.JPanel NyelvPanel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JPopupMenu.Separator Separator;
    // End of variables declaration//GEN-END:variables

    private static class FileFilterImpl implements FileFilter {

        public FileFilterImpl() {
        }

        @Override
        public boolean accept(File pathname) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

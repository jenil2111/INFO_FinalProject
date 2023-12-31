/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package veiw;

import javax.swing.JFrame;

/**
 *
 * @author Purvam Sheth
 */
public class LogoutPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogoutPanel
     */
    JFrame mainFrame;
    public LogoutPanel(JFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        assignButton = new javax.swing.JPanel();
        assignButtonLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(973, 600));
        setMinimumSize(new java.awt.Dimension(973, 600));
        setPreferredSize(new java.awt.Dimension(973, 600));

        questionLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        questionLabel.setText("Are you sure?");

        assignButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignButtonMouseClicked(evt);
            }
        });

        assignButtonLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        assignButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignButtonLabel.setText("Click here to logout!");

        javax.swing.GroupLayout assignButtonLayout = new javax.swing.GroupLayout(assignButton);
        assignButton.setLayout(assignButtonLayout);
        assignButtonLayout.setHorizontalGroup(
            assignButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        assignButtonLayout.setVerticalGroup(
            assignButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(539, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignButtonMouseClicked
        // TODO add your handling code here:
        mainFrame.dispose();
    }//GEN-LAST:event_assignButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignButton;
    private javax.swing.JLabel assignButtonLabel;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}

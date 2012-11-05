/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sikuli.ide;

/**
 *
 * @author rhocke
 */
public class PreferencesWindowMore extends javax.swing.JPanel {

  /**
   * Creates new form NewPref
   */
  public PreferencesWindowMore() {
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

    jTextField1 = new javax.swing.JTextField();
    jToggleButton1 = new javax.swing.JToggleButton();
    buttonGroup1 = new javax.swing.ButtonGroup();
    buttonGroup2 = new javax.swing.ButtonGroup();
    jCheckBox4 = new javax.swing.JCheckBox();
    jPanel1 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    prefMoreLblSave = new javax.swing.JLabel();
    prefMoreHTML = new javax.swing.JCheckBox();
    prefMoreClean = new javax.swing.JCheckBox();
    prefMoreLblRun = new javax.swing.JLabel();
    prefMoreRunSave = new javax.swing.JCheckBox();
    prefMoreLblImages = new javax.swing.JLabel();
    prefMoreImages = new javax.swing.JCheckBox();
    prefMoreImagesPath = new javax.swing.JTextField();
    prefMoreHighlight = new javax.swing.JCheckBox();
    jSeparator1 = new javax.swing.JSeparator();
    jSeparator2 = new javax.swing.JSeparator();
    jSeparator3 = new javax.swing.JSeparator();
    jSeparator4 = new javax.swing.JSeparator();
    jPanel2 = new javax.swing.JPanel();
    prefMoreBtnOk = new javax.swing.JButton();
    prefMoreLblTitle = new javax.swing.JLabel();
    jSeparator5 = new javax.swing.JSeparator();

    jTextField1.setText("jTextField1");

    jToggleButton1.setText("jToggleButton1");

    jCheckBox4.setText("jCheckBox4");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 100, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 100, Short.MAX_VALUE)
    );

    jButton1.setText("jButton1");

    jButton2.setText("jButton2");

    prefMoreLblSave.setText("Options on Save");

    prefMoreHTML.setText("create HTML");
    prefMoreHTML.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreHTMLStateChanged(evt);
      }
    });

    prefMoreClean.setText("delete not used images");
    prefMoreClean.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreCleanStateChanged(evt);
      }
    });

    prefMoreLblRun.setText("Options on Run");

    prefMoreRunSave.setText("autosave all");
    prefMoreRunSave.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreRunSaveStateChanged(evt);
      }
    });

    prefMoreLblImages.setText("Where to store images?");

    prefMoreImages.setText("use a global Repository");
    prefMoreImages.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreImagesStateChanged(evt);
      }
    });

    prefMoreImagesPath.setText("PathToRepository");
    prefMoreImagesPath.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prefMoreImagesPathActionPerformed(evt);
      }
    });

    prefMoreHighlight.setText("always highlight");
    prefMoreHighlight.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreHighlightStateChanged(evt);
      }
    });

    prefMoreBtnOk.setText("Save");
    prefMoreBtnOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prefMoreBtnOkActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(prefMoreBtnOk)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
        .add(0, 6, Short.MAX_VALUE)
        .add(prefMoreBtnOk))
    );

    prefMoreLblTitle.setText("Preferences: more options ...");

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(192, 192, 192)
        .add(prefMoreLblTitle)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .add(jSeparator1))
          .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(32, 32, 32)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(prefMoreLblRun)
              .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(prefMoreLblSave)
                  .add(prefMoreLblImages))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(prefMoreImages)
                  .add(layout.createSequentialGroup()
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                      .add(prefMoreHTML)
                      .add(prefMoreRunSave))
                    .add(75, 75, 75)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                      .add(prefMoreClean)
                      .add(prefMoreHighlight)))))
              .add(prefMoreImagesPath, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(jSeparator2))
          .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator3)
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(jSeparator4))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(jSeparator5)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(0, 0, 0)
        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(prefMoreLblTitle)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(prefMoreClean)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
            .add(prefMoreLblSave)
            .add(prefMoreHTML)))
        .add(4, 4, 4)
        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(4, 4, 4)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(prefMoreLblRun, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(prefMoreRunSave)
          .add(prefMoreHighlight))
        .add(5, 5, 5)
        .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(3, 3, 3)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(prefMoreLblImages)
          .add(prefMoreImages))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(prefMoreImagesPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void prefMoreImagesPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefMoreImagesPathActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreImagesPathActionPerformed

  private void prefMoreBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefMoreBtnOkActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreBtnOkActionPerformed

  private void prefMoreHighlightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreHighlightStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreHighlightStateChanged

  private void prefMoreCleanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreCleanStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreCleanStateChanged

  private void prefMoreHTMLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreHTMLStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreHTMLStateChanged

  private void prefMoreRunSaveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreRunSaveStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreRunSaveStateChanged

  private void prefMoreImagesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreImagesStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreImagesStateChanged

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JButton prefMoreBtnOk;
  private javax.swing.JCheckBox prefMoreClean;
  private javax.swing.JCheckBox prefMoreHTML;
  private javax.swing.JCheckBox prefMoreHighlight;
  private javax.swing.JCheckBox prefMoreImages;
  private javax.swing.JTextField prefMoreImagesPath;
  private javax.swing.JLabel prefMoreLblImages;
  private javax.swing.JLabel prefMoreLblRun;
  private javax.swing.JLabel prefMoreLblSave;
  private javax.swing.JLabel prefMoreLblTitle;
  private javax.swing.JCheckBox prefMoreRunSave;
  // End of variables declaration//GEN-END:variables
}

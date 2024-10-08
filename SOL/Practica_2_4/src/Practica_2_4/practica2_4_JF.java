package Practica_2_4;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class practica2_4_JF extends javax.swing.JFrame {

    public practica2_4_JF() {
        initComponents();
        tickVerde1.setVisible(false);
        tickVerde2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        PanelFondo = new javax.swing.JPanel();
        campoTexto1_1 = new javax.swing.JTextField();
        campoTexto2_1 = new javax.swing.JTextField();
        comboElementos1 = new javax.swing.JComboBox<>();
        checkBoton1_1 = new javax.swing.JCheckBox();
        checkBoton2_1 = new javax.swing.JCheckBox();
        checkBoton3_1 = new javax.swing.JCheckBox();
        Slider1 = new javax.swing.JSlider();
        toggleBoton1 = new javax.swing.JToggleButton();
        radioBoton1_1 = new javax.swing.JRadioButton();
        radioBoton2_1 = new javax.swing.JRadioButton();
        radioBoton3_1 = new javax.swing.JRadioButton();
        textoCorreo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        radioBoton1_2 = new javax.swing.JRadioButton();
        radioBoton2_2 = new javax.swing.JRadioButton();
        radioBoton3_2 = new javax.swing.JRadioButton();
        textoCorreo2 = new javax.swing.JLabel();
        checkBoton1_2 = new javax.swing.JCheckBox();
        checkBoton2_2 = new javax.swing.JCheckBox();
        checkBoton3_2 = new javax.swing.JCheckBox();
        comboElementos2 = new javax.swing.JComboBox<>();
        campoTexto1_2 = new javax.swing.JTextField();
        campoTexto2_2 = new javax.swing.JTextField();
        toggleBoton2 = new javax.swing.JToggleButton();
        Slider2 = new javax.swing.JSlider();
        Spinner1 = new javax.swing.JSpinner();
        Spinner2 = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        tickVerde1 = new javax.swing.JLabel();
        tickVerde2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI mixta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        campoTexto1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto1_1ActionPerformed(evt);
            }
        });
        campoTexto1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTexto1_1KeyReleased(evt);
            }
        });

        campoTexto2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto2_1ActionPerformed(evt);
            }
        });
        campoTexto2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTexto2_1KeyReleased(evt);
            }
        });

        comboElementos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pDet1", "pDet2", "pDet3" }));
        comboElementos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboElementos1ActionPerformed(evt);
            }
        });

        checkBoton1_1.setText("Opcion 4");
        checkBoton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoton1_1ActionPerformed(evt);
            }
        });

        checkBoton2_1.setText("Opcion 5");
        checkBoton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoton2_1ActionPerformed(evt);
            }
        });

        checkBoton3_1.setText("Opcion 6");
        checkBoton3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoton3_1ActionPerformed(evt);
            }
        });

        Slider1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Slider1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Slider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Slider1MouseReleased(evt);
            }
        });

        toggleBoton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvdor\\OneDrive\\Documentos\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-RVarelaD\\SOL\\Practica_2_4\\src\\Fotos\\b_off.png")); // NOI18N
        toggleBoton1.setRolloverEnabled(false);
        toggleBoton1.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\dvdor\\OneDrive\\Documentos\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-RVarelaD\\SOL\\Practica_2_4\\src\\Fotos\\b_on.png")); // NOI18N
        toggleBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBoton1ActionPerformed(evt);
            }
        });

        radioBoton1_1.setText("Opcion 1");
        radioBoton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton1_1ActionPerformed(evt);
            }
        });

        radioBoton2_1.setText("Opcion 2");
        radioBoton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton2_1ActionPerformed(evt);
            }
        });

        radioBoton3_1.setText("Opcion 3");
        radioBoton3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoton3_1ActionPerformed(evt);
            }
        });

        textoCorreo1.setText("Correo");

        radioBoton1_2.setText("Opcion 1");
        radioBoton1_2.setEnabled(false);

        radioBoton2_2.setText("Opcion 2");
        radioBoton2_2.setEnabled(false);

        radioBoton3_2.setText("Opcion 3");
        radioBoton3_2.setEnabled(false);

        textoCorreo2.setText("Correo");
        textoCorreo2.setEnabled(false);

        checkBoton1_2.setText("Opcion 4");
        checkBoton1_2.setEnabled(false);

        checkBoton2_2.setText("Opcion 5");
        checkBoton2_2.setEnabled(false);

        checkBoton3_2.setText("Opcion 6");
        checkBoton3_2.setEnabled(false);

        comboElementos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pDet1", "pDet2", "pDet3" }));
        comboElementos2.setEnabled(false);

        campoTexto1_2.setEnabled(false);

        campoTexto2_2.setEnabled(false);

        toggleBoton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvdor\\OneDrive\\Documentos\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-RVarelaD\\SOL\\Practica_2_4\\src\\Fotos\\b_off.png")); // NOI18N
        toggleBoton2.setEnabled(false);
        toggleBoton2.setRolloverEnabled(false);
        toggleBoton2.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\dvdor\\OneDrive\\Documentos\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-RVarelaD\\SOL\\Practica_2_4\\src\\Fotos\\b_on.png")); // NOI18N

        Slider2.setEnabled(false);

        Spinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner1StateChanged(evt);
            }
        });
        Spinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Spinner1MouseReleased(evt);
            }
        });

        Spinner2.setEnabled(false);

        tickVerde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/tickVerde (1).png"))); // NOI18N

        tickVerde2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/tickVerde (1).png"))); // NOI18N
        tickVerde2.setEnabled(false);

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                        .addComponent(radioBoton3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                        .addComponent(textoCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)))
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addComponent(checkBoton3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboElementos1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(campoTexto2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tickVerde1))))
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addComponent(radioBoton1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBoton1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addComponent(radioBoton2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBoton2_1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTexto1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                .addComponent(toggleBoton1)
                                .addGap(57, 57, 57)))
                        .addGap(27, 27, 27))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addComponent(textoCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(campoTexto2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tickVerde2))
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioBoton3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBoton2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBoton1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoton2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkBoton1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTexto1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addComponent(checkBoton3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboElementos2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                .addComponent(toggleBoton2)
                                .addGap(59, 59, 59))
                            .addComponent(Slider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkBoton1_1)
                                    .addComponent(radioBoton1_1)))
                            .addComponent(campoTexto1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoton2_1)
                            .addComponent(radioBoton2_1)
                            .addComponent(Spinner1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoton3_1)
                            .addComponent(comboElementos1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBoton3_1)))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(Slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTexto2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCorreo1))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                .addComponent(Slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toggleBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioBoton1_2)
                                    .addComponent(checkBoton1_2)
                                    .addComponent(campoTexto1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBoton2_2)
                                        .addComponent(radioBoton2_2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboElementos2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBoton3_2)
                                    .addComponent(radioBoton3_2))
                                .addGap(33, 33, 33)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoTexto2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tickVerde2))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(tickVerde1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBoton3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton3_1ActionPerformed
        radioBoton3_2.setSelected(radioBoton3_1.isSelected());
    }//GEN-LAST:event_radioBoton3_1ActionPerformed

    private void radioBoton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton2_1ActionPerformed
        radioBoton2_2.setSelected(radioBoton2_1.isSelected());
    }//GEN-LAST:event_radioBoton2_1ActionPerformed

    private void radioBoton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoton1_1ActionPerformed
        radioBoton1_2.setSelected(radioBoton1_1.isSelected());
    }//GEN-LAST:event_radioBoton1_1ActionPerformed

    private void toggleBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBoton1ActionPerformed
        toggleBoton2.setSelected(toggleBoton1.isSelected());
    }//GEN-LAST:event_toggleBoton1ActionPerformed

    private void Slider1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Slider1AncestorAdded

    }//GEN-LAST:event_Slider1AncestorAdded

    private void checkBoton3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoton3_1ActionPerformed
        checkBoton3_2.setSelected(checkBoton3_1.isSelected());
    }//GEN-LAST:event_checkBoton3_1ActionPerformed

    private void checkBoton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoton2_1ActionPerformed
        checkBoton2_2.setSelected(checkBoton2_1.isSelected());
    }//GEN-LAST:event_checkBoton2_1ActionPerformed

    private void checkBoton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoton1_1ActionPerformed
        checkBoton1_2.setSelected(checkBoton1_1.isSelected());
    }//GEN-LAST:event_checkBoton1_1ActionPerformed

    private void comboElementos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboElementos1ActionPerformed
        comboElementos2.setSelectedIndex(comboElementos1.getSelectedIndex());
    }//GEN-LAST:event_comboElementos1ActionPerformed

    private void campoTexto2_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTexto2_1KeyReleased
        campoTexto2_2.setText(campoTexto2_1.getText());

        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        if (!campoTexto2_1.getText().trim().matches(regex)) {
            campoTexto2_1.setBorder(new LineBorder(Color.RED));
            campoTexto2_2.setBorder(new LineBorder(Color.RED));
            tickVerde1.setVisible(false);
            tickVerde2.setVisible(false);
            return;
        }

        campoTexto2_1.setBorder(new LineBorder(Color.GREEN));
        campoTexto2_2.setBorder(new LineBorder(Color.GREEN));
        tickVerde1.setVisible(true);
        tickVerde2.setVisible(true);

    }//GEN-LAST:event_campoTexto2_1KeyReleased

    private void campoTexto2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto2_1ActionPerformed

    }//GEN-LAST:event_campoTexto2_1ActionPerformed

    private void campoTexto1_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTexto1_1KeyReleased
        String textoOriginal = campoTexto1_1.getText();
        String textoInvertido = "";

        for (int i = textoOriginal.length() - 1; i >= 0; i--) {
            textoInvertido += textoOriginal.charAt(i);
        }

        campoTexto1_2.setText(textoInvertido);
    }//GEN-LAST:event_campoTexto1_1KeyReleased

    private void campoTexto1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto1_1ActionPerformed

    }//GEN-LAST:event_campoTexto1_1ActionPerformed

    private void Slider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Slider1MouseReleased
        Slider2.setValue(Slider1.getValue());
    }//GEN-LAST:event_Slider1MouseReleased

    private void Spinner1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Spinner1MouseReleased

    }//GEN-LAST:event_Spinner1MouseReleased

    private void Spinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner1StateChanged
        Spinner2.setValue(Spinner1.getValue());
    }//GEN-LAST:event_Spinner1StateChanged

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
            java.util.logging.Logger.getLogger(practica2_4_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica2_4_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica2_4_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica2_4_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica2_4_JF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JSlider Slider1;
    private javax.swing.JSlider Slider2;
    private javax.swing.JSpinner Spinner1;
    private javax.swing.JSpinner Spinner2;
    private javax.swing.JTextField campoTexto1_1;
    private javax.swing.JTextField campoTexto1_2;
    private javax.swing.JTextField campoTexto2_1;
    private javax.swing.JTextField campoTexto2_2;
    private javax.swing.JCheckBox checkBoton1_1;
    private javax.swing.JCheckBox checkBoton1_2;
    private javax.swing.JCheckBox checkBoton2_1;
    private javax.swing.JCheckBox checkBoton2_2;
    private javax.swing.JCheckBox checkBoton3_1;
    private javax.swing.JCheckBox checkBoton3_2;
    private javax.swing.JComboBox<String> comboElementos1;
    private javax.swing.JComboBox<String> comboElementos2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioBoton1_1;
    private javax.swing.JRadioButton radioBoton1_2;
    private javax.swing.JRadioButton radioBoton2_1;
    private javax.swing.JRadioButton radioBoton2_2;
    private javax.swing.JRadioButton radioBoton3_1;
    private javax.swing.JRadioButton radioBoton3_2;
    private javax.swing.JLabel textoCorreo1;
    private javax.swing.JLabel textoCorreo2;
    private javax.swing.JLabel tickVerde1;
    private javax.swing.JLabel tickVerde2;
    private javax.swing.JToggleButton toggleBoton1;
    private javax.swing.JToggleButton toggleBoton2;
    // End of variables declaration//GEN-END:variables
}

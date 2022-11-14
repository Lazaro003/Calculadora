
package es.ideas.vista;

import es.ideas.modelo.Modelo;

import java.awt.Dimension;
import java.awt.Font;



public class Vista extends javax.swing.JFrame {
Modelo modelo = new Modelo();
String funciones = "-+.*/";
String cValidos = "0123456789-+.*/";

    
    public Vista() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operandos = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bMas = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bMulti = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bComa = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfResultado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelTexto = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b2.setText("2");
        b2.setToolTipText("");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bMas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bMas.setText("+");
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bMenos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bMulti.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bMulti.setText("*");
        bMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiActionPerformed(evt);
            }
        });

        bDiv.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bComa.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bComa.setText(".");
        bComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComaActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bBorrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bBorrar.setText("C");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMas, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bComa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bComa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        tfResultado.setEditable(false);
        tfResultado.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        panelTexto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        panelTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panelTextoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(panelTexto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfResultado)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presentadorModificarModelo(Double n1, Double n2, String operacion){ //Modificar datos modelo
        modelo.setN1(n1);
        modelo.setN2(n2);
        modelo.setOperacion(operacion);
    }
    
    private void presentadorCalcularModelo(){ //Hacer operaciones desde datos de modelo
        if ("+".equals(modelo.getOperacion())){
            modelo.setRes(modelo.getN1() + modelo.getN2());
        }
        if ("-".equals(modelo.getOperacion())){
            modelo.setRes(modelo.getN1() - modelo.getN2());
        }
        if ("/".equals(modelo.getOperacion())){
            modelo.setRes(modelo.getN1() / modelo.getN2());
        }
        if ("*".equals(modelo.getOperacion())){
            modelo.setRes(modelo.getN1() * modelo.getN2());
        }
        
    }
       
    private void presentadorActualizarTexto(){
        tfResultado.setText(modelo.getRes() + "");
    }
    
    private void presentadorComprobarOp(){ //Comprobar si se encuentran los dos números con el operando para proceder a calcular el resultado
        if(panelTexto.getText().split("-").length > 1){
            String[] datos = panelTexto.getText().split("-");
            Double n1 = Double.valueOf(datos[0]);
            Double n2 = Double.valueOf(datos[1]);
            presentadorModificarModelo(n1,n2,"-");
            presentadorCalcularModelo();
            presentadorActualizarTexto();
        }
        if(panelTexto.getText().split("\\+").length > 1){
            String[] datos = panelTexto.getText().split("\\+");
            Double n1 = Double.valueOf(datos[0]);
            Double n2 = Double.valueOf(datos[1]);
            presentadorModificarModelo(n1,n2,"+");
            presentadorCalcularModelo();
            presentadorActualizarTexto();
        }
        if(panelTexto.getText().split("\\*").length > 1){
            String[] datos = panelTexto.getText().split("\\*");
            Double n1 = Double.valueOf(datos[0]);
            Double n2 = Double.valueOf(datos[1]);
            presentadorModificarModelo(n1,n2,"*");
            presentadorCalcularModelo();
            presentadorActualizarTexto();
        }
        if(panelTexto.getText().split("/").length > 1){
            String[] datos = panelTexto.getText().split("/");
            Double n1 = Double.valueOf(datos[0]);
            Double n2 = Double.valueOf(datos[1]);
            presentadorModificarModelo(n1,n2,"/");
            presentadorCalcularModelo();
            presentadorActualizarTexto();
        }
    }
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "1");
        presentadorComprobarOp();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "2");
        presentadorComprobarOp();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "3");
        presentadorComprobarOp();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "4");
        presentadorComprobarOp();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "5");
        presentadorComprobarOp();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "6");
        presentadorComprobarOp();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "7");
        presentadorComprobarOp();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "8");
        presentadorComprobarOp();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "9");
        presentadorComprobarOp();
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        panelTexto.setText(panelTexto.getText() +  "0");
        presentadorComprobarOp();
    }//GEN-LAST:event_b0ActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        String str = panelTexto.getText();
        panelTexto.setText(str.substring(0, str.length()-1)); //Settea como texto el anterior menos 1
        presentadorComprobarOp();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComaActionPerformed
        String txt = panelTexto.getText();
        char uC = txt.charAt(txt.length() - 1);
        if (!funciones.contains(uC + "")){
            panelTexto.setText(panelTexto.getText() +  ".");
        } //Sumo "" para que lo coja como string
        
    }//GEN-LAST:event_bComaActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        String txt = panelTexto.getText();
        char uC = txt.charAt(txt.length() - 1);
        if (!funciones.contains(uC + "")){
            panelTexto.setText(panelTexto.getText() +  "/");
        } //Sumo "" para que lo coja como string
    }//GEN-LAST:event_bDivActionPerformed

    private void bMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiActionPerformed
        String txt = panelTexto.getText();
        char uC = txt.charAt(txt.length() - 1);
        if (!funciones.contains(uC + "")){
            panelTexto.setText(panelTexto.getText() +  "*");
        } //Sumo "" para que lo coja como string
    }//GEN-LAST:event_bMultiActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        String txt = panelTexto.getText();
        char uC = txt.charAt(txt.length() - 1);
        if (!funciones.contains(uC + "")){
            panelTexto.setText(panelTexto.getText() +  "-");
        } //Sumo "" para que lo coja como string
    }//GEN-LAST:event_bMenosActionPerformed

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        String txt = panelTexto.getText();
        char uC = txt.charAt(txt.length() - 1);
        if (!funciones.contains(uC + "")){
            panelTexto.setText(panelTexto.getText() +  "+");
        } //Sumo "" para que lo coja como string
    }//GEN-LAST:event_bMasActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        Dimension comp = this.getSize(); //Alternativa a ComponentListener, que viene ya integrado en Swing
        Font fuente = null;
        if (comp.width < 800 && comp.height < 800){
        fuente = new Font("Segoe UI", Font. PLAIN, 20);
        }
        if (comp.width > 800 && comp.height > 800){
        fuente = new Font("Segoe UI", Font. PLAIN, 32);
        }
        if (comp.width > 1000 && comp.height > 1000){
        fuente = new Font("Segoe UI", Font. PLAIN, 40);
        }

        
        tfResultado.setFont(fuente);
        panelTexto.setFont(fuente);
        b0.setFont(fuente);
        b1.setFont(fuente);
        b2.setFont(fuente);
        b3.setFont(fuente);
        b4.setFont(fuente);
        b5.setFont(fuente);
        b6.setFont(fuente);
        b7.setFont(fuente);
        b8.setFont(fuente);
        b9.setFont(fuente);
        bBorrar.setFont(fuente);
        bComa.setFont(fuente);
        bDiv.setFont(fuente);
        bMas.setFont(fuente);
        bMenos.setFont(fuente);
        bMulti.setFont(fuente);
    }//GEN-LAST:event_formComponentResized

    private void panelTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelTextoKeyTyped

        String c = evt.getKeyChar() + ""; //Alternativa a keylistener de Swing
        if (!cValidos.contains(c)){
            
            evt.consume();
        }
        presentadorComprobarOp();
    }//GEN-LAST:event_panelTextoKeyTyped


    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bComa;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bMulti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup operandos;
    private javax.swing.JTextPane panelTexto;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}

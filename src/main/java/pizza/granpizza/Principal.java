
package pizza.granpizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Dana
 */
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        
        progreso.setText(" "); //borrar contenido de etiqueta del progreso del pedido
        
        //Junta los radio buttons en un mismo grupo llamado pizzas
        pizzas.add(pC);
        pizzas.add(pCl);
        pizzas.add(pH);
        pizzas.add(pM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pizzas = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        pC = new javax.swing.JRadioButton();
        pM = new javax.swing.JRadioButton();
        pH = new javax.swing.JRadioButton();
        pCl = new javax.swing.JRadioButton();
        btn_aceptar = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        btn_pedido = new javax.swing.JButton();
        progreso = new javax.swing.JLabel();
        ingredientes = new javax.swing.JTextField();
        sub1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setText("La Gran Pizza");

        pizzas.add(pC);
        pC.setText("Pizza Chicago");

        pizzas.add(pM);
        pM.setText("Pizza Mexicana");

        pizzas.add(pH);
        pH.setText("Pizza Hawaii");

        pizzas.add(pCl);
        pCl.setText("Pizza Classica");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_pedido.setText("Volver a pedir");
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        progreso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        sub1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sub1.setText("Seleccione el tipo de pizza a ordenar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pM)
                    .addComponent(pC)
                    .addComponent(pH)
                    .addComponent(pCl)
                    .addComponent(sub1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_aceptar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ingredientes))
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_pedido)
                            .addComponent(barra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(sub1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCl)
                .addGap(18, 18, 18)
                .addComponent(btn_aceptar)
                .addGap(32, 32, 32)
                .addComponent(ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pedido)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicializar variables para la barra
    int start = 0;
    Timer timer = null;
    
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
         Pizza pizza1 = new Pizza("Pizza Chicago", "Extra queso, Jamon Serrano, Aceitunas");
        Pizza pizza2 = new Pizza("Pizza Mexicana", "Jalapeños, Chorizo, Carne molida");
        Pizza pizza3 = new Pizza("Pizza Hawaii", "Jamon y Piña");
        Pizza pizza4 = new Pizza("Pizza Classica", "Pepperoni y Salchicha");

        //Regresar barra a cero
        timer = null; //regresa a nulo el timer
        start=0; // se regresa a cero el contador
        barra.setValue(start); //se le da el valor del contador a la barra
       
            if(pizzas.getSelection()!=null){ //Revisa si hay pizzas seleccionadas
                // avance de la barra de progreso
             timer = new Timer(200, new ActionListener(){ //El contador avanza cada 200 milisegundos
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     start++; //Se incrementa la variable start
                     if(start>0 && start<100){ // acciones mientras start sea menor que 100 o mayor que 0
                         //Estados del pedido segun el avance de la barra de progreso
                         if (start>0 && start<15){
                             progreso.setText("En pedido...");
                         }
                         if (start>20 && start<55){
                             progreso.setText("En armado...");
                             
                             // Ingresa los ingredientes segun la pizza seleccionada
                             if(pC.isSelected() == true){
                             ingredientes.setText("Ingredientes: "+ pizza1.getIngrediente());
                             }else if(pCl.isSelected() == true){
                             ingredientes.setText("Ingredientes: "+ pizza2.getIngrediente());
                            }else if(pH.isSelected() == true){
                             ingredientes.setText("Ingredientes: "+ pizza3.getIngrediente());
                            }else if(pM.isSelected() == true){
                             ingredientes.setText("Ingredientes: "+ pizza4.getIngrediente());
                            }
                             
                         }
                         if (start>55 && start<75){
                             progreso.setText("En horno...");
                             ingredientes.setText(" ");
                         }
                         if (start>75 && start<90){
                             progreso.setText("En empacado...");
                             ingredientes.setText(" ");
                         }
                         if (start>90 && start<100){
                             progreso.setText("Entregado al cliente");
                             ingredientes.setText(" ");
                         }
                     }else if(start==100){ //accion a hacer cuando start llegue a 100
                         timer.stop(); //detiene el timer
                     }
                     barra.setValue(start); //aumenta el valor de la barra en cada vuelta
                 }
             });
             timer.start(); //inicia el timer
            } else { //Accion en caso de que no seleccionen una pizza
                JOptionPane.showMessageDialog(null, "Selecciona una pizza"); // mensaje en caso de que no hayan seleccionado una pizza antes de pedir
            }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
         if(barra == null){
        start=0; // se regresa a cero el contador
        barra.setValue(start); //se le da el valor del contador a la barra
        progreso.setText(" "); //borrar contenido de etiqueta del progreso del pedido
        timer.stop(); //detiene el progreso de la barra
        timer = null; //regresa a nulo el timer
        ingredientes.setText(" "); //Limpia el texto de ingredientes
        pizzas.clearSelection(); // Quita la selecci[on de las pizzas  
        } else {
            JOptionPane.showMessageDialog(null, "Espera a que termine el pedido"); // espera en caso de que el pedido no haya acabado de hacerse
        }
    }//GEN-LAST:event_btn_pedidoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_pedido;
    private javax.swing.JTextField ingredientes;
    private javax.swing.JRadioButton pC;
    private javax.swing.JRadioButton pCl;
    private javax.swing.JRadioButton pH;
    private javax.swing.JRadioButton pM;
    private javax.swing.ButtonGroup pizzas;
    private javax.swing.JLabel progreso;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

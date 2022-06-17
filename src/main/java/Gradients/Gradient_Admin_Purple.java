
package Gradients;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author soggs
 */
public class Gradient_Admin_Purple extends javax.swing.JPanel {

    /**
     * Creates new form Gradient
     */
    public Gradient_Admin_Purple() {
        initComponents();
        setOpaque(false);
    }
   
    
    
    
    
    public void paintComponent(Graphics g)
{
   
    Graphics2D g2= (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
   
    
    super.paintComponent(g);
    
    int width = getWidth();
    int height = getHeight();
   // 140,140,249
   //124,124,244
   
   
   
   
    Color color1 = new Color(123, 127, 245);
    Color color2 = new Color(215, 215, 252);
    GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
    g2.setPaint(gp);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
    g2.setColor(new Color(255,255,255,50));
    
    g2.fillOval(getWidth()-(getWidth()/2),10,getHeight(),getHeight());
    g2.fillOval(getWidth()-(getWidth()/2)-20,getHeight()/2+20,getHeight(),getHeight());
    super.paintComponent(g);
    
    

   
    
    

}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

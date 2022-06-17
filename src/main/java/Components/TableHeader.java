
package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class TableHeader extends JLabel {
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        setBackground(Color.white);
        setFont(new Font ("Microsoft YaHei UI",1,12));
        setForeground(new Color(102,102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));

    
//    @Override
//     protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        grphcs.setColor(new Color(230, 230, 230));
//        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
//    }  
        
    }
    
    
@Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
    
    
}

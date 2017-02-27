
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob Stevens
 */
public class TitleCipher extends JPanel
{
    JPanel vert = new JPanel(new GridLayout(1, 2));
    
    public TitleCipher()
    {
        JLabel label;
        JLabel label1;
        //ImageIcon Cipherpic = new ImageIcon(getClass().getResource("/Picture/CRW.gif"));
        label = new JLabel("Custom Cipher");
        label.setFont(new Font("", Font.BOLD, 30));
        //label1 = new JLabel(Cipherpic);
        
        
        vert.add(label);
        //vert.add(label1);
        add(vert);
    }
}


import java.awt.Color;
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
public class TitleFrame extends JPanel
{

    public TitleFrame()
    {
        JPanel verttitle = new JPanel(new GridLayout(1, 2));
        ImageIcon Cipherpic = new ImageIcon(getClass().getResource("/Picture/enigma.png"));
        JLabel label1 = new JLabel("    The Great Enigma Cipher  ");
        label1.setFont(new Font("", Font.BOLD, 25));
        JLabel label2 = new JLabel(Cipherpic);
        verttitle.add(label1);
        verttitle.add(label2);
        add(verttitle);
        verttitle.setBackground(Color.LIGHT_GRAY);
    }

}

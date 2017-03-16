
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class Plugboard extends JPanel
{
    String userfileinput;
    String userkeyboardinput;
    
    private ActionListener KB = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            userkeyboardinput = JOptionPane.showInputDialog(null,"What would you like to encode?");
        }
    };
    private ActionListener file = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFileChooser jfc = new JFileChooser();
            int showup = jfc.showOpenDialog(jfc);
            userfileinput = jfc.toString();
        }
    };
   
    public Plugboard()
    {
        JRadioButton bfile = new JRadioButton("File");
        JRadioButton bkey = new JRadioButton("Keyboard");
        JLabel jl4 = new JLabel("  Enter Plugboard Settings");
        JPanel vert2 = new JPanel();
        vert2.setLayout(new GridLayout(7, 1));
        JTextArea jta = new JTextArea(5,3);
        bkey.addActionListener(KB);
        bfile.addActionListener(file);
        vert2.add(jl4);
        vert2.add(jta);
        vert2.add(bfile);
        vert2.add(bkey);
        add(vert2);
        vert2.setBackground(Color.LIGHT_GRAY);
        bfile.setBackground(Color.LIGHT_GRAY);
        bkey.setBackground(Color.LIGHT_GRAY);
    }
}
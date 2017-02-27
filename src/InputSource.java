//The files that have the saved encrypted and decrypted files are in CipherTests
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob Stevens
 */

//Found how to read file here: 
public class InputSource extends JPanel
{
    private String userfileinput;
    private String userkeyboardinput;
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
    public String getkeyboardinput()
    {
        return userkeyboardinput;
    }

    public String getUserfileinput()
    {
        return userfileinput;
    }
    
    public InputSource()
    {
        JLabel j1 = new JLabel();
        JLabel j2 = new JLabel();
        JLabel j3 = new JLabel();
        JLabel j4 = new JLabel();
        JLabel jl = new JLabel("  Input Source");
        JPanel vert = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        vert.setLayout(new GridLayout(7, 1));
        JRadioButton b1 = new JRadioButton("File");
        JRadioButton b2 = new JRadioButton("Keyboard");
        bg.add(b1);
        bg.add(b2);
        b1.addActionListener(file);
        b2.addActionListener(KB);
        vert.add(j1);
        vert.add(j2);
        vert.add(j3);
        vert.add(j4);
        vert.add(jl);
        vert.add(b1);
        vert.add(b2);

        add(vert);
    }
    
}

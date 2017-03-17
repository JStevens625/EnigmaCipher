
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
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
public class EncodeDecode extends JPanel
{
    JRadioButton encode = new JRadioButton("Encode");
    JRadioButton decode = new JRadioButton("Decode");
    private static int select = 0;
    
    
    public static void setSelect(int value) {
        select = value;
    }
    
    public int getSelect() {
        return select;
    }
    private ActionListener selectencode = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            EncodeDecode.setSelect(1);
        }
    };
    private ActionListener selectdecode = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            EncodeDecode.setSelect(2);
        }
    };
    
    public EncodeDecode()
    {
        
        encode.addActionListener(selectencode);
        decode.addActionListener(selectdecode);
        JLabel jspace1 = new JLabel();
        JLabel jspace2 = new JLabel();
        JPanel vert1 = new JPanel();
        ButtonGroup bg1 = new ButtonGroup();
        vert1.setLayout(new GridLayout(4,1,0,40));
        bg1.add(encode);
        bg1.add(decode);
        vert1.add(jspace1);
        vert1.add(encode);
        vert1.add(jspace2);
        vert1.add(decode);
        add(vert1);
        encode.setBackground(Color.LIGHT_GRAY);
        decode.setBackground(Color.LIGHT_GRAY);
        vert1.setBackground(Color.LIGHT_GRAY);
    }
    
    
}


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class CipherWheels extends JPanel
{
    public CipherWheels(){
        JRadioButton b1 = new JRadioButton("Cipher One");
        JRadioButton b2 = new JRadioButton("Cipher Two");
        JRadioButton b3 = new JRadioButton("Cipher Three");
        JRadioButton b4 = new JRadioButton("Cipher Four");
        JRadioButton b5 = new JRadioButton("Cipher Five");
        JRadioButton b6 = new JRadioButton("Cipher One");
        JRadioButton b7 = new JRadioButton("Cipher Two");
        JRadioButton b8 = new JRadioButton("Cipher Three");
        JRadioButton b9 = new JRadioButton("Cipher Four");
        JRadioButton b10 = new JRadioButton("Cipher Five");
        JRadioButton b11 = new JRadioButton("Cipher One");
        JRadioButton b12 = new JRadioButton("Cipher Two");
        JRadioButton b13 = new JRadioButton("Cipher Three");
        JRadioButton b14 = new JRadioButton("Cipher Four");
        JRadioButton b15 = new JRadioButton("Cipher Five");
        Integer[] nums = new Integer[27];
        for(int i = 0; i < 27; i++)
        {
            nums[i] = i + 1;
        }
        JComboBox jcb1 = new JComboBox(nums);
        JComboBox jcb2 = new JComboBox(nums);
        JComboBox jcb3 = new JComboBox(nums);
        JLabel j1 = new JLabel("Inner Start");
        JLabel j2 = new JLabel("Middle Start");
        JLabel j3 = new JLabel("Outer Start");
        JLabel j4 = new JLabel();
        JLabel j5 = new JLabel();
        JLabel j6 = new JLabel();
        JLabel jl1 = new JLabel("   Inner Wheel");
        JLabel jl2 = new JLabel("   Middle Wheel");
        JLabel jl3 = new JLabel("   Outer Wheel");
        JPanel vert = new JPanel();
        ButtonGroup bg3 = new ButtonGroup();
        ButtonGroup bg4 = new ButtonGroup();
        ButtonGroup bg5 = new ButtonGroup();
        
        vert.setLayout(new GridLayout(9,3,0,10));
        
        bg3.add(b1);
        bg3.add(b2);
        bg3.add(b3);
        bg3.add(b4);
        bg3.add(b5);
        
        bg4.add(b6);
        bg4.add(b7);
        bg4.add(b8);
        bg4.add(b9);
        bg4.add(b10);
        
        bg5.add(b11);
        bg5.add(b12);
        bg5.add(b13);
        bg5.add(b14);
        bg5.add(b15);
                
        vert.add(jl1);
        vert.add(jl2);
        vert.add(jl3);
        
        vert.add(b1);
        vert.add(b6);
        vert.add(b11);

        vert.add(b2);
        vert.add(b7);
        vert.add(b12);
        
        
        vert.add(b3);
        vert.add(b8);
        vert.add(b13);
        
        vert.add(b4);
        vert.add(b9);
        vert.add(b14);
        
        vert.add(b5);
        vert.add(b10);
        vert.add(b15);
        
        vert.add(j4);
        vert.add(j5);
        vert.add(j6);
        
        vert.add(j1);
        vert.add(j2);
        vert.add(j3);
        
        vert.add(jcb1);
        vert.add(jcb2);
        vert.add(jcb3);
        
        add(vert);
        
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        vert.setBackground(Color.LIGHT_GRAY);
    }
}

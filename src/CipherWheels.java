
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
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
public class CipherWheels extends JPanel
{
    private static JComboBox jcb1;
    private static JComboBox jcb2;
    private static JComboBox jcb3;
    private static int value1;
    private static int value2;
    private static int value3;
    private static int selectedCipher1;
    private static int selectedCipher2;
    private static int selectedCipher3;

    public static void setChipher(int cipher, int value)
    {
        switch(cipher) {
            case 1:
                selectedCipher1 = value;
                break;
            case 2:
                selectedCipher2 = value;
                break;
            case 3:
                selectedCipher3 = value;
                break;
            default:
                System.err.println("Invalid Value Input: " + cipher);
                break;
        }
    }

    public int getChipher(int cipher) {
        switch(cipher) {
            case 1:
                return selectedCipher1;
            case 2:
                return selectedCipher2;
            case 3:
                return selectedCipher3;
            default:
                System.err.println("Invalid Value Input: " + cipher);
                return 0;
        }
    }



    public static void setSelectedBoxValue(int comboBox, int value) {
      switch (comboBox) {
            case 1:
              value1 =  value;
              break;
            case 2:
              value2 =  value;
              break;
            case 3:
              value3 =  value;
              break;
            default:
              System.err.println("Unsupported Value: " + value);
        }
    }
    public int getComboBoxValue(int comboBox) {
      switch (comboBox) {
            case 1:
              return value1;
            case 2:
              return value2;
            case 3:
              return value3;
            default:
              System.err.println("Unsupprted Value Range: " + comboBox);
              return 0;
        }
    }
    // public ActionListener comboListener = new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent ae) {
    //         CipherWheels.setSelectedBoxValue()
    //     }
    //
    // };
    public ActionListener cipher1 = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {

        }
    };
    public ActionListener cipher2 = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {

        }
    };
    public ActionListener cipher3 = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            
        }
    };
    public CipherWheels(){
        JRadioButton b1 = new JRadioButton("1");
        b1.addActionListener(new CipherPicker(1));
        JRadioButton b2 = new JRadioButton("2");
        b2.addActionListener(new CipherPicker(1));
        JRadioButton b3 = new JRadioButton("3");
        b3.addActionListener(new CipherPicker(1));
        JRadioButton b4 = new JRadioButton("4");
        b4.addActionListener(new CipherPicker(1));
        JRadioButton b5 = new JRadioButton("5");
        b5.addActionListener(new CipherPicker(1));
        JRadioButton b6 = new JRadioButton("1");
        b6.addActionListener(new CipherPicker(2));
        JRadioButton b7 = new JRadioButton("2");
        b7.addActionListener(new CipherPicker(2));
        JRadioButton b8 = new JRadioButton("3");
        b8.addActionListener(new CipherPicker(2));
        JRadioButton b9 = new JRadioButton("4");
        b9.addActionListener(new CipherPicker(2));
        JRadioButton b10 = new JRadioButton("5");
        b10.addActionListener(new CipherPicker(2));
        JRadioButton b11 = new JRadioButton("1");
        b11.addActionListener(new CipherPicker(3));
        JRadioButton b12 = new JRadioButton("2");
        b12.addActionListener(new CipherPicker(3));
        JRadioButton b13 = new JRadioButton("3");
        b13.addActionListener(new CipherPicker(3));
        JRadioButton b14 = new JRadioButton("4");
        b14.addActionListener(new CipherPicker(3));
        JRadioButton b15 = new JRadioButton("5");
        b15.addActionListener(new CipherPicker(3));
        Integer[] nums = new Integer[27];
        for(int i = 0; i < 27; i++)
        {
            nums[i] = i + 1;
        }
        jcb1 = new JComboBox(nums);
        jcb2 = new JComboBox(nums);
        jcb3 = new JComboBox(nums);
        jcb1.addActionListener(new ComboListener(1));
        jcb2.addActionListener(new ComboListener(2));
        jcb3.addActionListener(new ComboListener(3));
        JLabel j1 = new JLabel("Inner Start");
        JLabel j2 = new JLabel("Middle Start");
        JLabel j3 = new JLabel("Outer Start");
        JLabel j4 = new JLabel();
        JLabel j5 = new JLabel();
        JLabel j6 = new JLabel();
        JLabel jl1 = new JLabel("   Inner Wheel");
        JLabel jl2 = new JLabel("   Middle Wheel");
        JLabel jl3 = new JLabel("   Outer Wheel");
        JPanel vert = new JPanel();
        ButtonGroup bg3 = new ButtonGroup();
        ButtonGroup bg4 = new ButtonGroup();
        ButtonGroup bg5 = new ButtonGroup();

        vert.setLayout(new GridLayout(9,3,0,10));

        bg3.add(b1);
        bg3.add(b2);
        bg3.add(b3);
        bg3.add(b4);
        bg3.add(b5);

        bg4.add(b6);
        bg4.add(b7);
        bg4.add(b8);
        bg4.add(b9);
        bg4.add(b10);

        bg5.add(b11);
        bg5.add(b12);
        bg5.add(b13);
        bg5.add(b14);
        bg5.add(b15);

        vert.add(jl1);
        vert.add(jl2);
        vert.add(jl3);

        vert.add(b1);
        vert.add(b6);
        vert.add(b11);

        vert.add(b2);
        vert.add(b7);
        vert.add(b12);


        vert.add(b3);
        vert.add(b8);
        vert.add(b13);

        vert.add(b4);
        vert.add(b9);
        vert.add(b14);

        vert.add(b5);
        vert.add(b10);
        vert.add(b15);

        vert.add(j4);
        vert.add(j5);
        vert.add(j6);

        vert.add(j1);
        vert.add(j2);
        vert.add(j3);

        vert.add(jcb1);
        vert.add(jcb2);
        vert.add(jcb3);

        add(vert);

        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        vert.setBackground(Color.LIGHT_GRAY);
    }
}

class ComboListener implements ActionListener {
  private int number;

  public ComboListener(int boxNumber) {
    number = boxNumber;
  }
  @Override
  public void actionPerformed(ActionEvent ae) {
    CipherWheels.setSelectedBoxValue(number, (int)((JComboBox) ae.getSource()).getSelectedItem());
  }
}
class CipherPicker implements ActionListener{

    private int selectedCipher;
    public CipherPicker(int buttonnum)
    {
        selectedCipher = buttonnum;
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        CipherWheels.setChipher(selectedCipher, Integer.parseInt(((JRadioButton) ae.getSource()).getText()));
    }
}

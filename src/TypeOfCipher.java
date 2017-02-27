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
/*
 *
 * @author Jacob Stevens
 */
public class TypeOfCipher extends JPanel
{
    JRadioButton b1 = new JRadioButton("Caesar");
    JRadioButton b2 = new JRadioButton("Substitution");
    JRadioButton b3 = new JRadioButton("Rotation");
    protected static String selectedButton;

    public TypeOfCipher()
    {
        JLabel j1 = new JLabel();
        JLabel j2 = new JLabel();
        JLabel j3 = new JLabel();
        JLabel j4 = new JLabel();
        JLabel jl = new JLabel("  Type of Cipher");
        JPanel vert = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        vert.setLayout(new GridLayout(8, 1));
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        vert.add(j1);
        vert.add(j2);
        vert.add(j3);
        vert.add(j4);
        vert.add(jl);
        vert.add(b1);
        vert.add(b2);
        vert.add(b3);
        add(vert);
        b1.addActionListener(new RadioListener());
        b2.addActionListener(new RadioListener());
        b3.addActionListener(new RadioListener());
    }
    public String getSelected() {
      return selectedButton;
    }

    class RadioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            selectedButton = ((JRadioButton) ae.getSource()).getText();
        }
    }
}
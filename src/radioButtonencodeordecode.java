
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
public class radioButtonencodeordecode extends JPanel
{
    JRadioButton encode = new JRadioButton("Encode");
    JRadioButton decode = new JRadioButton("Decode");
    protected static String select;
    
    public radioButtonencodeordecode()
    {
        JLabel j1 = new JLabel();
        JLabel j2 = new JLabel();
        JLabel j3 = new JLabel();
        JLabel j4 = new JLabel();
        JLabel jl = new JLabel("        Mode");
        JPanel vert = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        vert.setLayout(new GridLayout(7,1));
        bg.add(encode);
        bg.add(decode);
        vert.add(j1);
        vert.add(j2);
        vert.add(j3);
        vert.add(j4);
        vert.add(jl);
        vert.add(encode);
        vert.add(decode);
        add(vert);
        encode.addActionListener(new RadioListener());
        decode.addActionListener(new RadioListener());
    }
    public String getSelected()
    {
        return select;
    }
    
    class RadioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            select = ((JRadioButton) ae.getSource()).getText();
        }
    }
}

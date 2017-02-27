
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class textfieldwithsubmitbutton extends JPanel
{
    JTextField jtf = new JTextField(26);
    TypeOfCipher tc = new TypeOfCipher();
    radioButtonencodeordecode ecdc = new radioButtonencodeordecode();
    InputSource is = new InputSource();

    private ActionListener submited = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String selected = tc.getSelected();
            System.out.println("Button " + selected + " Was Selected");
            selected = ecdc.getSelected();
            System.out.println("Button " + selected + " Was Selected");
            if(ecdc.encode.isSelected()){
                if(tc.b1.isSelected()){
                    is.getkeyboardinput();
                }
                if(tc.b2.isSelected()){
                    is.getkeyboardinput();

                }
                if(tc.b3.isSelected()){
                    is.getkeyboardinput();

                }
            }
            if(ecdc.encode.isSelected()){
                if(tc.b1.isSelected()){
                    is.getkeyboardinput();
                }
                if(tc.b2.isSelected()){
                    is.getkeyboardinput();
                }
                if(tc.b3.isSelected()){
                    is.getkeyboardinput();
                }
            }
        }
    };

    public textfieldwithsubmitbutton()
    {
        jtf.setHorizontalAlignment(JTextField.LEFT);
        add(jtf,BorderLayout.EAST);
        JButton jb = new JButton("Encode/Decode");
        add(jb,BorderLayout.WEST);
        jb.addActionListener(submited);

    }
}

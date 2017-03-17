
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.nashorn.internal.ir.BreakNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob Stevens
 */
public class Submit extends JPanel
{

    EncodeDecode ed = new EncodeDecode();

    private ActionListener submit = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            try {
                //Found solution to save file from http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
                if (ed.getSelect() == 0) {
                    JOptionPane.showMessageDialog(null, "Please Select encode or decode");
                }
                else {
                    String nameit = JOptionPane.showInputDialog("What will the File name be?");
                    File statText = new File(nameit + ".txt");
                    FileOutputStream is = new FileOutputStream(statText);
                    OutputStreamWriter osw = new OutputStreamWriter(is);
                    Writer writing = new BufferedWriter(osw);
                    if (ed.getSelect() == 1) {
                        writing.write("");
                    }
                    else if (ed.getSelect() == 2) {
                        writing.write("");
                    }
                    writing.close();
                    JOptionPane.showMessageDialog(null, "Your message has encoded/decoded");

                }
            } catch (IOException f) {
            }
        }
    };

    public Submit()
    {
        JButton jb = new JButton("Begin The Coding Process");
        jb.addActionListener(submit);
        add(jb);
    }
}

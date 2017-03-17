
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
public class Submit extends JPanel
{

    Enigma en = new Enigma();
    EncodeDecode ed = new EncodeDecode();
    Plugboard pb = new Plugboard();

    // private ActionListener submit = new ActionListener()
    // {
    //     public void actionPerformed(ActionEvent e)
    //     {
    //         try {
    //             //Found solution to save file from http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
    //             if (ed.getSelect() == 0) {
    //                 JOptionPane.showMessageDialog(null, "Please Select encode or decode");
    //             }
    //             else {
    //                 System.err.println(pb.getPlugboardText());
    //                 String nameit = JOptionPane.showInputDialog("What will the File name be?");
    //                 File statText = new File(nameit + ".txt");
    //                 FileOutputStream is = new FileOutputStream(statText);
    //                 OutputStreamWriter osw = new OutputStreamWriter(is);
    //                 Writer writing = new BufferedWriter(osw);
    //                 if (ed.getSelect() == 1) {
    //                     writing.write("");
    //                 }
    //                 else if (ed.getSelect() == 2) {
    //                     writing.write("");
    //                 }
    //                 writing.close();
    //                 JOptionPane.showMessageDialog(null, "Your message has encoded/decoded");
    //
    //             }
    //         } catch (IOException f) {
    //         }
    //     }
    // };
    public Submit()
    {
        JButton jb = new JButton("Begin The Coding Process");
        jb.addActionListener(new SubmitLlistener(pb, ed));
        add(jb);
    }
}

class SubmitLlistener implements ActionListener
{

    private Plugboard inputPlugboard;
    private EncodeDecode inputEncodeDecode;
    public SubmitLlistener(Plugboard inputPlugboard, EncodeDecode inputEncodeDecode)
    {
        super();
        this.inputPlugboard = inputPlugboard;
        this.inputEncodeDecode = inputEncodeDecode;
    }

    public void actionPerformed(ActionEvent e)
    {
        try {
            //Found solution to save file from http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
            if (inputEncodeDecode.getSelect() == 0) {
                JOptionPane.showMessageDialog(null, "Please Select encode or decode");
            }
            else {
                System.err.println(inputPlugboard.getPlugboardText());
                String nameit = JOptionPane.showInputDialog("What will the File name be?");
                File statText = new File(nameit + ".txt");
                FileOutputStream is = new FileOutputStream(statText);
                OutputStreamWriter osw = new OutputStreamWriter(is);
                Writer writing = new BufferedWriter(osw);
                if (inputEncodeDecode.getSelect() == 1) {
                    writing.write("");
                }
                else if (inputEncodeDecode.getSelect() == 2) {
                    writing.write("");
                }
                writing.close();
                JOptionPane.showMessageDialog(null, "Your message has encoded/decoded");

            }
        } catch (IOException f) {
        }
    }
}

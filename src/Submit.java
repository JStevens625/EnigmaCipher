
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

    EncodeDecode ed = new EncodeDecode();
    Plugboard pb = new Plugboard();


    public Submit()
    {
        JButton jb = new JButton("Begin The Coding Process");
        jb.addActionListener(new SubmitListener(pb, ed));
        add(jb);
    }
}

class SubmitListener implements ActionListener
{
    String finalencode;
    String finaldecode;
    CipherWheels cw = new CipherWheels();
    Enigma en = new Enigma();
    Plugboard pb = new Plugboard();
    private Plugboard inputPlugboard;
    private EncodeDecode inputEncodeDecode;
    public SubmitListener(Plugboard inputPlugboard, EncodeDecode inputEncodeDecode)
    {
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
                System.out.println("Box 1: " + cw.getComboBoxValue(1));
                System.out.println("Box 2: " + cw.getComboBoxValue(2));
                System.out.println("Box 3: " + cw.getComboBoxValue(3));
                System.out.println("Cipher 1 Selected Value: " + cw.getChipher(1));
                System.out.println("Plug Board Text Recieved: " + inputPlugboard.getPlugboardText());
                System.err.println(inputPlugboard.getPlugboardText());
                String nameit = JOptionPane.showInputDialog("What will the File name be?");
                File statText = new File("src/Coded/" + nameit + ".txt");
                FileOutputStream is = new FileOutputStream(statText);
                OutputStreamWriter osw = new OutputStreamWriter(is);
                Writer writing = new BufferedWriter(osw);
                if (inputEncodeDecode.getSelect() == 1) {
                    if (pb.getchoice() == 1) {
                        finalencode = en.encode(pb.getUserfileinput(), cw.getComboBoxValue(1), cw.getComboBoxValue(2), cw.getComboBoxValue(3), cw.getChipher(1), cw.getChipher(2), cw.getChipher(3),pb.getPlugboardText());
                        writing.write(finalencode);
                    }
                    else {
                        finalencode = en.encode(pb.getUserkeyboardinput(), cw.getComboBoxValue(1), cw.getComboBoxValue(2), cw.getComboBoxValue(3), cw.getChipher(1), cw.getChipher(2), cw.getChipher(3),pb.getPlugboardText());
                        writing.write(finalencode);
                    }
                }
                else if (inputEncodeDecode.getSelect() == 2) {
                    if (pb.getchoice() == 1) {
                        finalencode = en.decode(pb.getUserfileinput(), cw.getComboBoxValue(1), cw.getComboBoxValue(2), cw.getComboBoxValue(3), cw.getChipher(1), cw.getChipher(2), cw.getChipher(3),pb.getPlugboardText());
                        writing.write(finaldecode);
                    }
                    else {
                        finalencode = en.decode(pb.getUserkeyboardinput(), cw.getComboBoxValue(1), cw.getComboBoxValue(2), cw.getComboBoxValue(3), cw.getChipher(1), cw.getChipher(2), cw.getChipher(3),pb.getPlugboardText());
                        writing.write(finaldecode);
                    }
                }
                writing.close();
                JOptionPane.showMessageDialog(null, "Your message has encoded/decoded");

            }
        } catch (IOException f) {
        }
    }
}

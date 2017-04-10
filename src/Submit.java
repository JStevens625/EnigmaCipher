
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
    String finalencode = "";
    String finaldecode = "";
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
                //en.keyCreation(cw.getChipher(1), cw.getChipher(2), cw.getChipher(3));
                System.out.println("Box 1: " + cw.getComboBoxValue(1));
                System.out.println("Box 2: " + cw.getComboBoxValue(2));
                System.out.println("Box 3: " + cw.getComboBoxValue(3));
                System.out.println("Cipher 1 Selected Value: " + cw.getChipher(1));
                System.out.println("Cipher 2 Selected Value: " + cw.getChipher(2));
                System.out.println("Cipher 3 Selected Value: " + cw.getChipher(3));
                System.out.println("Plug Board Text Recieved: " + inputPlugboard.getPlugboardText());
                System.err.println(inputPlugboard.getPlugboardText());
                String nameit = JOptionPane.showInputDialog("What will the File name be?");
                File statText = new File("src/Coded/" + nameit + ".txt");
                FileOutputStream is = new FileOutputStream(statText);
                OutputStream os = new FileOutputStream(new File("src/Coded/" + nameit + ".txt"));
                if (inputEncodeDecode.getSelect() == 1) {
                    if (pb.getchoice() == 1) {
                        System.out.println(pb.getUserfileinput());
                        finalencode = en.encode(pb.getUserfileinput(), pb.getPlugboardText(), cw.getChipher(3), cw.getChipher(2), cw.getChipher(1), cw.getComboBoxValue(3), cw.getComboBoxValue(2), cw.getComboBoxValue(1));
                        char[] encodedString = finalencode.toCharArray();
                        for (int i = 0; i < encodedString.length; i++) {
                          os.write((char) encodedString[i]);
                        }
                        System.out.println(finalencode);
                    }
                    else {
                        System.out.println(pb.getUserkeyboardinput());
                        System.out.println("Before encode");
                        finalencode = en.encode(pb.getUserkeyboardinput(), pb.getPlugboardText(), cw.getChipher(3), cw.getChipher(2), cw.getChipher(1), cw.getComboBoxValue(3), cw.getComboBoxValue(2), cw.getComboBoxValue(1));
                        System.out.println("After Decode");
                        char[] encodedString = finalencode.toCharArray();
                        for (int i = 0; i < encodedString.length; i++) {
                          os.write((char) encodedString[i]);
                        }
                        System.out.println(finalencode);
                    }
                }
                else if (inputEncodeDecode.getSelect() == 2) {
                    if (pb.getchoice() == 1) {
                        System.out.println(pb.getUserfileinput());
                        finaldecode = en.decode(pb.getUserfileinput(), pb.getPlugboardText(), cw.getChipher(3), cw.getChipher(2), cw.getChipher(1), cw.getComboBoxValue(3), cw.getComboBoxValue(2), cw.getComboBoxValue(1));
                        char[] encodedString = finaldecode.toCharArray();
                        for (int i = 0; i < encodedString.length; i++) {
                          os.write((char) encodedString[i]);
                        }
                        System.out.println(finaldecode);
                    }
                    else {
                        System.out.println(pb.getUserkeyboardinput());
                        finaldecode = en.decode(pb.getUserkeyboardinput(), pb.getPlugboardText(), cw.getChipher(3), cw.getChipher(2), cw.getChipher(1), cw.getComboBoxValue(3), cw.getComboBoxValue(2), cw.getComboBoxValue(1));
                        char[] encodedString = finaldecode.toCharArray();
                        for (int i = 0; i < encodedString.length; i++) {
                          os.write((char) encodedString[i]);
                        }
                        System.out.println(finaldecode);
                    }
                }
                os.close();
                JOptionPane.showMessageDialog(null, "Your message has encoded/decoded");

            }
        } catch (IOException f) {}
    }
}

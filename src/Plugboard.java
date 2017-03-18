
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class Plugboard extends JPanel
{
    JRadioButton bfile = new JRadioButton("File");
    JRadioButton bkey = new JRadioButton("Keyboard");
    private static String userfileinput;
    private static String userkeyboardinput;
    private static String plugboardstringin;
    private static String inputMessage;
    private static int inputchoice = 0;
    JTextArea jta = new JTextArea(5,3);

    public static void setUserfileinput(String e)
    {
        userfileinput = e;
    }
    public static void setUserkeyboardinput(String e)
    {
        userkeyboardinput = e;
    }

    public static void setInputMessage(String e)
    {
        inputMessage = e;
    }
    

    public String getUserfileinput()
    {
        return userfileinput;
    }
    public String getUserkeyboardinput()
    {
        return userkeyboardinput;
    }
    public String getInputMessage()
    {
        return inputMessage;
    }
    
    public static void setchoice(int choice)
    {
        inputchoice = choice;
    }
    public int getchoice()
    {
        return inputchoice;
    }
    
    private ActionListener inputfile = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            Plugboard.setchoice(1);
        }
    };
    private ActionListener inputkeyboard = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            Plugboard.setchoice(2);
        }
    };

    private ActionListener KB = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            userkeyboardinput = JOptionPane.showInputDialog(null,"What would you like to encode?");
        }
    };
    private ActionListener file = new ActionListener()
    {
        //Found how to set default directory from here: http://stackoverflow.com/questions/5721504/jfilechooser-set-directory-to-a-path-in-a-file
        public void actionPerformed(ActionEvent e)
        {
            File Directory = new File("src/Coded/");
            File file;
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(Directory);
            int showup = jfc.showOpenDialog(jfc);
            file = jfc.getSelectedFile();
            InputStream is;
            String input = new String();
            try {
                is = new FileInputStream(file);
                try {
                    int c;
                    while((c = is.read())!= -1) {
                        input += (char) c;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Plugboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Plugboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            Plugboard.setUserfileinput(input);
            System.out.println(input);
        }
    };
    public static void setPlugboard(String plugboard) {
      plugboardstringin = plugboard;
    }
    public String getPlugboardText() {
      return plugboardstringin;
    }
    
    public Plugboard()
    {
        
        ButtonGroup bg = new ButtonGroup();
        JLabel jl4 = new JLabel("  Enter Plugboard Settings");
        JPanel vert2 = new JPanel();
        vert2.setLayout(new GridLayout(7, 1));
        bkey.addActionListener(KB);
        bfile.addActionListener(file);
        jta.addKeyListener(new kl());
        bg.add(bkey);
        bg.add(bfile);
        vert2.add(jl4);
        vert2.add(jta);
        vert2.add(bfile);
        vert2.add(bkey);
        add(vert2);
        vert2.setBackground(Color.LIGHT_GRAY);
        bfile.setBackground(Color.LIGHT_GRAY);
        bkey.setBackground(Color.LIGHT_GRAY);
    }
}

class kl implements KeyListener {
    @Override
    public void keyTyped(KeyEvent ke)
    {
        System.out.println("Key Typed: " + ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("Key Pressed: " + ke.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        Plugboard.setPlugboard(((JTextArea)ke.getSource()).getText());
    }
}

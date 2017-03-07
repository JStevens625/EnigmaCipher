/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainFrame extends JFrame
{

    JPanel title = new JPanel();
    JPanel verttitle = new JPanel(new GridLayout(1, 2));
    ImageIcon IC = new ImageIcon();
    Clip music;
    AudioInputStream ais;

    public MainFrame()
    {
        //Beginning of TitleFrame
        JLabel label;
        JLabel label1;
        //ImageIcon Cipherpic = new ImageIcon(getClass().getResource("/Picture/CRW.gif"));
        label = new JLabel("Custom Cipher");
        label.setFont(new Font("", Font.BOLD, 30));
        //label1 = new JLabel(Cipherpic);
        verttitle.add(label);
        //vert.add(label1);
        title.add(verttitle);
        //Ending to TitleFrame

        
        //Beginning of InputSource
        JPanel Inputchoice = new JPanel();
        String userfileinput;
        String userkeyboardinput;
        JLabel j9 = new JLabel();
        JLabel j10 = new JLabel();
        JLabel j11 = new JLabel();
        JLabel j12 = new JLabel();
        JLabel jl2 = new JLabel("  Input Source");
        JPanel vert2 = new JPanel();
        ButtonGroup bg2 = new ButtonGroup();
        vert2.setLayout(new GridLayout(7, 1));
        JRadioButton b4 = new JRadioButton("File");
        JRadioButton b5 = new JRadioButton("Keyboard");
        bg2.add(b4);
        bg2.add(b5);
        vert2.add(j9);
        vert2.add(j10);
        vert2.add(j11);
        vert2.add(j12);
        vert2.add(jl2);
        vert2.add(b4);
        vert2.add(b5);
        Inputchoice.add(vert2);
        //End of InputSource
        
        
        //Beginning of Type of Cipher
        JPanel TOC = new JPanel();
        JRadioButton b1 = new JRadioButton("Caesar");
        JRadioButton b2 = new JRadioButton("Substitution");
        JRadioButton b3 = new JRadioButton("Rotation");
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
        TOC.add(vert);
        //End of Type of Cipher
        
        
        //Beginning of encodeordecode
        JPanel endebutton = new JPanel();
        JRadioButton encode = new JRadioButton("Encode");
        JRadioButton decode = new JRadioButton("Decode");
        JLabel j5 = new JLabel();
        JLabel j6 = new JLabel();
        JLabel j7 = new JLabel();
        JLabel j8 = new JLabel();
        JLabel jl1 = new JLabel("        Mode");
        JPanel vert1 = new JPanel();
        ButtonGroup bg1 = new ButtonGroup();
        vert1.setLayout(new GridLayout(7, 1));
        bg1.add(encode);
        bg1.add(decode);
        vert1.add(j5);
        vert1.add(j6);
        vert1.add(j7);
        vert1.add(j8);
        vert1.add(jl1);
        vert1.add(encode);
        vert1.add(decode);
        endebutton.add(vert1);
        //End of encodeordecode

        
        //Beginning of textfield and submit
        JPanel jptextwithsubmit = new JPanel();
        JTextField jtf = new JTextField(26);
        jtf.setHorizontalAlignment(JTextField.LEFT);
        jptextwithsubmit.add(jtf, BorderLayout.EAST);
        JButton jb = new JButton("Encode/Decode");
        jptextwithsubmit.add(jb, BorderLayout.WEST);
        //End of textfield and submit

        
        //Full MainFrame
        setTitle("Substitution Cipher");
        setSize(550, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Aligns window to center of screen. Found it here: http://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        add(title, BorderLayout.NORTH);
        add(TOC, BorderLayout.CENTER);
        add(Inputchoice, BorderLayout.EAST);
        add(endebutton, BorderLayout.WEST);
        add(jptextwithsubmit, BorderLayout.SOUTH);

//        try{music = AudioSystem.getClip();
//            ais = AudioSystem.getAudioInputStream(getClass().getResource("Music/IS.aiff"));
//            music.open(ais);
//            music.loop(Clip.LOOP_CONTINUOUSLY);
//        }catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {}

        setVisible(true);
    }
}

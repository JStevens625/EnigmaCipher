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
import java.awt.Color;
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
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class MainFrame extends JFrame
{
    
    JPanel title = new JPanel();
    JPanel verttitle = new JPanel(new GridLayout(1,2));
    JPanel jptextwithsubmit = new JPanel();
    ImageIcon IC = new ImageIcon();
    Clip music;
    AudioInputStream ais;
    String userfileinput;
    String userkeyboardinput;
    JPanel endebutton = new JPanel();
    JPanel TOC = new JPanel();
    JPanel Inputchoice = new JPanel();
    
    private ActionListener KB = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            userkeyboardinput = JOptionPane.showInputDialog(null,"What would you like to encode?");
        }
    };
    private ActionListener file = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFileChooser jfc = new JFileChooser();
            int showup = jfc.showOpenDialog(jfc);
            userfileinput = jfc.toString();
        }
    };

    public MainFrame()
    {
        //Beginning of TitleFrame
        JLabel label;
        JLabel label1;
        ImageIcon Cipherpic = new ImageIcon(getClass().getResource("/Picture/enigma.png"));
        label = new JLabel("    The Great Enigma Cipher  ");
        label.setFont(new Font("", Font.BOLD, 25));
        label1 = new JLabel(Cipherpic);
        verttitle.add(label);
        verttitle.add(label1);
        title.add(verttitle);
        //Ending to TitleFrame

        
        //Beginning of Plugboard
        JRadioButton bfile = new JRadioButton("File");
        JRadioButton bkey = new JRadioButton("Keyboard");
        JLabel jl4 = new JLabel("  Enter Plugboard Settings");
        JPanel vert2 = new JPanel();
        vert2.setLayout(new GridLayout(7, 1));
        JTextArea jta = new JTextArea(5,3);
        bkey.addActionListener(KB);
        bfile.addActionListener(file);
        vert2.add(jl4);
        vert2.add(jta);
        vert2.add(bfile);
        vert2.add(bkey);

        Inputchoice.add(vert2);
        //End of Plugboard
        
        
        //Beginning of Cipher Wheels
        JRadioButton b1 = new JRadioButton("Cipher One");
        JRadioButton b2 = new JRadioButton("Cipher Two");
        JRadioButton b3 = new JRadioButton("Cipher Three");
        JRadioButton b4 = new JRadioButton("Cipher Four");
        JRadioButton b5 = new JRadioButton("Cipher Five");
        JRadioButton b6 = new JRadioButton("Cipher One");
        JRadioButton b7 = new JRadioButton("Cipher Two");
        JRadioButton b8 = new JRadioButton("Cipher Three");
        JRadioButton b9 = new JRadioButton("Cipher Four");
        JRadioButton b10 = new JRadioButton("Cipher Five");
        JRadioButton b11 = new JRadioButton("Cipher One");
        JRadioButton b12 = new JRadioButton("Cipher Two");
        JRadioButton b13 = new JRadioButton("Cipher Three");
        JRadioButton b14 = new JRadioButton("Cipher Four");
        JRadioButton b15 = new JRadioButton("Cipher Five");
        Integer[] nums = new Integer[27];
        for(int i = 0; i < 27; i++){
            nums[i] = i + 1;
        }
        JComboBox jcb1 = new JComboBox(nums);
        JComboBox jcb2 = new JComboBox(nums);
        JComboBox jcb3 = new JComboBox(nums);
        JLabel j1 = new JLabel();
        JLabel j2 = new JLabel();
        JLabel j3 = new JLabel();
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
        
        vert.setLayout(new GridLayout(9,3,0,15));
        
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
        
        vert.add(jcb1);
        vert.add(jcb2);
        vert.add(jcb3);
        
        TOC.add(vert);
        //End of Cipher Wheels
        
        
        //Beginning of encodeordecode
        JRadioButton encode = new JRadioButton("Encode");
        JRadioButton decode = new JRadioButton("Decode");
        JLabel jspace = new JLabel();
        JPanel vert1 = new JPanel();
        ButtonGroup bg1 = new ButtonGroup();
        vert1.setLayout(new GridLayout(3,1,0,100));
        bg1.add(encode);
        bg1.add(decode);
        vert1.add(jspace);
        vert1.add(jspace);
        vert1.add(encode);
        vert1.add(decode);
        endebutton.add(vert1);
        //End of encodeordecode

        
        //Beginning of JButton Coding
        JButton jb = new JButton("Begin The Coding Process");
        jptextwithsubmit.add(jb);
        //End of JButton Coding

        
        //Full MainFrame
        setTitle("Substitution Cipher");
        setSize(700, 600);
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

        // Beginning of Colors
        title.setBackground(Color.LIGHT_GRAY);
        verttitle.setBackground(Color.LIGHT_GRAY);
        Inputchoice.setBackground(Color.LIGHT_GRAY);
        bfile.setBackground(Color.LIGHT_GRAY);
        bkey.setBackground(Color.LIGHT_GRAY);
        vert2.setBackground(Color.LIGHT_GRAY);
        TOC.setBackground(Color.LIGHT_GRAY);
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
        endebutton.setBackground(Color.LIGHT_GRAY);
        encode.setBackground(Color.LIGHT_GRAY);
        decode.setBackground(Color.LIGHT_GRAY);
        vert1.setBackground(Color.LIGHT_GRAY);
        jptextwithsubmit.setBackground(Color.LIGHT_GRAY);
        //End of Colors

        setVisible(true);
        setResizable(false);
    }
}
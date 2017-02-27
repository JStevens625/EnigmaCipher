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
import java.awt.Toolkit;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame
{
    ImageIcon IC = new ImageIcon();
    Clip music;
    AudioInputStream ais;

    public MainFrame()
    {
        setTitle("Substitution Cipher");
        setSize(550, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Aligns window to center of screen. Found it here: http://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        TitleCipher tc = new TitleCipher();
        textfieldwithsubmitbutton ci = new textfieldwithsubmitbutton();
        radioButtonencodeordecode ed = new radioButtonencodeordecode();
        TypeOfCipher toc = new TypeOfCipher();
        InputSource is = new InputSource();

        add(tc, BorderLayout.NORTH);
        add(toc, BorderLayout.CENTER);
        add(is, BorderLayout.EAST);
        add(ed, BorderLayout.WEST);
        add(ci, BorderLayout.SOUTH);
        
//        try{
//            music = AudioSystem.getClip();
//            ais = AudioSystem.getAudioInputStream(getClass().getResource("Music/IS.aiff"));
//            music.open(ais);
//            music.loop(Clip.LOOP_CONTINUOUSLY);
//                    
//        }
//        catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {}

        setVisible(true);
    }
}
